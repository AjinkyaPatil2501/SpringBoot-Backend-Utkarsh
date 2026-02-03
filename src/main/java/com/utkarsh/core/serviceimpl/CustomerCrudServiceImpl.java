package com.utkarsh.core.serviceimpl;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.utkarsh.core.dao.CastMasterDao;
import com.utkarsh.core.dao.CityMasterDao;
import com.utkarsh.core.dao.CompanyContactKycDao;
import com.utkarsh.core.dao.CompanyCustomerDetailsDao;
import com.utkarsh.core.dao.CompanyPartnersDao;
import com.utkarsh.core.dao.CountryMasterDao;
import com.utkarsh.core.dao.CustomerAddressDao;
import com.utkarsh.core.dao.CustomerAssetsDao;
import com.utkarsh.core.dao.CustomerAuditLogDao;
import com.utkarsh.core.dao.CustomerKycDao;
import com.utkarsh.core.dao.CustomerMasterDao;
import com.utkarsh.core.dao.CustomerOccupationDao;
import com.utkarsh.core.dao.DistrictMasterDao;
import com.utkarsh.core.dao.EducationMasterDao;
import com.utkarsh.core.dao.OccupationMasterDao;
import com.utkarsh.core.dao.ReligionMasterDao;
import com.utkarsh.core.dao.StateMasterDao;
import com.utkarsh.core.dao.TalukaMasterDao;
import com.utkarsh.core.dao.WardMasterDao;
import com.utkarsh.core.dto.CompanyContactKycDto;
import com.utkarsh.core.dto.CompanyCreateRequestDTO;
import com.utkarsh.core.dto.CompanyFullViewDto;
import com.utkarsh.core.dto.CompanyPartnersDto;
import com.utkarsh.core.dto.CustomerAssetsDto;
import com.utkarsh.core.dto.CustomerCreateRequest;
import com.utkarsh.core.dto.CustomerFullViewDto;
import com.utkarsh.core.dto.CustomerKycDTO;
import com.utkarsh.core.dto.CustomerUpdateRequest;
import com.utkarsh.core.dto.PersonalDetailsDto;
import com.utkarsh.core.mapper.CompanyContactKycMapper;
import com.utkarsh.core.mapper.CompanyCustomerDetailsMapper;
import com.utkarsh.core.mapper.CompanyPartnersMapper;
import com.utkarsh.core.mapper.CustomerAddressMapper;
import com.utkarsh.core.mapper.CustomerAssetsMapper;
import com.utkarsh.core.mapper.CustomerKycMapper;
import com.utkarsh.core.mapper.CustomerMasterMapper;
import com.utkarsh.core.mapper.CustomerOccupationMapper;
import com.utkarsh.core.model.CompanyContactKyc;
import com.utkarsh.core.model.CompanyCustomerDetails;
import com.utkarsh.core.model.CompanyPartners;
import com.utkarsh.core.model.CustomerAddress;
import com.utkarsh.core.model.CustomerAssets;
import com.utkarsh.core.model.CustomerAuditLog;
import com.utkarsh.core.model.CustomerKyc;
import com.utkarsh.core.model.CustomerMaster;
import com.utkarsh.core.model.CustomerOccupation;
import com.utkarsh.core.service.CustomerCrudService;

import jakarta.transaction.Transactional;

@Service
public class CustomerCrudServiceImpl implements CustomerCrudService {

	@Autowired
	private CustomerMasterDao customerMasterDao;
	@Autowired
	private CustomerAddressDao customerAddressDao;
	@Autowired
	private CustomerKycDao customerKycDao;
	@Autowired
	private CustomerAssetsDao customerAssetsDao;
	@Autowired
	private CompanyCustomerDetailsDao companyCustomerDetailsDao;
	@Autowired
	private CompanyContactKycDao companyContactKycDao;
	@Autowired
	private CompanyPartnersDao companyPartnersDao;
	@Autowired
	private CustomerAuditLogDao customerAuditLogDao;
	@Autowired
	private CustomerOccupationDao customeroccupationdao;
	@Autowired
	private ReligionMasterDao religionMasterDao;
	@Autowired
	private CastMasterDao castMasterDao;
	@Autowired
	private EducationMasterDao educationMasterDao;
	@Autowired
	private OccupationMasterDao occupationMasterDao;

	@Autowired
	private CountryMasterDao countryMasterDao;
	@Autowired
	private StateMasterDao stateMasterDao;
	@Autowired
	private DistrictMasterDao districtMasterDao;
	@Autowired
	private CityMasterDao cityMasterDao;
	@Autowired
	private TalukaMasterDao talukaMasterDao;
	@Autowired
	private WardMasterDao wardMasterDao;


	@Override
	@Transactional
	public @Nullable Object createIndividualCustomer(CustomerCreateRequest request) {
		CustomerMaster lastCustomer = customerMasterDao.findTopByOrderByCustomerIdDesc();

		CompanyCustomerDetails lastCompanyCustomer = companyCustomerDetailsDao.findTopByOrderByCustomerIdDesc();

		long lastIdMaster = 0L;
		long lastIdCompany = 0L;
		if (lastCustomer != null && lastCustomer.getCustomerId() != null) {
			lastIdMaster = Long.parseLong(lastCustomer.getCustomerId());
		}
		if (lastCompanyCustomer != null && lastCompanyCustomer.getCustomerId() != null) {
			lastIdCompany = Long.parseLong(lastCompanyCustomer.getCustomerId());
		}
		long maxLastId = Math.max(lastIdMaster, lastIdCompany);
		String nextCustomerId = String.format("%012d", maxLastId + 1);

		// 1. Save Customer Master
		CustomerMaster master = CustomerMasterMapper.toEntity(request.getMaster());
		master.setCustomerId(nextCustomerId);
		customerMasterDao.save(master);

		// 2. Save Address
		CustomerAddress address = CustomerAddressMapper.toEntity(request.getAddress());
		address.setCustomerId(nextCustomerId);
		customerAddressDao.save(address);

		// 3. Save KYC List
		if (request.getKyc() != null) {
			List<CustomerKyc> kycList = request.getKyc().stream().map(dto -> {
				CustomerKyc entity = CustomerKycMapper.toEntity(dto);
				entity.setCustomerId(nextCustomerId);
				return entity;
			}).collect(Collectors.toList());
			customerKycDao.saveAll(kycList);
		}

		// 4. Save Assets List
		if (request.getAssets() != null) {
			List<CustomerAssets> assetsList = request.getAssets().stream().map(dto -> {
				CustomerAssets entity = CustomerAssetsMapper.toEntity(dto);
				entity.setCustomerId(nextCustomerId);
				return entity;
			}).collect(Collectors.toList());
			customerAssetsDao.saveAll(assetsList);
		}

		// 5. save Occupation
		if (request.getOccupation() != null) {
			CustomerOccupation Occupation = CustomerOccupationMapper.toEntity(request.getOccupation());
			Occupation.setCustomerId(nextCustomerId);
			customeroccupationdao.save(Occupation);
		}

		// 8. Create Audit Log
		CustomerAuditLog log = new CustomerAuditLog();
		log.setCustomerId(nextCustomerId);
		log.setActionType("CREATE");
		log.setOfficerId(1); // or dynamic
		log.setUserId(1); // or dynamic
		ZonedDateTime now = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
		log.setCreatedAt(now.toLocalDateTime());
		log.setUpdatedAt(now.toLocalDateTime());
		customerAuditLogDao.save(log);

		return "Customer created successfully";
	}

	@Override
	@Transactional
	public Object updateCustomer(String customerId, CustomerUpdateRequest request) {

		if ("Individual".equalsIgnoreCase(request.getType())) {

			/* ================= MASTER ================= */
			if (request.getMaster() != null) {

				CustomerMaster master = customerMasterDao.findByCustomerId(customerId).orElse(new CustomerMaster());

				CustomerMasterMapper.updateEntity(request.getMaster(), master);
				master.setCustomerId(customerId);

				customerMasterDao.save(master);
			}

			/* ================= ADDRESS ================= */
			if (request.getAddress() != null) {

				CustomerAddress address = customerAddressDao.findByCustomerId(customerId);

				CustomerAddressMapper.updateEntity(request.getAddress(), address);
				address.setCustomerId(customerId);

				customerAddressDao.save(address);
			}

			if (request.getKyc() != null) {
				for (CustomerKycDTO dto : request.getKyc()) {
					CustomerKyc kyc = customerKycDao.findByCustomerIdAndDocNumber(customerId, dto.getDocNumber());
					if (kyc == null)
						kyc = new CustomerKyc();

					CustomerKycMapper.updateEntity(dto, kyc);
					kyc.setCustomerId(customerId);
					customerKycDao.save(kyc);
				}
			}

			if (request.getAssets() != null) {
				for (CustomerAssetsDto dto : request.getAssets()) {
					CustomerAssets asset = customerAssetsDao.findByCustomerIdAndAssetName(customerId,
							dto.getAssetName());
					if (asset == null)
						asset = new CustomerAssets();

					CustomerAssetsMapper.updateEntity(dto, asset);
					asset.setCustomerId(customerId);
					customerAssetsDao.save(asset);
				}
			}
			if(request.getOccupation()!=null) {
				CustomerOccupation occupation = customeroccupationdao.findByCustomerId(customerId);
				CustomerOccupationMapper.updateEntity(request.getOccupation(),occupation);
				occupation.setCustomerId(customerId);
				customeroccupationdao.save(occupation);
			}

		} else {

			/* ================= COMPANY DETAILS ================= */
			if (request.getCompanyDetails() != null) {

				CompanyCustomerDetails details = companyCustomerDetailsDao.findByCustomerId(customerId);

				CompanyCustomerDetailsMapper.updateEntity(request.getCompanyDetails(), details);
				details.setCustomerId(customerId);

				companyCustomerDetailsDao.save(details);
			}

			/* ================= COMPANY KYC ================= */
			if (request.getCompanyContact() != null) {

				for (CompanyContactKycDto dto : request.getCompanyContact()) {

					CompanyContactKyc kyc = companyContactKycDao
							.findByCustomerIdAndKycDocNumber(customerId, dto.getKycDocNumber())
							.orElse(new CompanyContactKyc());

					CompanyContactKycMapper.updateEntity(dto, kyc);
					kyc.setCustomerId(customerId);

					companyContactKycDao.save(kyc);
				}
			}

			/* ================= PARTNERS ================= */
			if (request.getPartners() != null) {

				for (CompanyPartnersDto dto : request.getPartners()) {

					CompanyPartners partner = companyPartnersDao
							.findByCustomerIdAndPartnerId(customerId, dto.getPartnerId()).orElse(new CompanyPartners());

					CompanyPartnersMapper.updateEntity(dto, partner);
					partner.setCustomerId(customerId);

					companyPartnersDao.save(partner);
				}
			}
		}

		/* ================= AUDIT LOG ================= */
		CustomerAuditLog log = new CustomerAuditLog();
		log.setCustomerId(customerId);
		log.setActionType("UPDATE");
		log.setOfficerId(request.getUserId());
		log.setUserId(request.getOfficerId());
		ZonedDateTime now = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
		log.setCreatedAt(now.toLocalDateTime());
		log.setUpdatedAt(now.toLocalDateTime());

		customerAuditLogDao.save(log);

		return "Customer updated successfully";
	}



	@Override
	@Transactional
	public @Nullable Object getAllCustomers() {
		return customerMasterDao.findAll(PageRequest.of(0, 50)).getContent();
	}



	@Override
	public @Nullable Object createCompanyCustomer(CompanyCreateRequestDTO request) {
		CustomerMaster lastCustomer = customerMasterDao.findTopByOrderByCustomerIdDesc();

		CompanyCustomerDetails lastCompanyCustomer = companyCustomerDetailsDao.findTopByOrderByCustomerIdDesc();

		long lastIdMaster = 0L;
		long lastIdCompany = 0L;
		if (lastCustomer != null && lastCustomer.getCustomerId() != null) {
			lastIdMaster = Long.parseLong(lastCustomer.getCustomerId());
		}
		if (lastCompanyCustomer != null && lastCompanyCustomer.getCustomerId() != null) {
			lastIdCompany = Long.parseLong(lastCompanyCustomer.getCustomerId());
		}
		long maxLastId = Math.max(lastIdMaster, lastIdCompany);
		String nextCustomerId = String.format("%012d", maxLastId + 1);

		// 5. Save Company Customer Details
		if (request.getCompanyDetails() != null) {
			CompanyCustomerDetails details = CompanyCustomerDetailsMapper.toEntity(request.getCompanyDetails());
			details.setCustomerId(nextCustomerId);
			companyCustomerDetailsDao.save(details);
		}

		// 6. Save Company Contact KYC
		if (request.getCompanyContact() != null) {
			request.getCompanyContact().forEach(dto -> {
				companyContactKycDao.insertCompanyContactKyc(nextCustomerId, dto.getKycDocName(), dto.getKycDocNumber(),
						dto.getKycDocImage());
			});
		}

		// 7. Save Company Partners
		if (request.getPartners() != null) {
			request.getPartners().forEach(dto -> {
				companyPartnersDao.insertPartners(dto.getPartnerId(), nextCustomerId, dto.getPartnerName(),
						dto.getPanNo(), dto.getMobileNo());
			});
		}

		// 8. Create Audit Log
		CustomerAuditLog log = new CustomerAuditLog();
		log.setCustomerId(nextCustomerId);
		log.setActionType("CREATE");
		log.setOfficerId(1); // or dynamic
		log.setUserId(1); // or dynamic
		ZonedDateTime now = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
		log.setCreatedAt(now.toLocalDateTime());
		log.setUpdatedAt(now.toLocalDateTime());
		customerAuditLogDao.save(log);
		return Map.of("success", true, "customerId", nextCustomerId);
	}

	@Override
	@Transactional
	public CustomerFullViewDto getFullCustomer(String customerId) {

		CustomerMaster master = customerMasterDao.findById(customerId)
				.orElseThrow(() -> new RuntimeException("Customer not found"));

		CustomerFullViewDto dto = new CustomerFullViewDto();

		// 1️⃣ Master
		dto.setCustomerType(master.getCustomerType());
		dto.setMaster(CustomerMasterMapper.toDto(master));

		// 2️⃣ Address
		CustomerAddress address = customerAddressDao.findByCustomerId(customerId);
		if (address != null) {
			dto.setAddress(CustomerAddressMapper.toDto(address));
		}

		// 3️⃣ KYC
		List<CustomerKyc> kycList = customerKycDao.findByCustomerId(customerId);

		dto.setKyc(kycList.stream().map(CustomerKycMapper::toDto).collect(Collectors.toList()));

		// 4️⃣ Assets
		List<CustomerAssets> assetsList = customerAssetsDao.findByCustomerId(customerId);

		dto.setAssets(assetsList.stream().map(CustomerAssetsMapper::toDto).collect(Collectors.toList()));

		// 5 Occupation Data
		CustomerOccupation occupation = customeroccupationdao.findByCustomerId(customerId);

		dto.setOccupation(CustomerOccupationMapper.toDto(occupation));

		return dto;
	}

	@Override
	public @Nullable Object getAllCompanys() {

		return companyCustomerDetailsDao.findAll();
	}

	@Override
	public CompanyFullViewDto getFullCompanyData(String customerId) {

		// Company-data
		CompanyFullViewDto dto = new CompanyFullViewDto();

		CompanyCustomerDetails companyDetails = companyCustomerDetailsDao.findByCustomerId(customerId);

		dto.setCompanyDetails(CompanyCustomerDetailsMapper.toDto(companyDetails));

		List<CompanyContactKyc> companyContact = companyContactKycDao.findByCustomerId(customerId);
		dto.setCompanyContact(companyContact.stream().map(CompanyContactKycMapper::toDto).collect(Collectors.toList()));

		List<CompanyPartners> companyPartner = companyPartnersDao.findByCustomerId(customerId);
		dto.setPartners(companyPartner.stream().map(CompanyPartnersMapper::toDto).collect(Collectors.toList()));

		return dto;
	}

	@Override
	@Transactional
	public void deleteKycDocument(String customerId, String docNumber) {
		 customerKycDao.deleteByCustomerIdAndDocNumber(customerId, docNumber);		
	}

	@Override
	public @Nullable PersonalDetailsDto getPersonalDetails() {
		 PersonalDetailsDto dto = new PersonalDetailsDto();
		    dto.setEducationList(educationMasterDao.findAll());
		    dto.setCastList(castMasterDao.findAll());
		    dto.setReligionList(religionMasterDao.findAll());
		    dto.setCountryList(countryMasterDao.findAll());
			dto.setStateList(stateMasterDao.findAll());
			dto.setDistrictList(districtMasterDao.findAll());
			dto.setCityList(cityMasterDao.findAll());
			dto.setTalukaList(talukaMasterDao.findAll());
			dto.setWardList(wardMasterDao.findAll());
			dto.setOccupationList(occupationMasterDao.findAll());
		    return dto;
	}

	@Override
	public List<CustomerMaster> search(String searchBy, String searchValue, int limit) {
		
		 if (searchValue == null || searchValue.trim().isEmpty()) {
	            return List.of();
	        }

	        List<CustomerMaster> result;

	        if ("id".equalsIgnoreCase(searchBy)) {
	            result = customerMasterDao.searchById(searchValue);
	        } else {
	            result = customerMasterDao.searchByName(searchValue);
	        }

	        // return only TOP N records
	        return result.stream()
	                     .limit(limit)
	                     .toList();
	}

	@Override
	public @Nullable List<CompanyCustomerDetails> searchCompany(String searchBy, String searchValue, int limit) {
		
		if (searchValue == null || searchValue.trim().isEmpty()) {
	        return List.of();
	    }

	    List<CompanyCustomerDetails> result;

	    if ("id".equalsIgnoreCase(searchBy)) {
	        result = companyCustomerDetailsDao.searchByCompanyId(searchValue);
	    } else {
	        result = companyCustomerDetailsDao.searchByCompanyName(searchValue);
	    }

	    return result.stream()
	                 .limit(limit)
	                 .toList();
	}

	@Override
	public List<CompanyCustomerDetails> getTopCompanies(int limit) {
	    return companyCustomerDetailsDao.findTopCompanies(PageRequest.of(0, limit));
	}   

	
	
}

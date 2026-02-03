package com.utkarsh.core.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class CustomerAssetsDto {

	 private Integer assetId;
//	    private String customerId;
	    private String assetName;
	    private BigDecimal assetValue;
	    private byte[] assetPhoto;
	    private BigDecimal annualIncome;
	    private BigDecimal netWorth;
	    private BigDecimal usableLandAcre;
	    private BigDecimal usableLandGuntha;
	    private BigDecimal totalLandAcre;
	    private BigDecimal totalLandGuntha;
	    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	    private LocalDate eAgreementEndDate;
	    
	  

		public CustomerAssetsDto() {}

		public CustomerAssetsDto(Integer assetId, String customerId, String assetName, BigDecimal assetValue,
				byte[] assetPhoto, BigDecimal annualIncome, BigDecimal netWorth, BigDecimal usableLandAcre,
				BigDecimal usableLandGuntha, BigDecimal totalLandAcre, BigDecimal totalLandGuntha,
				LocalDate eAgreementEndDate) {
			super();
			this.assetId = assetId;
//			this.customerId = customerId;
			this.assetName = assetName;
			this.assetValue = assetValue;
			this.assetPhoto = assetPhoto;
			this.annualIncome = annualIncome;
			this.netWorth = netWorth;
			this.usableLandAcre = usableLandAcre;
			this.usableLandGuntha = usableLandGuntha;
			this.totalLandAcre = totalLandAcre;
			this.totalLandGuntha = totalLandGuntha;
			this.eAgreementEndDate = eAgreementEndDate;
		}

		public Integer getAssetId() {
			return assetId;
		}

		public void setAssetId(Integer assetId) {
			this.assetId = assetId;
		}

//		public String getCustomerId() {
//			return customerId;
//		}
//
//		public void setCustomerId(String customerId) {
//			this.customerId = customerId;
//		}

		public String getAssetName() {
			return assetName;
		}

		public void setAssetName(String assetName) {
			this.assetName = assetName;
		}

		public BigDecimal getAssetValue() {
			return assetValue;
		}

		public void setAssetValue(BigDecimal assetValue) {
			this.assetValue = assetValue;
		}

		public byte[] getAssetPhoto() {
			return assetPhoto;
		}

		public void setAssetPhoto(byte[] assetPhoto) {
			this.assetPhoto = assetPhoto;
		}

		public BigDecimal getAnnualIncome() {
			return annualIncome;
		}

		public void setAnnualIncome(BigDecimal annualIncome) {
			this.annualIncome = annualIncome;
		}

		public BigDecimal getNetWorth() {
			return netWorth;
		}

		public void setNetWorth(BigDecimal netWorth) {
			this.netWorth = netWorth;
		}

		public BigDecimal getUsableLandAcre() {
			return usableLandAcre;
		}

		public void setUsableLandAcre(BigDecimal usableLandAcre) {
			this.usableLandAcre = usableLandAcre;
		}

		public BigDecimal getUsableLandGuntha() {
			return usableLandGuntha;
		}

		public void setUsableLandGuntha(BigDecimal usableLandGuntha) {
			this.usableLandGuntha = usableLandGuntha;
		}

		public BigDecimal getTotalLandAcre() {
			return totalLandAcre;
		}

		public void setTotalLandAcre(BigDecimal totalLandAcre) {
			this.totalLandAcre = totalLandAcre;
		}

		public BigDecimal getTotalLandGuntha() {
			return totalLandGuntha;
		}

		public void setTotalLandGuntha(BigDecimal totalLandGuntha) {
			this.totalLandGuntha = totalLandGuntha;
		}

		public LocalDate geteAgreementEndDate() {
			return eAgreementEndDate;
		}

		public void seteAgreementEndDate(LocalDate eAgreementEndDate) {
			this.eAgreementEndDate = eAgreementEndDate;
		}
	    
}

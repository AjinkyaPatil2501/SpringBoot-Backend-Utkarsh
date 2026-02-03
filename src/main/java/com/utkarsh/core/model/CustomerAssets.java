package com.utkarsh.core.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer_assets")
public class CustomerAssets {

    

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "asset_id")
    private Integer assetId;

    @Column(name = "customer_id", length = 12, nullable = false)
    private String customerId;

    @Column(name = "asset_name", length = 100, nullable = false)
    private String assetName;

    @Column(name = "asset_value", precision = 12, scale = 2)
    private BigDecimal assetValue;

    @Lob
    @Column(name = "asset_photo")
    private byte[] assetPhoto;

    @Column(name = "annual_income", precision = 12, scale = 2)
    private BigDecimal annualIncome;

    @Column(name = "net_worth", precision = 12, scale = 2)
    private BigDecimal netWorth;

    @Column(name = "usable_land_acre", precision = 6, scale = 2)
    private BigDecimal usableLandAcre;

    @Column(name = "usable_land_guntha", precision = 6, scale = 2)
    private BigDecimal usableLandGuntha;

    @Column(name = "total_land_acre", precision = 6, scale = 2)
    private BigDecimal totalLandAcre;

    @Column(name = "total_land_guntha", precision = 6, scale = 2)
    private BigDecimal totalLandGuntha;

    @Column(name = "e_agreement_end_date")
    private LocalDate eAgreementEndDate;

    public CustomerAssets() {
        super();
    }

    public CustomerAssets(Integer assetId, String customerId, String assetName, BigDecimal assetValue,
                          byte[] assetPhoto, BigDecimal annualIncome, BigDecimal netWorth,
                          BigDecimal usableLandAcre, BigDecimal usableLandGuntha,
                          BigDecimal totalLandAcre, BigDecimal totalLandGuntha,
                          LocalDate eAgreementEndDate) {
        this.assetId = assetId;
        this.customerId = customerId;
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

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

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

    public LocalDate getEAgreementEndDate() {
        return eAgreementEndDate;
    }

    public void setEAgreementEndDate(LocalDate eAgreementEndDate) {
        this.eAgreementEndDate = eAgreementEndDate;
    }
}

package com.fundeduplatform.fundedu.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang3.ObjectUtils;

@Entity
@Table(name = "USER_ADDRESS")
public class CustomerAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ADDRESS_ID")
    private Long addressId;
    private Long addressType; //foreign key- ref master [current , permanaent]
    private String buildingNo;
    private String flatNo;
    private String street;
    @Column(name = "ADDRESS_LINE_1")
    private String addressLine1;
    @Column(name = "ADDRESS_LINE_2")
    private String addressLine2;
    @Column(name = "ADDRESS_LINE_3")
    private String addressLine3;
    private String city;
    private String state;
    private String country;
    private String landmark;
    private String zipCode;
    private String district;
    private Long UserId;
    private Date createdDt;
    private String createdBy;
    private Date updatedDt;
    private String updatedBy;
    private String activeFlag;

    public CustomerAddress(){}

    public CustomerAddress(Long addressId, Long addressType, String buildingNo, String flatNo, String street, String addressLine1, String addressLine2, String addressLine3, String city, String state, String country, String landmark, String zipCode, String district, Long userId, Date createdDt, String createdBy, Date updatedDt, String updatedBy, String activeFlag) {
        this.addressId = addressId;
        this.addressType = addressType;
        this.buildingNo = buildingNo;
        this.flatNo = flatNo;
        this.street = street;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.addressLine3 = addressLine3;
        this.city = city;
        this.state = state;
        this.country = country;
        this.landmark = landmark;
        this.zipCode = zipCode;
        this.district = district;
        UserId = userId;
        this.createdDt = createdDt;
        this.createdBy = createdBy;
        this.updatedDt = updatedDt;
        this.updatedBy = updatedBy;
        this.activeFlag = activeFlag;
    }


    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public Long getAddressType() {
        return addressType;
    }

    public void setAddressType(Long addressType) {
        this.addressType = addressType;
    }

    public String getBuildingNo() {
        return buildingNo;
    }

    public void setBuildingNo(String buildingNo) {
        this.buildingNo = buildingNo;
    }

    public String getFlatNo() {
        return flatNo;
    }

    public void setFlatNo(String flatNo) {
        this.flatNo = flatNo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getAddressLine3() {
        return addressLine3;
    }

    public void setAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Long getUserId() {
        return UserId;
    }

    public void setUserId(Long userId) {
        UserId = userId;
    }

    public Date getCreatedDt() {
        return createdDt;
    }

    public void setCreatedDt(Date createdDt) {
        this.createdDt = createdDt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getUpdatedDt() {
        return updatedDt;
    }

    public void setUpdatedDt(Date updatedDt) {
        this.updatedDt = updatedDt;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getActiveFlag() {
        return activeFlag;
    }

    public void setActiveFlag(String activeFlag) {
        this.activeFlag = activeFlag;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof CustomerAddress)) return false;
        if (!super.equals(object)) return false;
        CustomerAddress that = (CustomerAddress) object;
        return java.util.Objects.equals(getAddressId(), that.getAddressId()) && java.util.Objects.equals(getAddressType(), that.getAddressType()) && java.util.Objects.equals(getBuildingNo(), that.getBuildingNo()) && java.util.Objects.equals(getFlatNo(), that.getFlatNo()) && java.util.Objects.equals(getStreet(), that.getStreet()) && java.util.Objects.equals(getAddressLine1(), that.getAddressLine1()) && java.util.Objects.equals(getAddressLine2(), that.getAddressLine2()) && java.util.Objects.equals(getAddressLine3(), that.getAddressLine3()) && java.util.Objects.equals(getCity(), that.getCity()) && java.util.Objects.equals(getState(), that.getState()) && java.util.Objects.equals(getCountry(), that.getCountry()) && java.util.Objects.equals(getLandmark(), that.getLandmark()) && java.util.Objects.equals(getZipCode(), that.getZipCode()) && java.util.Objects.equals(getDistrict(), that.getDistrict()) && java.util.Objects.equals(getUserId(), that.getUserId()) && java.util.Objects.equals(getCreatedDt(), that.getCreatedDt()) && java.util.Objects.equals(getCreatedBy(), that.getCreatedBy()) && java.util.Objects.equals(getUpdatedDt(), that.getUpdatedDt()) && java.util.Objects.equals(getUpdatedBy(), that.getUpdatedBy()) && java.util.Objects.equals(getActiveFlag(), that.getActiveFlag());
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), getAddressId(), getAddressType(), getBuildingNo(), getFlatNo(), getStreet(), getAddressLine1(), getAddressLine2(), getAddressLine3(), getCity(), getState(), getCountry(), getLandmark(), getZipCode(), getDistrict(), getUserId(), getCreatedDt(), getCreatedBy(), getUpdatedDt(), getUpdatedBy(), getActiveFlag());
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "CustomerAddress{" +
                "addressId=" + addressId +
                ", addressType=" + addressType +
                ", buildingNo='" + buildingNo + '\'' +
                ", flatNo='" + flatNo + '\'' +
                ", street='" + street + '\'' +
                ", addressLine1='" + addressLine1 + '\'' +
                ", addressLine2='" + addressLine2 + '\'' +
                ", addressLine3='" + addressLine3 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", landmark='" + landmark + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", district='" + district + '\'' +
                ", UserId=" + UserId +
                ", createdDt=" + createdDt +
                ", createdBy='" + createdBy + '\'' +
                ", updatedDt=" + updatedDt +
                ", updatedBy='" + updatedBy + '\'' +
                ", activeFlag='" + activeFlag + '\'' +
                '}';
    }
}

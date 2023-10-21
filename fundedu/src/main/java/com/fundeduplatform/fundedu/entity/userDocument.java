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
@Table(name = "STUDENT_DOCUMENTS")
public class CustomerDocuments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "document_id")
    private Long document_id;
    private Long doc_type;	//foreign key from docrefmaster
    private String doc_number;
    private String doc_issued_country;
    private Date issued_date;
    private Date expiry_date;
    private String remarks;
    private Long user; //foreign key in customer
    private Date createdDt;
    private String createdBy;
    private Date updatedDt;
    private String updatedBy;

    public CustomerDocuments(){}

    public CustomerDocuments(Long document_id, Long doc_type, String doc_number, String doc_issued_country, Date issued_date, Date expiry_date, String remarks, Long user, Date createdDt, String createdBy, Date updatedDt, String updatedBy) {
        this.document_id = document_id;
        this.doc_type = doc_type;
        this.doc_number = doc_number;
        this.doc_issued_country = doc_issued_country;
        this.issued_date = issued_date;
        this.expiry_date = expiry_date;
        this.remarks = remarks;
        this.user = user;
        this.createdDt = createdDt;
        this.createdBy = createdBy;
        this.updatedDt = updatedDt;
        this.updatedBy = updatedBy;
    }

    public Long getDocument_id() {
        return document_id;
    }

    public void setDocument_id(Long document_id) {
        this.document_id = document_id;
    }

    public Long getDoc_type() {
        return doc_type;
    }

    public void setDoc_type(Long doc_type) {
        this.doc_type = doc_type;
    }

    public String getDoc_number() {
        return doc_number;
    }

    public void setDoc_number(String doc_number) {
        this.doc_number = doc_number;
    }

    public String getDoc_issued_country() {
        return doc_issued_country;
    }

    public void setDoc_issued_country(String doc_issued_country) {
        this.doc_issued_country = doc_issued_country;
    }

    public Date getIssued_date() {
        return issued_date;
    }

    public void setIssued_date(Date issued_date) {
        this.issued_date = issued_date;
    }

    public Date getExpiry_date() {
        return expiry_date;
    }

    public void setExpiry_date(Date expiry_date) {
        this.expiry_date = expiry_date;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Long getUser() {
        return user;
    }

    public void setUser(Long user) {
        this.user = user;
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

    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof CustomerDocuments)) return false;
        if (!super.equals(object)) return false;
        CustomerDocuments that = (CustomerDocuments) object;
        return java.util.Objects.equals(getDocument_id(), that.getDocument_id()) && java.util.Objects.equals(getDoc_type(), that.getDoc_type()) && java.util.Objects.equals(getDoc_number(), that.getDoc_number()) && java.util.Objects.equals(getDoc_issued_country(), that.getDoc_issued_country()) && java.util.Objects.equals(getIssued_date(), that.getIssued_date()) && java.util.Objects.equals(getExpiry_date(), that.getExpiry_date()) && java.util.Objects.equals(getRemarks(), that.getRemarks()) && java.util.Objects.equals(getUser(), that.getUser()) && java.util.Objects.equals(getCreatedDt(), that.getCreatedDt()) && java.util.Objects.equals(getCreatedBy(), that.getCreatedBy()) && java.util.Objects.equals(getUpdatedDt(), that.getUpdatedDt()) && java.util.Objects.equals(getUpdatedBy(), that.getUpdatedBy());
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), getDocument_id(), getDoc_type(), getDoc_number(), getDoc_issued_country(), getIssued_date(), getExpiry_date(), getRemarks(), getUser(), getCreatedDt(), getCreatedBy(), getUpdatedDt(), getUpdatedBy());
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "CustomerDocuments{" +
                "document_id=" + document_id +
                ", doc_type=" + doc_type +
                ", doc_number='" + doc_number + '\'' +
                ", doc_issued_country='" + doc_issued_country + '\'' +
                ", issued_date=" + issued_date +
                ", expiry_date=" + expiry_date +
                ", remarks='" + remarks + '\'' +
                ", user=" + user +
                ", createdDt=" + createdDt +
                ", createdBy='" + createdBy + '\'' +
                ", updatedDt=" + updatedDt +
                ", updatedBy='" + updatedBy + '\'' +
                '}';
    }
}

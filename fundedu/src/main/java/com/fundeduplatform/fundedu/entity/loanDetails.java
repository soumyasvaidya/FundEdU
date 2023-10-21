package com.fundeduplatform.fundedu.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "LOAN_DETAILS")
public class LoanDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long loanId;
    private Long studentId;
    private Long investorId;
    private Date loanStartDate;
    private String loanAmount;
    private String allowGrace;
    private String baseRate;
    private Long interestFrequency;
    private Long paymentFrequency;
    private Date interest_start_date;
    private Date payment_frequency_date;
    private Date submitDate;
    private Date createdDt;
    private String createdBy;
    private Date updatedDt;
    private String updatedBy;
    private String activeFlag;

    public LoanDetails(){}

    public LoanDetails(Long loanId, Long studentId, Long investorId, Date loanStartDate, String loanAmount, String allowGrace, String baseRate, Long interestFrequency, Long paymentFrequency, Date interest_start_date, Date payment_frequency_date, Date submitDate, Date createdDt, String createdBy, Date updatedDt, String updatedBy, String activeFlag) {
        this.loanId = loanId;
        this.studentId = studentId;
        this.investorId = investorId;
        this.loanStartDate = loanStartDate;
        this.loanAmount = loanAmount;
        this.allowGrace = allowGrace;
        this.baseRate = baseRate;
        this.interestFrequency = interestFrequency;
        this.paymentFrequency = paymentFrequency;
        this.interest_start_date = interest_start_date;
        this.payment_frequency_date = payment_frequency_date;
        this.submitDate = submitDate;
        this.createdDt = createdDt;
        this.createdBy = createdBy;
        this.updatedDt = updatedDt;
        this.updatedBy = updatedBy;
        this.activeFlag = activeFlag;
    }

    public Long getLoanId() {
        return loanId;
    }

    public void setLoanId(Long loanId) {
        this.loanId = loanId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getInvestorId() {
        return investorId;
    }

    public void setInvestorId(Long investorId) {
        this.investorId = investorId;
    }

    public Date getLoanStartDate() {
        return loanStartDate;
    }

    public void setLoanStartDate(Date loanStartDate) {
        this.loanStartDate = loanStartDate;
    }

    public String getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(String loanAmount) {
        this.loanAmount = loanAmount;
    }

    public String getAllowGrace() {
        return allowGrace;
    }

    public void setAllowGrace(String allowGrace) {
        this.allowGrace = allowGrace;
    }

    public String getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(String baseRate) {
        this.baseRate = baseRate;
    }

    public Long getInterestFrequency() {
        return interestFrequency;
    }

    public void setInterestFrequency(Long interestFrequency) {
        this.interestFrequency = interestFrequency;
    }

    public Long getPaymentFrequency() {
        return paymentFrequency;
    }

    public void setPaymentFrequency(Long paymentFrequency) {
        this.paymentFrequency = paymentFrequency;
    }

    public Date getInterest_start_date() {
        return interest_start_date;
    }

    public void setInterest_start_date(Date interest_start_date) {
        this.interest_start_date = interest_start_date;
    }

    public Date getPayment_frequency_date() {
        return payment_frequency_date;
    }

    public void setPayment_frequency_date(Date payment_frequency_date) {
        this.payment_frequency_date = payment_frequency_date;
    }

    public Date getSubmitDate() {
        return submitDate;
    }

    public void setSubmitDate(Date submitDate) {
        this.submitDate = submitDate;
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
        if (!(object instanceof LoanDetails)) return false;
        if (!super.equals(object)) return false;
        LoanDetails that = (LoanDetails) object;
        return java.util.Objects.equals(loanId, that.loanId) && java.util.Objects.equals(studentId, that.studentId) && java.util.Objects.equals(investorId, that.investorId) && java.util.Objects.equals(loanStartDate, that.loanStartDate) && java.util.Objects.equals(loanAmount, that.loanAmount) && java.util.Objects.equals(allowGrace, that.allowGrace) && java.util.Objects.equals(baseRate, that.baseRate) && java.util.Objects.equals(interestFrequency, that.interestFrequency) && java.util.Objects.equals(paymentFrequency, that.paymentFrequency) && java.util.Objects.equals(interest_start_date, that.interest_start_date) && java.util.Objects.equals(payment_frequency_date, that.payment_frequency_date) && java.util.Objects.equals(submitDate, that.submitDate) && java.util.Objects.equals(createdDt, that.createdDt) && java.util.Objects.equals(createdBy, that.createdBy) && java.util.Objects.equals(updatedDt, that.updatedDt) && java.util.Objects.equals(updatedBy, that.updatedBy) && java.util.Objects.equals(activeFlag, that.activeFlag);
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), loanId, studentId, investorId, loanStartDate, loanAmount, allowGrace, baseRate, interestFrequency, paymentFrequency, interest_start_date, payment_frequency_date, submitDate, createdDt, createdBy, updatedDt, updatedBy, activeFlag);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "LoanDetails{" +
                "loanId=" + loanId +
                ", studentId=" + studentId +
                ", investorId=" + investorId +
                ", loanStartDate=" + loanStartDate +
                ", loanAmount='" + loanAmount + '\'' +
                ", allowGrace='" + allowGrace + '\'' +
                ", baseRate='" + baseRate + '\'' +
                ", interestFrequency=" + interestFrequency +
                ", paymentFrequency=" + paymentFrequency +
                ", interest_start_date=" + interest_start_date +
                ", payment_frequency_date=" + payment_frequency_date +
                ", submitDate=" + submitDate +
                ", createdDt=" + createdDt +
                ", createdBy='" + createdBy + '\'' +
                ", updatedDt=" + updatedDt +
                ", updatedBy='" + updatedBy + '\'' +
                ", activeFlag='" + activeFlag + '\'' +
                '}';
    }
}


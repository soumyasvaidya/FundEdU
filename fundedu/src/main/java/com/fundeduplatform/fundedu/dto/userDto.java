package com.fundeduplatform.fundedu.dto;

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


public class User {

    private Long userId;
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String mobileNumber;
    private String userRole;

    public User(){}

    public User(Long userId, String userName, String password, String firstName, String lastName, String email, String mobileNumber, String userRole) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.userRole = userRole;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof User)) return false;
        if (!super.equals(object)) return false;
        User user = (User) object;
        return java.util.Objects.equals(getUserId(), user.getUserId()) && java.util.Objects.equals(getUserName(), user.getUserName()) && java.util.Objects.equals(getPassword(), user.getPassword()) && java.util.Objects.equals(getFirstName(), user.getFirstName()) && java.util.Objects.equals(getLastName(), user.getLastName()) && java.util.Objects.equals(getEmail(), user.getEmail()) && java.util.Objects.equals(getMobileNumber(), user.getMobileNumber()) && java.util.Objects.equals(getUserRole(), user.getUserRole());
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), getUserId(), getUserName(), getPassword(), getFirstName(), getLastName(), getEmail(), getMobileNumber(), getUserRole());
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", userRole='" + userRole + '\'' +
                '}';
    }
}

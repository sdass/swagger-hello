package com.subra.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by sdass on 3/30/2017.
 */
@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
public class Customer implements Serializable {
    BigDecimal id;
    String emailAddress;
    String loginName;

    public Customer() {   }

    public Customer(BigDecimal id, String emailAddress, String loginName) {
        this.id = id;
        this.emailAddress = emailAddress;
        this.loginName = loginName;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", emailAddress='" + emailAddress + '\'' +
                ", loginName='" + loginName + '\'' +
                '}';
    }
}

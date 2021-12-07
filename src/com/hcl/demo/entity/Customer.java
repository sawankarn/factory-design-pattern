package com.hcl.demo.entity;

public class Customer {
    private String name;
    private String topic_interest;
    private String modeOfContact;
    private String email;
    private String mobile;

    public Customer(String name, String topic_interest, String modeOfContact, String email, String mobile) {
        this.name = name;
        this.topic_interest = topic_interest;
        this.modeOfContact = modeOfContact;
        this.email = email;
        this.mobile = mobile;
    }

    public Customer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTopic_interest() {
        return topic_interest;
    }

    public void setTopic_interest(String topic_interest) {
        this.topic_interest = topic_interest;
    }

    public String getModeOfContact() {
        return modeOfContact;
    }

    public void setModeOfContact(String modeOfContact) {
        this.modeOfContact = modeOfContact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}

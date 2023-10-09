package com.contact.practice.entity;

import jakarta.persistence.*;
@Entity
@Table(name="contact")

public class Contact{

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="contact_name")
    private String contactName;

    @Column(name="contact_surname")
    private String contactSurname;

    @Column(name="contact_email")
    private String email;

    @Column(name="contact_mobile_phone")
    private String contactMobilePhone;

    public Contact(){

    }

    public Contact(String contactName, String contactSurname, String email, String contactMobilePhone) {
        this.contactName = contactName;
        this.contactSurname = contactSurname;
        this.email = email;
        this.contactMobilePhone = contactMobilePhone;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactSurname() {
        return contactSurname;
    }

    public void setContactSurname(String contactSurname) {
        this.contactSurname = contactSurname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactMobilePhone() {
        return contactMobilePhone;
    }

    public void setContactMobilePhone(String contactMobilePhone) {
        this.contactMobilePhone = contactMobilePhone;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", contactName='" + contactName + '\'' +
                ", contactSurname='" + contactSurname + '\'' +
                ", email='" + email + '\'' +
                ", contactMobilePhone='" + contactMobilePhone + '\'' +
                '}';
    }
}

package com.example.springbootvalidationexample.model;

import com.example.springbootvalidationexample.constraint.CommPreference;
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty(message = "First Name is required")
    private String firstName;

    @NotEmpty(message = "Last Name is required")
    private String lastName;

    @Email
    @NotEmpty(message = "Email is required")
    private String email;

    @Pattern(regexp = "^(\\d{3}[- ]?){2}\\d{4}$",
            message = "Mobile number is required")
    private String mobilePhone;

    @Past
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;

    @NotEmpty(message = "Communication preference is required")
    @CommPreference
    private String commPreference;

    @ElementCollection
    private List<@NotEmpty String> mobileDevices;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getCommPreference() {
        return commPreference;
    }

    public void setCommPreference(String commPreference) {
        this.commPreference = commPreference;
    }

    public List<String> getMobileDevices() {
        return mobileDevices;
    }

    public void setMobileDevices(List<String> mobileDevices) {
        this.mobileDevices = mobileDevices;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", mobilePhone='" + mobilePhone + '\'' +
                ", birthday=" + birthday +
                ", commPreference='" + commPreference + '\'' +
                ", mobileDevices=" + mobileDevices +
                '}';
    }
}

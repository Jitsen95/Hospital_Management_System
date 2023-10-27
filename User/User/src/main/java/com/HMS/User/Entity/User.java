package com.HMS.User.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="User_Details")
@Builder
public class User {
    @Id
    private String userId;
    @Column(name = "First_Name")
    private String firstName;
    @Column(name = "Last_Name")
    private String lastName;
    @Column(name = "Gender")
    private String gender;
    @Column(name = "Email")
    private String email;
    @Column(name = "City")
    private String city;
    @Column(name = "Mobile")
    private long mobile;
    @Column(name = "Age")
    private int age;
}

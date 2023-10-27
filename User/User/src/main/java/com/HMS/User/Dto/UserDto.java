package com.HMS.User.Dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.hibernate.validator.constraints.UniqueElements;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class UserDto {
    private String userId;
    @Size(min=2,max=18,message = "Provide Valid First Name!!")
    private String firstName;
    @Size(min=2,max=18,message = "Provide Valid Last Name!!")
    private String lastName;
    @Size(min=1,max=6,message = "Provide Valid Gender!!")
    private String gender;
    @NotEmpty
    @Email(message = "Provide Valid Email!!!")
    private String email;
    @Size(min=1,max=20,message = "Provide Valid City Name!!")
    private String city;
    @NotNull(message="Provide Valid Mobile Number!!!!")
    private long mobile;
    @NotNull(message = "Provide Age!!!!")
    private int age;
}

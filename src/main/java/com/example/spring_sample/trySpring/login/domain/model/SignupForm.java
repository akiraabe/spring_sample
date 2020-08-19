package com.example.spring_sample.trySpring.login.domain.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Date;

@Data
public class SignupForm implements Serializable {

    @NotBlank
    @Email
    private String userId;

    @NotBlank
    @Size(min = 4, max = 20)
    @Pattern(regexp = "^[A-Za-z0-9]+$")
    private String password;

    @NotBlank
    private String userName;

    @NotNull
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private Date birthday;

    @AssertFalse
    private boolean admin;
}

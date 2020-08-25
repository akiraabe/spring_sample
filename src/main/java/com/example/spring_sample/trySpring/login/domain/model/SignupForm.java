package com.example.spring_sample.trySpring.login.domain.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Date;

@Data
public class SignupForm implements Serializable {

    @NotBlank(groups = ValidGroup1.class)
    @Email(groups = ValidGroup2.class)
    private String userId;

    @NotBlank(groups = ValidGroup1.class)
    @Size(min = 4, max = 20, groups = ValidGroup2.class)
    @Pattern(regexp = "^[A-Za-z0-9]+$", groups = ValidGroup3.class)
    private String password;

    @NotBlank(groups = ValidGroup1.class)
    private String userName;

    @NotNull(groups = ValidGroup1.class)
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private Date birthday;

    @AssertFalse(groups = ValidGroup1.class)
    private boolean admin;
}

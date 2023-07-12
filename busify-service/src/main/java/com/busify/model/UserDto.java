package com.busify.model;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class UserDto {
    private int id;
    private String email;
    private String password;
    private String first_name;
    private String last_name;
    private UserRole role;
    private LocalDate date_of_birth;
}

package com.busify.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PassengerDto {
    private int id;
    private UserDto user;
}

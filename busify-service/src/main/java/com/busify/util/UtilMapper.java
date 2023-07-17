package com.busify.util;

import com.busify.model.Baggage;
import com.busify.model.BaggageDto;
import com.busify.model.Passenger;
import com.busify.model.PassengerDto;
import com.busify.model.Ticket;
import com.busify.model.TicketDto;
import com.busify.model.User;
import com.busify.model.UserDto;

/**
 * Util class that maps domain models to DTOs.
 */
public class UtilMapper {

    public static TicketDto mapTicketToDto(Ticket ticket) {

        PassengerDto passengerDto = mapToPassengerDto(ticket.getPassenger());

        return TicketDto.builder()
                .id(ticket.getId())
                .passenger(passengerDto)
                .priceValue(ticket.getPrice().getPrice())
                .seat(ticket.getSeat())
                .build();
    }

    public static UserDto mapToUserDto(User user) {

        return UserDto.builder()
                .id(user.getId())
                .email(user.getEmail())
                .password(user.getPassword())
                .first_name(user.getFirst_name())
                .last_name(user.getLast_name())
                .role(user.getRole())
                .date_of_birth(user.getDate_of_birth())
                .build();
    }

    public static PassengerDto mapToPassengerDto(Passenger passenger) {

        UserDto userDto = mapToUserDto(passenger.getUser());

        return PassengerDto.builder()
                .id(passenger.getId())
                .user(userDto)
                .build();
    }

    public static BaggageDto mapToBaggageDto(Baggage baggage) {

        return BaggageDto.builder()
                .id(baggage.getId())
                .build();
    }
}

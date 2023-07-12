package com.busify.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TicketDto {

    private int id;
    private PassengerDto passenger;
    private float priceValue;
    private int seat;

//    TODO: We need other info here.
}

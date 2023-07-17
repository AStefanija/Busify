package com.busify.service;

import com.busify.model.BaggageDto;
import com.busify.model.BaggageType;
import com.busify.model.Ticket;


public interface BaggageService {

    BaggageDto addBaggage(Ticket ticket, float weight, float size, BaggageType baggageType);
}

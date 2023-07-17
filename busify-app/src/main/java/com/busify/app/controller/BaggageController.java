package com.busify.app.controller;

import com.busify.app.util.ResponseConverter;
import com.busify.codegen.api.AddBaggageApi;
import com.busify.codegen.model.AddBaggageResponse;
import com.busify.codegen.model.AddBaggageRequest;
import com.busify.exception.BusifyAppException;
import com.busify.exception.BusifyError;
import com.busify.model.BaggageDto;
import com.busify.model.BaggageType;
import com.busify.model.Ticket;
import com.busify.repository.TicketRepository;
import com.busify.service.BaggageService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
@Slf4j
public class BaggageController implements AddBaggageApi {

    private final BaggageService baggageService;

    private final TicketRepository ticketRepository;

    public ResponseEntity<AddBaggageResponse> addBaggage(AddBaggageRequest addBaggageRequest) {

        Integer ticketId = addBaggageRequest.getTicketID();

        Optional<Ticket> ticket = ticketRepository.findById(ticketId);

        if (ticket.isEmpty()) {
            throw new BusifyAppException("Ticket does not exist.", BusifyError.TICKET_NOT_FOUND);
        }

        float weight = addBaggageRequest.getWeight().floatValue();
        float size = addBaggageRequest.getSize().floatValue();
        BaggageType baggageType = BaggageType.fromString(addBaggageRequest.getBaggageType());

        BaggageDto baggage = baggageService.addBaggage(ticket.get(), weight, size, baggageType);

        AddBaggageResponse response = ResponseConverter.createAddBaggageResponse(baggage);
        return ResponseEntity.ok(response);
    }
}

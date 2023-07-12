package com.busify.app.util;

import com.busify.codegen.model.GetUserTicketsResponse;
import com.busify.codegen.model.Ticket;
import com.busify.model.TicketDto;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Creates needed responses for each endpoint.
 */
public class ResponseFactory {
    public static GetUserTicketsResponse createGetUserTicketsResponse(List<TicketDto> ticketDtoList) {

        List<Ticket> tickets = ticketDtoList
                .stream()
                .map(ResponseFactory::mapToTicket)
                .collect(Collectors.toList());

        GetUserTicketsResponse getUserTicketsResponse = new GetUserTicketsResponse();
        getUserTicketsResponse.setTickets(tickets);

        return getUserTicketsResponse;
    }

    private static Ticket mapToTicket(TicketDto ticketDto) {
        Ticket ticket = new Ticket();
        ticket.setIdTicket(ticketDto.getId());
        ticket.setIdPassenger(ticketDto.getPassenger().getId());
        ticket.setTicketPrice(String.valueOf(ticketDto.getPriceValue()));
        ticket.setFirstName(ticketDto.getPassenger().getUser().getFirst_name());
        ticket.setLastName(ticketDto.getPassenger().getUser().getLast_name());
        return ticket;

//        TODO: We need other info!
    }
}

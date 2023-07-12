package com.busify.service.impl;

import com.busify.model.Passenger;
import com.busify.model.Ticket;
import com.busify.model.TicketDto;
import com.busify.model.User;
import com.busify.repository.PassengerRepository;
import com.busify.repository.TicketRepository;
import com.busify.service.TicketService;
import com.busify.util.UtilMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class TicketServiceImpl implements TicketService {

    private final TicketRepository ticketRepository;

    private final PassengerRepository passengerRepository;

    @Override
    public List<TicketDto> getFutureTicketsForUser(User user) {

        Passenger passenger = passengerRepository.findByUser(user);

        List<Ticket> tickets = ticketRepository.getAllFutureTicketsForUser(passenger);

        return tickets
                .stream()
                .map(ticket -> UtilMapper.mapTicketToDto(ticket, passenger))
                .collect(Collectors.toList());
    }
}

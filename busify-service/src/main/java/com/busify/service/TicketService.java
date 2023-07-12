package com.busify.service;

import com.busify.model.Ticket;
import com.busify.model.TicketDto;
import com.busify.model.User;
import java.util.List;

public interface TicketService {

    /**
     * Gets future tickets for a given user.
     *
     * @param user The user that owns the tickets.
     * @return List of {@link Ticket}
     */
    List<TicketDto> getFutureTicketsForUser(User user);
}

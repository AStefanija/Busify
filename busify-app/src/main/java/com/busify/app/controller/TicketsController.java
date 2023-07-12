package com.busify.app.controller;

import com.busify.app.util.ResponseFactory;
import com.busify.codegen.api.GetFutureUserTicketsApi;
import com.busify.codegen.model.GetFutureUserTicketsRequest;
import com.busify.codegen.model.GetUserTicketsResponse;
import com.busify.exception.BusifyAppException;
import com.busify.exception.BusifyError;
import com.busify.model.TicketDto;
import com.busify.model.User;
import com.busify.service.TicketService;
import com.busify.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@Slf4j
public class TicketsController implements GetFutureUserTicketsApi {

    private final TicketService ticketService;

    private final UserService userService;

//    TODO: Do a proper implementation of the API.
    public ResponseEntity<GetUserTicketsResponse> getFutureUserTickets(
            GetFutureUserTicketsRequest getFutureUserTicketsRequest) {

        Integer userId = Integer.valueOf(getFutureUserTicketsRequest.getUserId());
        Optional<User> user = userService.findById(userId);

        if(user.isEmpty())  {
            throw new BusifyAppException(String.format("User with id %d does not exist", userId),
                    BusifyError.USER_NOT_FOUND);
        }


        List<TicketDto> ticketDtoList = ticketService.getFutureTicketsForUser(user.get());

        GetUserTicketsResponse response = ResponseFactory.createGetUserTicketsResponse(ticketDtoList);
        return ResponseEntity.ok(response);
    }
}

package com.busify.service.impl;

import com.busify.model.Baggage;
import com.busify.model.BaggageDto;
import com.busify.model.BaggageType;
import com.busify.model.Ticket;
import com.busify.repository.BaggageRepository;
import com.busify.service.BaggageService;
import com.busify.util.UtilMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
@Slf4j
public class BaggageServiceImpl implements BaggageService {

    private final BaggageRepository baggageRepository;

    @Override
    public BaggageDto addBaggage(Ticket ticket, float weight, float size, BaggageType baggageType) {

//        TODO: How to call the function?
        Baggage newBaggage = baggageRepository.save(new Baggage(ticket, weight, size, baggageType));

        return UtilMapper.mapToBaggageDto(newBaggage);
    }
}

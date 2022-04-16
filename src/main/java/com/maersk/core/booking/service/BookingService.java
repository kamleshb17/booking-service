package com.maersk.core.booking.service;

import com.maersk.core.booking.model.to.PackageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class BookingService {

    @Autowired
    private IServiceFacade serviceFacade;

    public Mono<String> checkAvailability(final PackageRequest packageRequest) {
        return serviceFacade.checkAvailability(packageRequest);
    }
}

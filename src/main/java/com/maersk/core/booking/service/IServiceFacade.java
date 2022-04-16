package com.maersk.core.booking.service;

import com.maersk.core.booking.model.to.PackageRequest;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public interface IServiceFacade {

    Mono<String> checkAvailability(final PackageRequest packageRequest);
}

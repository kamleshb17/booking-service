package com.maersk.core.booking.controller;


import com.maersk.core.booking.model.to.PackageRequest;
import com.maersk.core.booking.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/bookings/")
public class BookingResource {

    @Autowired
    private BookingService bookingService;

    @PostMapping("checkAvailable")
    public Mono<String> getAvailability(final @RequestBody PackageRequest packageRequest){
        return bookingService.checkAvailability(packageRequest);
    }

}

package com.kunal_debug_png.shoonya.controller;

import com.kunal_debug_png.shoonya.entity.Booking;
import com.kunal_debug_png.shoonya.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookings")
public class BookingController {
    @Autowired
    private BookingService bookingService;

    @PostMapping("/book")
    public Booking createBooking(@RequestBody Booking booking) {
        return bookingService.createBooking(booking);
    }

    @GetMapping
    public List<Booking> getAllBookings(){
        return bookingService.getAll();
    }
}
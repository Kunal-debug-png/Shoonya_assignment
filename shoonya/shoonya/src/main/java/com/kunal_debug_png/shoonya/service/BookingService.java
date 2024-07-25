package com.kunal_debug_png.shoonya.service;



import com.kunal_debug_png.shoonya.entity.Booking;
import com.kunal_debug_png.shoonya.repository.BookingRepository;
import com.kunal_debug_png.shoonya.repository.RetreatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;




@Service
public class BookingService {
    @Autowired
    private BookingRepository bookingRepository;

    public Booking createBooking(Booking booking) {
        if (bookingRepository.existsByUserIdAndRetreatId(booking.getUserId(), booking.getRetreatId())) {
            throw new RuntimeException("Retreat already booked by the user");
        }
        return bookingRepository.save(booking);
    }

    public List<Booking> getAll() {
        return bookingRepository.findAll();
    }
}
package com.kunal_debug_png.shoonya.controller;

import com.kunal_debug_png.shoonya.entity.Booking;
import com.kunal_debug_png.shoonya.entity.Retreat;
import com.kunal_debug_png.shoonya.service.BookingService;
import com.kunal_debug_png.shoonya.service.RetreatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/retreats")
public class RetreatController {

    @Autowired
    private RetreatService retreatService;

    @GetMapping
    public Page<Retreat> getAllRetreats(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        Pageable pageable = PageRequest.of(page, size);
        return retreatService.getAllRetreats(pageable);
    }

    @GetMapping("/filter")
    public Page<Retreat> filterRetreats(
            @RequestParam String keyword,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        Pageable pageable = PageRequest.of(page, size);
        return retreatService.filterRetreats(keyword, pageable);
    }

    @GetMapping("/location")
    public Page<Retreat> filterByLocation(
            @RequestParam String location,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        Pageable pageable = PageRequest.of(page, size);
        return retreatService.filterByLocation(location, pageable);
    }

    @GetMapping("/search")
    public Page<Retreat> searchByTag(
            @RequestParam String tag,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        Pageable pageable = PageRequest.of(page, size);
        return retreatService.searchByTag(tag, pageable);
    }
}
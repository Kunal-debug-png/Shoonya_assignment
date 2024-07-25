package com.kunal_debug_png.shoonya.service;




import com.kunal_debug_png.shoonya.entity.Retreat;
import com.kunal_debug_png.shoonya.repository.RetreatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RetreatService {

    @Autowired
    private RetreatRepository retreatRepository;

    public Page<Retreat> getAllRetreats(Pageable pageable) {
        return retreatRepository.findAll(pageable);
    }

    public Page<Retreat> filterRetreats(String keyword, Pageable pageable) {
        return retreatRepository.findByTitleContainingOrDescriptionContaining(keyword, keyword, pageable);
    }

    public Page<Retreat> filterByLocation(String location, Pageable pageable) {
        return retreatRepository.findByLocation(location, pageable);
    }

    public Page<Retreat> searchByTag(String tag, Pageable pageable) {
        return retreatRepository.findByTagContaining(tag, pageable);
    }
}
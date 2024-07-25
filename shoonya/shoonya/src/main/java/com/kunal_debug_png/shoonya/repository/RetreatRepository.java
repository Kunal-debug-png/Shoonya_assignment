package com.kunal_debug_png.shoonya.repository;



import com.kunal_debug_png.shoonya.entity.Retreat;
import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface RetreatRepository extends JpaRepository<Retreat, Long> {


    Page<Retreat> findByTitleContainingOrDescriptionContaining(String title, String description, Pageable pageable);
    Page<Retreat> findByLocation(String location, Pageable pageable);
    Page<Retreat> findByTagContaining(String tag, Pageable pageable);
}
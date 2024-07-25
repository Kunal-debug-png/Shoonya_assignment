package com.kunal_debug_png.shoonya.repository;


import com.kunal_debug_png.shoonya.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
    boolean existsByUserIdAndRetreatId(Long userId, Long retreatId);
}

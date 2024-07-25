package com.kunal_debug_png.shoonya.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import jakarta.persistence.*;
import lombok.Data;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private String userName;
    private String userEmail;
    private String userPhone;
    @ManyToOne
    @JoinColumn(name = "retreat_id")
    private Retreat retreat;
    private String paymentDetails;
    private Long bookingDate;
}
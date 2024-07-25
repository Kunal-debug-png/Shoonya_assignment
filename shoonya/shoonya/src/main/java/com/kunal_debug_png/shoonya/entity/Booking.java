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

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_email")
    private String userEmail;

    @Column(name = "user_phone")
    private String userPhone;

    @Column(name = "retreat_id") // Use a consistent name here
    private Long retreatId;

    @Column(name = "retreat_title")
    private String retreatTitle;

    @Column(name = "retreat_location")
    private String retreatLocation;

    @Column(name = "retreat_price")
    private Integer retreatPrice;

    @Column(name = "retreat_duration")
    private Integer retreatDuration;

    @Column(name = "payment_details")
    private String paymentDetails;

    @Column(name = "booking_date")
    private Long bookingDate;


}
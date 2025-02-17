package com.example.rental.Modal;

import jakarta.persistence.*;

@Entity
public class Seller {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long seller_id;

    @OneToOne
    @JoinColumn(name = "person_id" , referencedColumnName = "person_id")
    private Person person;

    private String joined_date ;

}

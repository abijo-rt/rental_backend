package com.example.rental.Modal;

import jakarta.persistence.*;


@Entity
public class Buyer {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long buyer_id;

        @OneToOne
        @JoinColumn(name="person_id",referencedColumnName = "person_id")
        private Person peron;



}

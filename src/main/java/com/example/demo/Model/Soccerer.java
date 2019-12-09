package com.example.demo.Model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //encja - mapoj klase na tabele
@Data //Lombok zeby byly gettery, settery i inne
@ToString//zeby to string byl
//2 razy shift enable annotation processes
public class Soccerer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name, lastName;
    private int goals;
}

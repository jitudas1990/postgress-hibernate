package com.example.postgresqldemo.model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "person")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
public class Person {
    @Id
    private int id;
    private String name;
    private String address;


}

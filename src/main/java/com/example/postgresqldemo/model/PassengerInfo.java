package com.example.postgresqldemo.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="passenger_info")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class PassengerInfo {
    @Id
   // @GeneratedValue
    private Long pId;
    private String name;
    private String email;
    private String source;
    private String Destination;
    private String pickUptime;
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-mm-yyyy")
    private Date travelDate;
    private String arrivalTime;
    private Double fare;



}

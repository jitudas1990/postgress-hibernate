package com.example.postgresqldemo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name ="payment_info")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Data
public class PaymentInfo {
    @Id
   // @GeneratedValue(generator = "uuid2")
    //@GenericGenerator(name="uuid2",strategy = "org.hibernate.id.UUIDGenerator")
    private String paymentId;
    private String accountNo;
    private double amount;
    private String cardType;
    private Long passengerId;

   
}

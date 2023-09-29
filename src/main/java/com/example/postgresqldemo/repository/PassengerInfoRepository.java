package com.example.postgresqldemo.repository;

import com.example.postgresqldemo.model.PassengerInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerInfoRepository  extends JpaRepository<PassengerInfo,Long> {
}

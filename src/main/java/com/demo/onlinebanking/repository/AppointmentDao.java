package com.demo.onlinebanking.repository;

import com.demo.onlinebanking.entity.Appointment;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface AppointmentDao extends CrudRepository<Appointment, Long> {

    List<Appointment> findAll();
}
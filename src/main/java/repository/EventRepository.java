/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.util.Date;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 *
 * @author Pedro
 */
@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
     
    List<Event> findByEventType(String eventType);

    List<Event> findByEventDateBetween(Date startDate, Date endDate);

}
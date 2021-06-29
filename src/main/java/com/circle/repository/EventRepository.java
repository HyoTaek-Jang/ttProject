package com.circle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.circle.domain.Event;



public interface EventRepository extends JpaRepository<Event, Long> {

}

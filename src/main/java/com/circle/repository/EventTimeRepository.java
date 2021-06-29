package com.circle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.circle.domain.EventTime;



public interface EventTimeRepository extends JpaRepository<EventTime, Long> {

}

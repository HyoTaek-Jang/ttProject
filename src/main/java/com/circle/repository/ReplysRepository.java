package com.circle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.circle.domain.Advice;



public interface ReplysRepository extends JpaRepository<Advice, Long> {

}

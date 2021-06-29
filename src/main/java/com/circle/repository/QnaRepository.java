package com.circle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.circle.domain.Advice;



public interface QnaRepository extends JpaRepository<Advice, Long> {

}

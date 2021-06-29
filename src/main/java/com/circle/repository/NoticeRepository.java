package com.circle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.circle.domain.Notice;


public interface NoticeRepository extends JpaRepository<Notice, Long> {

}

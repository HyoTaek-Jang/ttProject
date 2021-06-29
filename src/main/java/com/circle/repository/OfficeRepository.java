package com.circle.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.circle.domain.Office;


public interface OfficeRepository extends JpaRepository<Office, Long> {
	
	//기업 이름으로 기업 조회 
		@Query("select o from Office o where o.officeName = ?1")
		public Office findByOfficeName(String officeName);
		
		//기업 사업자등록번호로 조회
		@Query("select o from Office o where o.officeCode =?1")
		public Office findByOfficeCode(Integer officeCode);
		
	
	
}

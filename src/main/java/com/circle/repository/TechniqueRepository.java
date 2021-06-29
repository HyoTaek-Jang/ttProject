package com.circle.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.circle.domain.Technique;


public interface TechniqueRepository extends JpaRepository<Technique, Long> {
	
	//활성화된 기술 조회 state: 1
	@Query("select t from technique t where t.state=1")
	public List<Technique> findByActiveTechnique();
	
	//비활성화된 기술 조회 state :0
	@Query("select t from technique t where t.state=0")
	public List<Technique> findByInactiveTechnique();
	
	//기술명으로 기술 조회 
	@Query("select t from technique t where t.techniqueName = ?1")
	public List<Technique> findByName(String techniqueName);
	
	//개발상태에 따라 기술 조회 
	
	//카테고리 이름으로 조회하기 
	
	
	

}

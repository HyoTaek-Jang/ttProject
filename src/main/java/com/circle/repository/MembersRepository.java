package com.circle.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.circle.domain.Members;



public interface MembersRepository extends JpaRepository<Members, Long> {
	
	//활성화된 회원 조회하기 state: 0,1 
	@Query("select m from Members m where m.state=0 or m.state=1")
	public List<Members> findByActiveMember();
	
	//비활성화된 회원 조회하기 state: 3
	@Query("select m from Members m where m.state=3")
	public List<Members> findByInactiveMember();
	
	//활성화된 기업회원 조회하기 state:1 
	@Query("select m from Members m where m.state=1")
	public List<Members> findByActiveOffice();
	
	//폰번호로 회원 조회하기 
	@Query("select m from Members m where m.phone = ?1")
	public Members findByPhone(String phone);
	
	//이름으로 회원 조회하기 
	@Query("select m from Members m where m.name = ?1")
	public Members findByName(String name);
	
	//기업아이디로 회원 조회하기 
	@Query("select m from Members m where m.office.officeId = ?1")
	public Members findByOfficeId(Long officeId);
	
	
}

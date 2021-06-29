package com.circle.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.circle.domain.Members;
import com.circle.domain.Orders;
import com.circle.domain.Technique;

@Service
public interface TechniqueService {
	
	

	/**
	 * Technique, TechniqueDetail, category, ApplicationBuyer, ApplicationSeller
	 * 
	 * */
	
	//사용자 
	/**
	 * 기술 전체 조회 
	 */
	public List<Technique> techniqueSelectAll();
	
	/**
	 * 활성회된 기술 조회 state: 1
	 */
	public List<Technique> techniqueSelectAactivatedAll();
	
	/**
	 * 비활성화된 기술 조회 state: 0
	 */
	public List<Technique> techniqueSelectInactivatedAll();
	
	
	/**
	 * 기술 카테고리 별로 검색 -동적쿼리 
	 */
	
	/**
	 * 기술 이름으로 조회 
	 */
	public List<Technique> techniqueSelectByName();
	
	/**
	 * 카테고리 이름으로 조회하기 
	 */
	public List<Technique> categorySelectByCategoryName();
	
	/**
	 * 개발상태에 따라 기술 조회하기 
	 */
	public List<Technique> techniqueSelectByTechniqueCondiction();
	
	/**
	 * 기술 아이디로 조회  
	 */
	public List<Technique> techniqueSelectById();
	
	/**
	 * 주문표에 넣기
	 */
	public void orderInsert(String id, Long newTechnique);
	
	/**
	 * 주문표 조회
	 */
	public List<Orders> orderSelectAll(String id);

	/**
	 * 주문표 삭제
	 */
	public void orderDelete(Members id, Long OrderId, Long newTechniqueId);
	
	
	
	//관리자 
	
	/**
	 * 기술 상태 변경하기 state: 0->1
	 */
	
	/**
	 * ApplicationBuyer 신청서 조회하기 
	 */
	
	/**
	 * ApplicationSeller 신청서 조회하기 
	 */
	
	
}

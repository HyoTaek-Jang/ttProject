package com.circle.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.circle.domain.Members;
import com.circle.domain.Notice;
import com.circle.domain.Office;

@Service
public interface UserService {

	/**
	 * Memers, Office, Notice, Qna 
	 */
	
	//Memebers table
	/**
	 * 회원가입 
	 */
	Members memberLogin(String phone, String password);
	
	/**
	 * 회원 정보수정하기 
	 */
	public void memberUpdate(Members member);
	
	/**
	 * 회원 상태변경하기 
	 */
	public void changeMemberState(Long memberId);
	
	/**
	 * 회원 전체조회하기 
	 */
	public List<Members> membersSelectAll();
	
	/**
	 * 회원 아이디로 조회하기 
	 */
	public List<Members> memberSelectByMemberId();
	
	/**
	 * 활성화된 회원 조회하기 state: 0,1 
	 */
	public List<Members> mamberSelectAactivatedAll();
	
	/**
	 * 비활성화된 회원 조회하기 state: 3
	 */
	public List<Members> mamberSelectInactivatedAll();
	
	/**
	 * 회원 기업아이디로 조회하기 
	 */
	public List<Members> mamberSelectByOfficeId();
	
	/**
	 * phone 번호로 회원 조회하기 
	 */
	public List<Members> memberSelectByPhone();
	
	
	/**
	 * 회원 로그인 
	 */
	public int memberInsert(Members member);
	
	
	//Notice table
	/**
	 * 공지사항 전체조회하기 
	 */
	public List<Notice> noticeSelectAll();
	
	
	/**
	 * 공지사항 아이디로 조회 
	 */
	public List<Notice> noticeSelectById();
	
	/**
	 * 공지사항 추가하기 
	 */
	public int noticeInsert(Notice notice);
	
	
	/**
	 * 공지사항 수정하기 
	 */
	public void noticeUpdate(Notice notice);
	
	/**
	 * 공지사항 삭제하기 
	 */
	public int noticeDelete(Long noticeId);
	
	
	//Office (기업)
	/**
	 * 기업 전체 조회하기 
	 */
	public List<Office> officeSelectAll();
	
	
	/**
	 * 활성화된 기업 조회하기 
	 */
	public List<Office> officeSelectAactivatedAll();
	
	/**
	 * 기업 상태 바꿔주기 0 -> 1
	 */
	public void changeOfficeState(Long officeId);
	
	/**
	 * 기업 이름으로 조회하기 
	 */
	public List<Office> officeSelectByName();
	
	/**
	 * 기업 아이디로 조회하기 
	 */
	public List<Office> officeSelectById();
	
	
	/**
	 * 기업 사업자등록번호로 조회하기 
	 */
	public List<Office> officeSelectByOfficeCode();
	
	
	
	
	
	
	
}

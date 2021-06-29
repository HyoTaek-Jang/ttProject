package com.circle.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 기업 
 * */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@DynamicInsert
@DynamicUpdate
public class Office {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_office")
	@SequenceGenerator(sequenceName = "seq_office", name="seq_office", allocationSize = 1 )
	Long officeId;
	
	String officeName;
	
	//회사 국가 
	String nation;
	
	String address;
	
	//사업자등록번호 
	Integer officeCode;
	
	//회사 설립년도 
	Integer establishmentYear;
	
	String website;
	
	//사업분야 
	String businessFiled;
	
	//자본금 
	Integer capital;
	
	//자산 
	Integer property;
	
	//부채 
	Integer dept;
	
	//전기매출 
	Integer lastyearResult;
	
	//당기매출 
	Integer thisyearResult;
	
	//예상매출 
	Integer expectSales;
	
	//행사 담당자 이름
	String eventName;
	
	//담장자 연락처
	String eventPhone;
	
	//상태 관리자 승인 필요 
	/**
	 *  0 -승인안됨 
	 *  1 -승인된 회사 
	 */
	Integer state;
	
	
}

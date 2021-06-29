package com.circle.domain;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 판매자 신청서   
 * */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@DynamicInsert
@DynamicUpdate
public class ApplicationSeller {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_applicationSeller")
	@SequenceGenerator(sequenceName = "seq_applicationSeller", name="seq_applicationSeller", allocationSize = 1 )
	Long applicationSellerId;
	 
	//기술명 
	String techniqueName;;
	
	//특허번호 
	Integer patentNum;
	
	//과제고유번호 
	Integer serialNum;
	
	//희망금액_최소
	Integer paymentMin;
	
	//희망금액_최대
	Integer paymentMax;
	
	//키워드
	String keyword;
	
	//이전희망유형
	
	//응용분야
	String applicationField;
	
	//기술개요
	String techniqueDiscription;
	
	//필요설비 
	String equipment;
	
	//기술 사진
	String techniqueImg;
	
	//상태 
	Integer state;

	@ManyToOne
	@JoinColumn(name="membersId")
	Members members;
	
	
	
}

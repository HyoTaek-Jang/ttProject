package com.circle.domain;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
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
 * 기술   
 * */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@DynamicInsert
@DynamicUpdate
public class Technique {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_technique")
	@SequenceGenerator(sequenceName = "seq_technique", name="seq_technique", allocationSize = 1 )
	Long techniqueId;
	 
	//기술명 
	String techniqueName;;
	
	//시작일 
	String startDate;
	
	//종료일
	String finishDate;
	
	//과제고유번호 
	Integer serialNum;
	
	//특허번호 
	Integer patentNum;
	
	//기술번호 
	Integer techniqueNum;
	
	//기술 사진
	String techniqueImg;
	
	//개발상태 
	String developmentCondition;
	
	//상태 관리자 승인 
	/**
	 * 0 -승인안됨
	 * 1 -승인됨 
	 */
	Integer state;

	@ManyToOne
	@JoinColumn(name="countryId")
	Country country;
	
	@OneToOne
	@JoinColumn(name="techniqueDetailId")
	TechniqueDetail techniqueDetail;
	
	
}

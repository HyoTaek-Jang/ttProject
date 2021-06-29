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
 * 기술 상세   
 * */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@DynamicInsert
@DynamicUpdate
public class TechniqueDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_techniqueDetail")
	@SequenceGenerator(sequenceName = "seq_techniqueDetail", name="seq_techniqueDetail", allocationSize = 1 )
	Long techniqueDetailId;
	 
	//기술금액 
	Integer price;
	
	//기술지역 
	String techniqueRegion;
	
	//키워드 
	String keywords;
	
	//기술내용 
	String techniqueDescription;
	
	//구매조건 
	String conditions;
	
	//희망시기 
	String hopeTime;
	
	//상태 
	Integer state;

	
}

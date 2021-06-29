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
 * 구매자 신청서   
 * */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@DynamicInsert
@DynamicUpdate
public class ApplicationBuyer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_applicationBuyer")
	@SequenceGenerator(sequenceName = "seq_applicationBuyer", name="seq_applicationBuyer", allocationSize = 1 )
	Long applicationBuyerId;
	 
	//희망금액_최소
	Integer paymentMin;
	
	//희망금액_최대
	Integer paymentMax;
	
	//상태 
	Integer state;

	@ManyToOne
	@JoinColumn(name="membersId")
	Members members;
	
	@ManyToOne
	@JoinColumn(name="techniqueId")
	Technique technique;
	
	
	
}

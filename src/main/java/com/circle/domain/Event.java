package com.circle.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 행사  
 * */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@DynamicInsert
@DynamicUpdate
public class Event {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_event")
	@SequenceGenerator(sequenceName = "seq_event", name="seq_event", allocationSize = 1 )
	Long eventId;
	
	//행사이름 
	String name;
	
	//행사타입 
	String officeType;
	
	//관심분야 
	String interestField;
	
	//행사 주최국가 
	String nation;
	
	//행사시작일  
	String startDate;
	
	//행사종료일  
	String finishDate;
	
	//상태 
	Integer state;
	
	@ManyToOne
	@JoinColumn(name="officeId")
	Office office;
	
	
	
}

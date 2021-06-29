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
 * 행사타입 , 다대다   
 * */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@DynamicInsert
@DynamicUpdate
public class EventInterestType {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_eventInterestType")
	@SequenceGenerator(sequenceName = "seq_eventInterestType", name="seq_eventInterestType", allocationSize = 1 )
	Long seq_eventInterestTypeId;
	
	//관심키워드 이름 
	String name;
	
	
}

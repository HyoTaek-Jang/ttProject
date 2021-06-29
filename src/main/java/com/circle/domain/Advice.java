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
 * 상담신청하기   
 * */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@DynamicInsert
@DynamicUpdate
public class Advice {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_advice")
	@SequenceGenerator(sequenceName = "seq_advice", name="seq_advice", allocationSize = 1 )
	Long adviceId;
	 
	String content;
	
	String title;
	
	Integer advicePassword;
	
	@Temporal(TemporalType.TIMESTAMP)
	Date regDate;
	
	//상태 
	Integer state;
	
	@ManyToOne
	@JoinColumn(name="membersId")
	Members members;
	
	@ManyToOne
	@JoinColumn(name="techniqueId")
	Technique techniqueId;
	
	
	
}

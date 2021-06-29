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
 * 행사 타입
 * */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@DynamicInsert
@DynamicUpdate
public class EventType {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_eventType")
	@SequenceGenerator(sequenceName = "seq_eventType", name="seq_eventType", allocationSize = 1 )
	Long eventTypeId;
	
	@ManyToOne
	@JoinColumn(name="eventId")
	Event eventId;
	
	@ManyToOne
	@JoinColumn(name="eventInterestTypeId")
	Event eventInterestTypeId;
	
	
	
}

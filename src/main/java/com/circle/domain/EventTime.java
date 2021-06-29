package com.circle.domain;

import java.util.Date;

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
 * 주문테이블 
 * */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@DynamicInsert
@DynamicUpdate
public class EventTime {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_order")
	@SequenceGenerator(sequenceName = "seq_order", name="seq_order", allocationSize = 1 )
	Long orderId;
	
	//주문일자 
	String oderDate;

	//상태 
	Integer state;
	
	@ManyToOne
	@JoinColumn(name="applicationBuyerId")
	ApplicationBuyer applicationBuyer;
	
	
}

package com.circle.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
 * 주문테이블 
 * */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Orders {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_orders")
	@SequenceGenerator(sequenceName = "seq_orders", name="seq_orders", allocationSize = 1 )
	Long ordersId;
	
	//주문일자
	@Temporal(TemporalType.TIMESTAMP)
	Date orderDate;

	//상태 
	Integer state;
	
//	@OneToOne
//	@JoinColumn(name="applicationBuyerId")
//	ApplicationBuyer applicationBuyer;
	
	
}

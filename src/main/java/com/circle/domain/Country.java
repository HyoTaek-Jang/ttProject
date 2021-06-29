package com.circle.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 판매국가 
 * */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@DynamicInsert
@DynamicUpdate
public class Country {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_country")
	@SequenceGenerator(sequenceName = "seq_country", name="seq_country", allocationSize = 1 )
	Long countryId;
	
	//국가이름 
	String countryName;;
	
	//국가코드 
	Integer code;
	
	//상태 
	Integer state;
	
	
}

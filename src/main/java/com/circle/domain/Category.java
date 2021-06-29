package com.circle.domain;


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
 * 카테고리 
 * */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@DynamicInsert
@DynamicUpdate
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_category")
	@SequenceGenerator(sequenceName = "seq_category", name="seq_category", allocationSize = 1 )
	Long categoryId;
	
	String categoryName;;
	
	
}

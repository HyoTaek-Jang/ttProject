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
 * 기술 카테고리 
 * */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@DynamicInsert
@DynamicUpdate
public class TechniqueCategory {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_techniqueCategory")
	@SequenceGenerator(sequenceName = "seq_techniqueCategory", name="seq_techniqueCategory", allocationSize = 1 )
	Long techniqueCategoryId;
	
	@ManyToOne
	@JoinColumn(name="categoryId")
	Category category;
	
	@ManyToOne
	@JoinColumn(name="techniqueId")
	Technique technique;
	
	
}

package com.circle.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Authority {


	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_authority")
	@SequenceGenerator(sequenceName = "seq_authority", name="seq_authority", allocationSize = 1 )
	private Long authorityId;
	
	@Column(name = "role")
	private String role;

	@Column(name = "membersId")
	Long membersId;
	
}

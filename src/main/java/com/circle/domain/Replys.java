package com.circle.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
 * 답글 테이블  (상담신청) 
 * */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@DynamicInsert
@DynamicUpdate
public class Replys {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_replys")
	@SequenceGenerator(sequenceName = "seq_replys", name="seq_replys", allocationSize = 1 )
	Long replysId;
	
	//등록일
	@Temporal(TemporalType.TIMESTAMP)
	Date regDate;
	
	//상태 
	Integer state;
	
	@ManyToOne
	@JoinColumn(name="qnaId")
	Advice qnaId;
	
	@ManyToOne
	@JoinColumn(name="ref_replys")
	private Replys parentReplys;
	
	
}

package com.circle.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
 * 공지사항 
 * */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@DynamicInsert
@DynamicUpdate
public class Notice {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_notice")
	@SequenceGenerator(sequenceName = "seq_notice", name="seq_notice", allocationSize = 1 )
	Long noticeId;
	
	String title;
	
	String content;
	
	//작성일 
	@Temporal(TemporalType.TIMESTAMP)
	Date regDate;
	
}

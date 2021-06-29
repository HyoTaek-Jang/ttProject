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
 * 회원   
 * */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@DynamicInsert
@DynamicUpdate
public class Members {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_members")
	@SequenceGenerator(sequenceName = "seq_members", name="seq_members", allocationSize = 1 )
	Long membersId;
	 
	String name;
	
	//회원 아이디 
	String id;
	
	String password;
	
	String phone;
	
	//직책 
	String position;
	
	String email;
	
	String address;
	
	Integer membersCode;
	
	//가입일 
	@Temporal(TemporalType.TIMESTAMP)
	Date regDate;
	
	
	/**
	 *  0 -일반회원 
	 *  1 -기업회원 
	 *  2 -관리자 
	 *  3 -비활성화 
	 *  4 -탈퇴 
	 */
	Integer state;
	
	@OneToOne
	@JoinColumn(name="officeId")
	Office office;
	
	
	
}

package com.xworkz.mani.Entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "singin_information")

@NamedQuery(name = "findAll", query = "select ent from SingInEntity ent")

@NamedQuery(name = "findByCount", query = "select count(*) from SingInEntity ent where ent.userId=:u or ent.email=:e or ent.mobile=:m")

@NamedQuery(name = "emailId", query = "select count(*) from  SingInEntity ent where ent.email=:emailby")

@NamedQuery(name = "userId", query = "select count(*) from  SingInEntity ent where ent.userId=:userby")

@NamedQuery(name = "mobileId", query = "select count(*) from  SingInEntity ent where ent.mobile=:mobileBy")

@NamedQuery(name = "updateLoginCount", query = "update SingInEntity ent set ent.loginCount=:logcount where ent.userId=:userID")

@NamedQuery(name = "resetPassword", query = "select ent from SingInEntity ent where ent.email=:emailIdby")

@NamedQuery(name = "user", query = "select ent from SingInEntity ent where ent.userId=:userinfo")

@NamedQuery(name = "updatePassword", query = "update SingInEntity ent set ent.password=:userpassword , ent.resetPassword=:resetpassword, ent.expTime=:exp where ent.userId=:uId")

public class SingInEntity implements Serializable{

	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "s_id")
	private int id;

	@Column(name = "s_userId")
	private String userId;

	@Column(name = "s_email")
	private String email;

	@Column(name = "s_mobile")
	private long mobile;

	@Column(name = "s_password")
	private String password;

	@Column(name = "s_aggrement")
	private Boolean agreement;

	@Column(name = "s_createdBy")
	private String createdBy;

	@Column(name = "s_createdDate")
	private LocalDateTime createdDate;

	@Column(name = "s_updatedBy")
	private String updatedBy;

	@Column(name = "s_updatedDate")
	private LocalDateTime updatedDate;

	@Column(name = "s_logincount")
	private int loginCount;

	@Column(name = "s_resetpassword")
	private Boolean resetPassword;

	@Column(name = "s_expTime")
	private LocalTime expTime;

	@Column(name = "s_picName")
	private String picName;
	
	@OneToMany(mappedBy = "SingInEntity", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<TechnologyEntity> technology;
}

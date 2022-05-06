package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Profile {
	
	@Id
	private Integer profId;
	private String pcode;
	private String idType;
	private Integer idNum;
	private String addr;
	
	
	public Profile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Profile(Integer profId, String pcode, String idType,Integer pidNum,String addr) {
		super();
		this.profId = profId;
		this.pcode = pcode;
		this.idType = idType;
		this.idNum = idNum;
		this.addr = addr;
	}
	public Integer getProfId() {
		return profId;
	}
	public void setProfId(Integer profId) {
		this.profId = profId;
	}
	public String getPcode() {
		return pcode;
	}
	public void setPcode(String pcode) {
		this.pcode = pcode;
	}
	public String getIdType() {
		return idType;
	}
	public void setIdType(String idType) {
		this.idType = idType;
	}
	public Integer getIdNum() {
		return idNum;
	}
	public void setIdNum(Integer idNum) {
		this.idNum = idNum;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
	

}

package com.example.entity;

import java.sql.Date;

public class Kojin {
	private Integer KojinId;
	private String ShimeKanJi;
	private Integer RireKisu;
	private String KouShiNsha;
	private Date KoushinHiduke;
	private String SakuseiSha;
	private Date SakuseiHiduke;
	private Integer DelFlag;
	private Integer Status;
	public Integer getKojinid() {
		return KojinId;
	}
	public void setKojinid(Integer kojinId) {
		KojinId = kojinId;
	}
	public String getShimeKanJi() {
		return ShimeKanJi;
	}
	public void setShimeKanJi(String shimeKanJi) {
		ShimeKanJi = shimeKanJi;
	}
	public Integer getRireKisu() {
		return RireKisu;
	}
	public void setRireKisu(Integer rireKisu) {
		RireKisu = rireKisu;
	}
	public String getKoushiNsha() {
		return KouShiNsha;
	}
	public void setKoushiNsha(String kouShiNsha) {
		KouShiNsha = kouShiNsha;
	}
	public Date getKoushinHiduke() {
		return KoushinHiduke;
	}
	public void setKoushinHiduke(Date koushinHiduke) {
		KoushinHiduke = koushinHiduke;
	}
	public String getSakuseiSha() {
		return SakuseiSha;
	}
	public void setSakuseiSha(String sakuseiSha) {
		SakuseiSha = sakuseiSha;
	}
	public Date getSakuseiHiduke() {
		return SakuseiHiduke;
	}
	public void setSakuseiHiduke(Date sakuseiHiduke) {
		SakuseiHiduke = sakuseiHiduke;
	}
	public Integer getDelFlag() {
		return DelFlag;
	}
	public void setDelFlag(Integer delFlag) {
		DelFlag = delFlag;
	}
	public Integer getStatus() {
		return Status;
	}
	public void setStatus(Integer status) {
		Status = status;
	}
}

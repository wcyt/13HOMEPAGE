package com.example.entity;

import lombok.Data;

import java.util.Date;
//20220703 wangyide:beanの追加

@Data
public class Role {
    private Integer Rid;
    private String Rname;
    private Integer Rtype;
    private String KouShinSha;
    private Date KouShinHiDuke;
    private String SakuSeiSha;
    public Integer getRid() {
		return Rid;
	}
	public void setRid(Integer rid) {
		Rid = rid;
	}
	public String getRname() {
		return Rname;
	}
	public void setRname(String rname) {
		Rname = rname;
	}
	public Integer getRtype() {
		return Rtype;
	}
	public void setRtype(Integer rtype) {
		Rtype = rtype;
	}
	public String getKouShinSha() {
		return KouShinSha;
	}
	public void setKouShinSha(String kouShinSha) {
		KouShinSha = kouShinSha;
	}
	public Date getKouShinHiDuke() {
		return KouShinHiDuke;
	}
	public void setKouShinHiDuke(Date kouShinHiDuke) {
		KouShinHiDuke = kouShinHiDuke;
	}
	public String getSakuSeiSha() {
		return SakuSeiSha;
	}
	public void setSakuSeiSha(String sakuSeiSha) {
		SakuSeiSha = sakuSeiSha;
	}
	public Date getSakuSeiHiDuke() {
		return SakuSeiHiDuke;
	}
	public void setSakuSeiHiDuke(Date sakuSeiHiDuke) {
		SakuSeiHiDuke = sakuSeiHiDuke;
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
	private Date SakuSeiHiDuke;
    private Integer DelFlag;
    private Integer Status;
	
}

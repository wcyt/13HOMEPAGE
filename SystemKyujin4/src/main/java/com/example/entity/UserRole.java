package com.example.entity;

import lombok.Data;

import java.util.Date;
//20220703 wangyide:beanの追加

@Data
public class UserRole {
    private Integer URid;
    public Integer getURid() {
		return URid;
	}
	public void setURid(Integer uRid) {
		URid = uRid;
	}
	public Integer getUid() {
		return Uid;
	}
	public void setUid(Integer uid) {
		Uid = uid;
	}
	public Integer getRid() {
		return Rid;
	}
	public void setRid(Integer rid) {
		Rid = rid;
	}
	public String getUname() {
		return Uname;
	}
	public void setUname(String uname) {
		Uname = uname;
	}
	public String getRname() {
		return Rname;
	}
	public void setRname(String rname) {
		Rname = rname;
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
	private Integer Uid;
    private Integer Rid;
    private String Uname;
    private String Rname;
    private String KouShinSha;
    private Date KouShinHiDuke;
    private String SakuSeiSha;
    private Date SakuSeiHiDuke;
    private Integer DelFlag;
    private Integer Status;
}

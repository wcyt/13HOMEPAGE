package com.example.entity;

import lombok.Data;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;
//20220703 wangyide:beanの追加
@Data
public class User {
    private Integer UserId;
    @NotBlank(message = "{MSG_A0001}")
    private String UName;
    @NotBlank(message = "{MSG_A0004}")
    @Size(min = 8,max = 20,message = "{MSG_A0004}")
    private String UPassword;
    @NotBlank(message = "{MSG_A0002}")
    private String Mail;
    private String KouShinSha;
	private Date KouShinHiDuke;
    private String SakuSeiSha;
    private Date SakuSeiHiDuke;
    private Integer DelFlag;
    private Integer Status;
	public Integer getUserId() {
		return UserId;
	}
	public void setUserId(Integer userId) {
		UserId = userId;
	}
	public String getUName() {
		return UName;
	}
	public void setUName(String uName) {
		UName = uName;
	}
	public String getUPassword() {
		return UPassword;
	}
	public void setUPassword(String uPassword) {
		UPassword = uPassword;
	}
	public String getMail() {
		return Mail;
	}
	public void setMail(String mail) {
		Mail = mail;
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
    
    

}

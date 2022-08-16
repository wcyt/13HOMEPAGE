package com.example.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Kyujin {
    private Integer KJId;
    public Integer getKJId() {
		return KJId;
	}
	public void setKJId(Integer kJId) {
		KJId = kJId;
	}
	public Integer getKaishaId() {
		return KaishaId;
	}
	public void setKaishaId(Integer kaishaId) {
		KaishaId = kaishaId;
	}
	public String getYakuShokuName() {
		return YakuShokuName;
	}
	public void setYakuShokuName(String yakuShokuName) {
		YakuShokuName = yakuShokuName;
	}
	 public String getYakuShokuShimei() {
			return YakuShokuShimei;
	}
	public void setYakuShokuShimei(String yakuShokuShimei) {
			YakuShokuShimei = yakuShokuShimei;
	}
	public String getYakuShokuWork() {
			return YakuShokuWork;
	}
	public void setYakuShokuWork(String yakuShokuWork) {
			YakuShokuWork = yakuShokuWork;
	}
	public String getKaishaName() {
		return KaishaName;
	}
	public void setKaishaName(String kaishaName) {
		KaishaName = kaishaName;
	}
	public Integer getKyoyu() {
		return Kyoyu;
	}
	public void setKyoyu(Integer kyoyu) {
		Kyoyu = kyoyu;
	}
	public String getJusho1() {
		return Jusho1;
	}
	public void setJusho1(String jusho1) {
		Jusho1 = jusho1;
	}
	public String getJusho2() {
		return Jusho2;
	}
	public void setJusho2(String jusho2) {
		Jusho2 = jusho2;
	}
	public String getJusho3() {
		return Jusho3;
	}
	public void setJusho3(String jusho3) {
		Jusho3 = jusho3;
	}
	public String getKinmuChi() {
		return KinmuChi;
	}
	public void setKinmuChi(String kinmuChi) {
		KinmuChi = kinmuChi;
	}
	public Integer getTele() {
		return Tele;
	}
	public void setTele(Integer tele) {
		Tele = tele;
	}
	public String getMail() {
		return Mail;
	}
	public void setMail(String mail) {
		Mail = mail;
	}
	public String getBiko() {
		return Biko;
	}
	public void setBiko(String biko) {
		Biko = biko;
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
	private Integer KaishaId;
    private String YakuShokuName;
	private String YakuShokuShimei;
    private String YakuShokuWork;
    private String KaishaName;
    private Integer Kyoyu;
    private String Jusho1;
    private String Jusho2;
    private String Jusho3;
    private String KinmuChi;
    private Integer Tele;
    private String Mail;
    private String Biko;
    private String KouShinSha;
    private Date KouShinHiDuke;
    private String SakuSeiSha;
    private Date SakuSeiHiDuke;
    private Integer DelFlag;
    private Integer Status;
}

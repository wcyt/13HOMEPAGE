package com.example.kyujinsts.entity;

import lombok.Data;

import java.util.Date;

@Data
public class ROLE {
    private Integer R_ID;
    private String R_NAME;
    private Integer R_TYPE;
    private String KOUSHIN_SHA;
    private Date KOUSHIN_HIDUKE;
    private String SAKUSEI_SHA;
    private Date SAKUSEI_HIDUKE;
	public Object getR_TYPE() {
		// TODO Auto-generated method stub
		return null;
	}
}

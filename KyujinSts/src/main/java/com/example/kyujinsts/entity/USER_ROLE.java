package com.example.kyujinsts.entity;

import lombok.Data;

import java.util.Date;

@Data
public class USER_ROLE {
    private Integer UR_ID;
    private Integer U_ID;
    private Integer R_ID;
    private String KOUSHIN_SHA;
    private Date KOUSHIN_HIDUKE;
    private String SAKUSEI_SHA;
    private Date SAKUSEI_HIDUKE;
    private Integer DEL_FLAG;
}

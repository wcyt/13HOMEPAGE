package com.example.kyujinsts.entity;

import lombok.Data;

import java.util.Date;

@Data
public class KAISHA {

    private Integer KAISHA_ID;
    private String KAISHA_NAME;
    private Integer RIREKI_SU;
    private String KOUSHIN_SHA;
    private Date KOUSHIN_HIDUKE;
    private String SAKUSEI_SHA;
    private Date SAKUSEI_HIDUKE;
}

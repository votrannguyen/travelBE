package io.javabrains.springsecurityjpa.bean.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "culinary")
public class Culinary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "culinary_id")
    @JsonProperty("culinaryId")
    private Integer culinaryId;

    @Column(name = "culinary_name")
    @JsonProperty("culinaryName")
    private String culinaryName;

    @Column(name = "culinary_img")
    @JsonProperty("culinaryImg")
    private String culinaryImg;

    @Column(name = "create_by")
    @JsonProperty("createBy")
    private Integer createBy;

    //Create Date
    @Column(name = "create_date")
    @JsonProperty("createDate")
    private Date createDate;

    //Update By
    @Column(name = "update_by")
    @JsonProperty("updateBy")
    private Integer updateBy;

    //Update Date
    @Column(name = "update_date")
    @JsonProperty("updateDate")
    private Date updateDate;

    @Column(name = "del_flg")
    @JsonProperty("delFlg")
    private String delFlg = "0";
}

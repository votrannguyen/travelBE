package io.javabrains.springsecurityjpa.bean.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "introduce_img")
public class IntroduceImg {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "introduce_img_id")
    @JsonProperty("introduceImgId")
    private Integer introduceImgId;

    @Column(name = "introduce_img_name")
    @JsonProperty("introduceImgName")
    private String introduceImgName;

    @Column(name = "introduce_img_path")
    @JsonProperty("introduceImgPath")
    private String introduceImgPath;

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



    public Integer getIntroduceImgId() {
        return introduceImgId;
    }

    public void setIntroduceImgId(Integer introduceImgId) {
        this.introduceImgId = introduceImgId;
    }

    public String getIntroduceImgName() {
        return introduceImgName;
    }

    public void setIntroduceImgName(String introduceImgName) {
        this.introduceImgName = introduceImgName;
    }

    public String getIntroduceImgPath() {
        return introduceImgPath;
    }

    public void setIntroduceImgPath(String introduceImgPath) {
        this.introduceImgPath = introduceImgPath;
    }

    public Integer getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getDelFlg() {
        return delFlg;
    }

    public void setDelFlg(String delFlg) {
        this.delFlg = delFlg;
    }

    public IntroduceImg() {
    }

    public IntroduceImg(Integer introduceImgId, String introduceImgName, String introduceImgPath, Integer createBy, Date createDate, Integer updateBy, String delFlg) {
        this.introduceImgId = introduceImgId;
        this.introduceImgName = introduceImgName;
        this.introduceImgPath = introduceImgPath;
        this.createBy = createBy;
        this.createDate = createDate;
        this.updateBy = updateBy;
        this.delFlg = delFlg;
    }

    public IntroduceImg(String introduceImgName, String introduceImgPath, Integer createBy, Date createDate, Integer updateBy, Date updateDate, String delFlg) {
        this.introduceImgName = introduceImgName;
        this.introduceImgPath = introduceImgPath;
        this.createBy = createBy;
        this.createDate = createDate;
        this.updateBy = updateBy;
        this.updateDate = updateDate;
        this.delFlg = delFlg;
    }
}

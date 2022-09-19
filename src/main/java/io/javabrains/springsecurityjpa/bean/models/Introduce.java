package io.javabrains.springsecurityjpa.bean.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "introduce")
public class Introduce {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "introduce_id")
    @JsonProperty("introduceId")
    private Integer introduceId;

    @Column(name = "introduce_name")
    @JsonProperty("introduceName")
    private String introduceName;

    @Column(name = "introduce_title")
    @JsonProperty("introduceTitle")
    private String introduceTitle;

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

    public Introduce() {
    }

    public Introduce(Integer introduceId, String introduceName, String introduceTitle, Integer createBy, Date createDate, Integer updateBy, Date updateDate, String delFlg) {
        this.introduceId = introduceId;
        this.introduceName = introduceName;
        this.introduceTitle = introduceTitle;
        this.createBy = createBy;
        this.createDate = createDate;
        this.updateBy = updateBy;
        this.updateDate = updateDate;
        this.delFlg = delFlg;
    }

    public Introduce(String introduceName, String introduceTitle, Integer createBy, Date createDate, Integer updateBy,
                     Date updateDate, String delFlg) {
        this.introduceName = introduceName;
        this.introduceTitle = introduceTitle;
        this.createBy = createBy;
        this.createDate = createDate;
        this.updateBy = updateBy;
        this.updateDate = updateDate;
        this.delFlg = delFlg;
    }

    public Integer getIntroduceId() {
        return introduceId;
    }

    public void setIntroduceId(Integer introduceId) {
        this.introduceId = introduceId;
    }

    public String getIntroduceName() {
        return introduceName;
    }

    public void setIntroduceName(String introduceName) {
        this.introduceName = introduceName;
    }

    public String getIntroduceTitle() {
        return introduceTitle;
    }

    public void setIntroduceTitle(String introduceTitle) {
        this.introduceTitle = introduceTitle;
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
}

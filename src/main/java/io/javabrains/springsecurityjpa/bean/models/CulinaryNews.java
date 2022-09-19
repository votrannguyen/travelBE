package io.javabrains.springsecurityjpa.bean.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "culinary_news")
public class CulinaryNews {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "culinary_news_id")
    @JsonProperty("culinaryNewsId")
    private Integer culinaryNewsId;

    @Column(name = "culinary_news_name")
    @JsonProperty("culinaryNewsName")
    private String culinaryNewsName;

    @Column(name = "culinary_news_description")
    @JsonProperty("culinaryNewsDescription")
    private String culinaryNewsDescription;

    @Column(name = "culinary_news_star")
    @JsonProperty("culinaryNewsStar")
    private Integer culinaryNewsStar;

    @Column(name = "culinary_news_time")
    @JsonProperty("culinaryNewsTime")
    private String culinaryNewsTime;

    @Column(name = "culinary_news_address")
    @JsonProperty("culinaryNewsAddress")
    private Integer culinaryNewsAddress;

    @Column(name = "culinary_news_video")
    @JsonProperty("culinaryNewsVideo")
    private String culinaryNewsVideo;

    @Column(name = "culinary_news_price")
    @JsonProperty("culinaryNewsPrice")
    private String culinaryNewsPrice;

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

    public CulinaryNews() {
    }

    public CulinaryNews(Integer culinaryNewsId, String culinaryNewsName, String culinaryNewsDescription, Integer culinaryNewsStar, String culinaryNewsTime, Integer culinaryNewsAddress, String culinaryNewsVideo, String culinaryNewsPrice, Integer createBy, Date createDate, Integer updateBy, Date updateDate, String delFlg) {
        this.culinaryNewsId = culinaryNewsId;
        this.culinaryNewsName = culinaryNewsName;
        this.culinaryNewsDescription = culinaryNewsDescription;
        this.culinaryNewsStar = culinaryNewsStar;
        this.culinaryNewsTime = culinaryNewsTime;
        this.culinaryNewsAddress = culinaryNewsAddress;
        this.culinaryNewsVideo = culinaryNewsVideo;
        this.culinaryNewsPrice = culinaryNewsPrice;
        this.createBy = createBy;
        this.createDate = createDate;
        this.updateBy = updateBy;
        this.updateDate = updateDate;
        this.delFlg = delFlg;
    }


    public Integer getCulinaryNewsId() {
        return culinaryNewsId;
    }

    public void setCulinaryNewsId(Integer culinaryNewsId) {
        this.culinaryNewsId = culinaryNewsId;
    }

    public String getCulinaryNewsName() {
        return culinaryNewsName;
    }

    public void setCulinaryNewsName(String culinaryNewsName) {
        this.culinaryNewsName = culinaryNewsName;
    }

    public String getCulinaryNewsDescription() {
        return culinaryNewsDescription;
    }

    public void setCulinaryNewsDescription(String culinaryNewsDescription) {
        this.culinaryNewsDescription = culinaryNewsDescription;
    }

    public Integer getCulinaryNewsStar() {
        return culinaryNewsStar;
    }

    public void setCulinaryNewsStar(Integer culinaryNewsStar) {
        this.culinaryNewsStar = culinaryNewsStar;
    }

    public String getCulinaryNewsTime() {
        return culinaryNewsTime;
    }

    public void setCulinaryNewsTime(String culinaryNewsTime) {
        this.culinaryNewsTime = culinaryNewsTime;
    }

    public Integer getCulinaryNewsAddress() {
        return culinaryNewsAddress;
    }

    public void setCulinaryNewsAddress(Integer culinaryNewsAddress) {
        this.culinaryNewsAddress = culinaryNewsAddress;
    }

    public String getCulinaryNewsVideo() {
        return culinaryNewsVideo;
    }

    public void setCulinaryNewsVideo(String culinaryNewsVideo) {
        this.culinaryNewsVideo = culinaryNewsVideo;
    }

    public String getCulinaryNewsPrice() {
        return culinaryNewsPrice;
    }

    public void setCulinaryNewsPrice(String culinaryNewsPrice) {
        this.culinaryNewsPrice = culinaryNewsPrice;
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

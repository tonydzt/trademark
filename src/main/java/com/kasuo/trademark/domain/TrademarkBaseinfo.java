package com.kasuo.trademark.domain;

import java.util.Date;

/**
 * @author douzhitong
 * @date 2019/3/24
 */
public class TrademarkBaseinfo {

    private Integer id;
    private Integer type;
    private Date date;
    private String trademarkName;
    private String trademarkType;
    private String agentNo;
    private String irnNo;
    private Date irnDate;
    private String rnNo;
    private Date rnDate;
    private Date dpStartDate;
    private Date dpEndDate;
    private String expire;
    private String designDescription;
    private String colorDescription;
    private String giveUpDescription;
    private Boolean isStereoscopic;
    private Boolean isPublic;
    private String shape;
    private String geographyInfo;
    private Integer colorId;
    private Boolean isWellKnown;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTrademarkName() {
        return trademarkName;
    }

    public void setTrademarkName(String trademarkName) {
        this.trademarkName = trademarkName;
    }

    public String getTrademarkType() {
        return trademarkType;
    }

    public void setTrademarkType(String trademarkType) {
        this.trademarkType = trademarkType;
    }

    public String getAgentNo() {
        return agentNo;
    }

    public void setAgentNo(String agentNo) {
        this.agentNo = agentNo;
    }

    public String getIrnNo() {
        return irnNo;
    }

    public void setIrnNo(String irnNo) {
        this.irnNo = irnNo;
    }

    public Date getIrnDate() {
        return irnDate;
    }

    public void setIrnDate(Date irnDate) {
        this.irnDate = irnDate;
    }

    public String getRnNo() {
        return rnNo;
    }

    public void setRnNo(String rnNo) {
        this.rnNo = rnNo;
    }

    public Date getRnDate() {
        return rnDate;
    }

    public void setRnDate(Date rnDate) {
        this.rnDate = rnDate;
    }

    public Date getDpStartDate() {
        return dpStartDate;
    }

    public void setDpStartDate(Date dpStartDate) {
        this.dpStartDate = dpStartDate;
    }

    public Date getDpEndDate() {
        return dpEndDate;
    }

    public void setDpEndDate(Date dpEndDate) {
        this.dpEndDate = dpEndDate;
    }

    public String getExpire() {
        return expire;
    }

    public void setExpire(String expire) {
        this.expire = expire;
    }

    public String getDesignDescription() {
        return designDescription;
    }

    public void setDesignDescription(String designDescription) {
        this.designDescription = designDescription;
    }

    public String getColorDescription() {
        return colorDescription;
    }

    public void setColorDescription(String colorDescription) {
        this.colorDescription = colorDescription;
    }

    public String getGiveUpDescription() {
        return giveUpDescription;
    }

    public void setGiveUpDescription(String giveUpDescription) {
        this.giveUpDescription = giveUpDescription;
    }

    public Boolean getStereoscopic() {
        return isStereoscopic;
    }

    public void setStereoscopic(Boolean stereoscopic) {
        isStereoscopic = stereoscopic;
    }

    public Boolean getPublic() {
        return isPublic;
    }

    public void setPublic(Boolean aPublic) {
        isPublic = aPublic;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getGeographyInfo() {
        return geographyInfo;
    }

    public void setGeographyInfo(String geographyInfo) {
        this.geographyInfo = geographyInfo;
    }

    public Integer getColorId() {
        return colorId;
    }

    public void setColorId(Integer colorId) {
        this.colorId = colorId;
    }

    public Boolean getWellKnown() {
        return isWellKnown;
    }

    public void setWellKnown(Boolean wellKnown) {
        isWellKnown = wellKnown;
    }
}

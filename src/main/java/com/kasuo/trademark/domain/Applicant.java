package com.kasuo.trademark.domain;

/**
 * @author douzhitong
 * @date 2019/3/24
 */
public class Applicant {

    private Integer id;
    private Integer type;
    private String applicantNameCn;
    private String applicantNameEn;
    private String addressCn;
    private String addressEn;

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

    public String getApplicantNameCn() {
        return applicantNameCn;
    }

    public void setApplicantNameCn(String applicantNameCn) {
        this.applicantNameCn = applicantNameCn;
    }

    public String getApplicantNameEn() {
        return applicantNameEn;
    }

    public void setApplicantNameEn(String applicantNameEn) {
        this.applicantNameEn = applicantNameEn;
    }

    public String getAddressCn() {
        return addressCn;
    }

    public void setAddressCn(String addressCn) {
        this.addressCn = addressCn;
    }

    public String getAddressEn() {
        return addressEn;
    }

    public void setAddressEn(String addressEn) {
        this.addressEn = addressEn;
    }
}

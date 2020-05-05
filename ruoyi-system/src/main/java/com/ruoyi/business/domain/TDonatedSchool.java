package com.ruoyi.business.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 受助学校对象 t_donated_school
 * 
 * @author wuyang
 * @date 2020-03-02
 */
public class TDonatedSchool extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键id */
    private Long id;

    /** 学校名 */
    @Excel(name = "学校名")
    private String schoolName;

    /** 学校详细地址 */
    @Excel(name = "学校详细地址")
    private String schoolAddress;

    /** 学校联系人 */
    @Excel(name = "学校联系人")
    private String schoolContacts;

    /** 联系电话 */
    @Excel(name = "联系电话")
    private String schoolTel;

    /** 收件人 */
    @Excel(name = "收件人")
    private String addressee;

    /** 收件人电话 */
    @Excel(name = "收件人电话")
    private String addresseeTel;

    /** 学校邮政编码 */
    @Excel(name = "学校邮政编码")
    private String postalCode;

    /** 是否审核（0—未审核，1—已审核） */
    @Excel(name = "是否审核", readConverterExp = "0=—未审核，1—已审核")
    private String isAudit;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setSchoolName(String schoolName) 
    {
        this.schoolName = schoolName;
    }

    public String getSchoolName() 
    {
        return schoolName;
    }
    public void setSchoolAddress(String schoolAddress) 
    {
        this.schoolAddress = schoolAddress;
    }

    public String getSchoolAddress() 
    {
        return schoolAddress;
    }
    public void setSchoolContacts(String schoolContacts) 
    {
        this.schoolContacts = schoolContacts;
    }

    public String getSchoolContacts() 
    {
        return schoolContacts;
    }
    public void setSchoolTel(String schoolTel) 
    {
        this.schoolTel = schoolTel;
    }

    public String getSchoolTel() 
    {
        return schoolTel;
    }
    public void setAddressee(String addressee) 
    {
        this.addressee = addressee;
    }

    public String getAddressee() 
    {
        return addressee;
    }
    public void setAddresseeTel(String addresseeTel) 
    {
        this.addresseeTel = addresseeTel;
    }

    public String getAddresseeTel() 
    {
        return addresseeTel;
    }
    public void setPostalCode(String postalCode) 
    {
        this.postalCode = postalCode;
    }

    public String getPostalCode() 
    {
        return postalCode;
    }
    public void setIsAudit(String isAudit) 
    {
        this.isAudit = isAudit;
    }

    public String getIsAudit() 
    {
        return isAudit;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("schoolName", getSchoolName())
            .append("schoolAddress", getSchoolAddress())
            .append("schoolContacts", getSchoolContacts())
            .append("schoolTel", getSchoolTel())
            .append("addressee", getAddressee())
            .append("addresseeTel", getAddresseeTel())
            .append("postalCode", getPostalCode())
            .append("isAudit", getIsAudit())
            .append("remark", getRemark())
            .toString();
    }
}

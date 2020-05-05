package com.ruoyi.business.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 捐助书籍对象 t_donation_info
 * 
 * @author wuyang
 * @date 2020-03-21
 */
public class TDonationInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long id;

    /** 书籍名称 */
    @Excel(name = "书籍名称")
    private String bookName;

    /** 书籍isbn */
    @Excel(name = "书籍isbn")
    private String isbn;

    /** 版本 */
    @Excel(name = "版本")
    private String version;

    /** 书籍编号 */
    @Excel(name = "书籍编号")
    private String bookNo;

    /** 书籍状态（0-未收到 1-在服务中心 2-在需求学校 3-未送达） */
    @Excel(name = "书籍状态", readConverterExp = "0=-未收到,1=-在服务中心,2=-在需求学校,3=-未送达")
    private String bookStatus;

    /** 图书类型 */
    @Excel(name = "图书类型")
    private String bookType;

    /** 图书版本 */
    @Excel(name = "图书版本")
    private String bookVersion;

    /** 捐赠者 */
    @Excel(name = "捐赠者")
    private String donator;

    /** 捐赠者ID */
    private Long donatorId;

    /** 捐赠者电话 */
    @Excel(name = "捐赠者电话")
    private String donatorTel;

    /** 是否调剂 */
    @Excel(name = "是否调剂")
    private String isDispense;

    /** 最终学校 */
    @Excel(name = "最终学校")
    private String finalSchool;

    /** 快递公司 */
    @Excel(name = "快递公司")
    private String express;

    /** 快递编号 */
    @Excel(name = "快递编号")
    private String expressNo;

    /** 意向学校 */
    @Excel(name = "意向学校")
    private String intentionSchool;

    /** 负责团队 */
    @Excel(name = "负责团队")
    private String team;

    /** 发送时间 */
    @Excel(name = "发送时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date senddate;

    /** 接受时间 */
    @Excel(name = "接受时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date acceptdate;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setBookName(String bookName) 
    {
        this.bookName = bookName;
    }

    public String getBookName() 
    {
        return bookName;
    }
    public void setIsbn(String isbn) 
    {
        this.isbn = isbn;
    }

    public String getIsbn() 
    {
        return isbn;
    }
    public void setVersion(String version) 
    {
        this.version = version;
    }

    public String getVersion() 
    {
        return version;
    }
    public void setBookNo(String bookNo) 
    {
        this.bookNo = bookNo;
    }

    public String getBookNo() 
    {
        return bookNo;
    }
    public void setBookStatus(String bookStatus) 
    {
        this.bookStatus = bookStatus;
    }

    public String getBookStatus() 
    {
        return bookStatus;
    }
    public void setBookType(String bookType) 
    {
        this.bookType = bookType;
    }

    public String getBookType() 
    {
        return bookType;
    }
    public void setBookVersion(String bookVersion) 
    {
        this.bookVersion = bookVersion;
    }

    public String getBookVersion() 
    {
        return bookVersion;
    }
    public void setDonator(String donator) 
    {
        this.donator = donator;
    }

    public String getDonator() 
    {
        return donator;
    }
    public void setDonatorId(Long donatorId) 
    {
        this.donatorId = donatorId;
    }

    public Long getDonatorId() 
    {
        return donatorId;
    }
    public void setDonatorTel(String donatorTel) 
    {
        this.donatorTel = donatorTel;
    }

    public String getDonatorTel() 
    {
        return donatorTel;
    }
    public void setIsDispense(String isDispense) 
    {
        this.isDispense = isDispense;
    }

    public String getIsDispense() 
    {
        return isDispense;
    }
    public void setFinalSchool(String finalSchool) 
    {
        this.finalSchool = finalSchool;
    }

    public String getFinalSchool() 
    {
        return finalSchool;
    }
    public void setExpress(String express) 
    {
        this.express = express;
    }

    public String getExpress() 
    {
        return express;
    }
    public void setExpressNo(String expressNo) 
    {
        this.expressNo = expressNo;
    }

    public String getExpressNo() 
    {
        return expressNo;
    }
    public void setIntentionSchool(String intentionSchool) 
    {
        this.intentionSchool = intentionSchool;
    }

    public String getIntentionSchool() 
    {
        return intentionSchool;
    }
    public void setTeam(String team) 
    {
        this.team = team;
    }

    public String getTeam() 
    {
        return team;
    }
    public void setSenddate(Date senddate) 
    {
        this.senddate = senddate;
    }

    public Date getSenddate() 
    {
        return senddate;
    }
    public void setAcceptdate(Date acceptdate) 
    {
        this.acceptdate = acceptdate;
    }

    public Date getAcceptdate() 
    {
        return acceptdate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("bookName", getBookName())
            .append("isbn", getIsbn())
            .append("version", getVersion())
            .append("bookNo", getBookNo())
            .append("bookStatus", getBookStatus())
            .append("bookType", getBookType())
            .append("bookVersion", getBookVersion())
            .append("donator", getDonator())
            .append("donatorId", getDonatorId())
            .append("donatorTel", getDonatorTel())
            .append("isDispense", getIsDispense())
            .append("finalSchool", getFinalSchool())
            .append("express", getExpress())
            .append("expressNo", getExpressNo())
            .append("intentionSchool", getIntentionSchool())
            .append("team", getTeam())
            .append("remark", getRemark())
            .append("senddate", getSenddate())
            .append("acceptdate", getAcceptdate())
            .toString();
    }
}

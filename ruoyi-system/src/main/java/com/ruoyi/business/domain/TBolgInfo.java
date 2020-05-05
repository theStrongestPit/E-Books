package com.ruoyi.business.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 社区信息对象 t_bolg_info
 * 
 * @author ruoyi
 * @date 2020-02-08
 */
public class TBolgInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long id;

    /** 博客题目 */
    @Excel(name = "博客题目")
    private String blogTitel;

    /** 博客内容 */
    @Excel(name = "博客内容")
    private String blogContent;

    /** 作者id */
    @Excel(name = "作者id")
    private Long authorId;

    /** 作者昵称 */
    @Excel(name = "作者昵称")
    private String userName;

    /** 发布时间 */
    @Excel(name = "发布时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date releaseTime;

    /** 浏览人数 */
    @Excel(name = "浏览人数")
    private Long browseTimes;

    /** 赞同人数 */
    @Excel(name = "赞同人数")
    private Long agreeNumber;

    /** 是否可读—用于删除数据 */
    @Excel(name = "是否可读—用于删除数据")
    private String isRead;

    /** 版本 */
    @Excel(name = "版本")
    private Long vesion;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setBlogTitel(String blogTitel) 
    {
        this.blogTitel = blogTitel;
    }

    public String getBlogTitel() 
    {
        return blogTitel;
    }
    public void setBlogContent(String blogContent) 
    {
        this.blogContent = blogContent;
    }

    public String getBlogContent() 
    {
        return blogContent;
    }
    public void setAuthorId(Long authorId) 
    {
        this.authorId = authorId;
    }

    public Long getAuthorId() 
    {
        return authorId;
    }
    public void setReleaseTime(Date releaseTime) 
    {
        this.releaseTime = releaseTime;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getReleaseTime() 
    {
        return releaseTime;
    }
    public void setBrowseTimes(Long browseTimes) 
    {
        this.browseTimes = browseTimes;
    }

    public Long getBrowseTimes() 
    {
        return browseTimes;
    }
    public void setAgreeNumber(Long agreeNumber) 
    {
        this.agreeNumber = agreeNumber;
    }

    public Long getAgreeNumber() 
    {
        return agreeNumber;
    }
    public void setIsRead(String isRead) 
    {
        this.isRead = isRead;
    }

    public String getIsRead() 
    {
        return isRead;
    }
    public void setVesion(Long vesion) 
    {
        this.vesion = vesion;
    }

    public Long getVesion() 
    {
        return vesion;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("blogTitel", getBlogTitel())
            .append("blogContent", getBlogContent())
            .append("authorId", getAuthorId())
            .append("userName", getUserName())
            .append("releaseTime", getReleaseTime())
            .append("browseTimes", getBrowseTimes())
            .append("agreeNumber", getAgreeNumber())
            .append("isRead", getIsRead())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("vesion", getVesion())
            .toString();
    }
}

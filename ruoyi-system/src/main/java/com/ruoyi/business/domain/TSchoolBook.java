package com.ruoyi.business.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 学校需求书籍对象 t_school_book
 * 
 * @author wuyang
 * @date 2020-03-18
 */
public class TSchoolBook extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long id;

    /** 所需要的书名 */
    @Excel(name = "所需要的书名")
    private String needBook;

    /** 书籍版本 */
    @Excel(name = "书籍版本")
    private String bookVersion;

    /** 出版社 */
    @Excel(name = "出版社")
    private String press;

    /** 书籍isbn号 */
    @Excel(name = "书籍isbn号")
    private String bookIsbn;

    /** 需要数量 */
    @Excel(name = "需要数量")
    private Long number;

    /** 学校名 */
    @Excel(name = "学校名")
    private String schoolName;

    /** 学校联系人 */
    @Excel(name = "学校联系人")
    private String schoolContacts;

    /** 联系电话 */
    @Excel(name = "联系电话")
    private String schoolTel;

    /** 学校id */
    @Excel(name = "学校id")
    private Long schoolId;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setNeedBook(String needBook) 
    {
        this.needBook = needBook;
    }

    public String getNeedBook() 
    {
        return needBook;
    }
    public void setBookVersion(String bookVersion) 
    {
        this.bookVersion = bookVersion;
    }

    public String getBookVersion() 
    {
        return bookVersion;
    }
    public void setPress(String press) 
    {
        this.press = press;
    }

    public String getPress() 
    {
        return press;
    }
    public void setBookIsbn(String bookIsbn) 
    {
        this.bookIsbn = bookIsbn;
    }

    public String getBookIsbn() 
    {
        return bookIsbn;
    }
    public void setNumber(Long number) 
    {
        this.number = number;
    }

    public Long getNumber() 
    {
        return number;
    }
    public void setSchoolName(String schoolName) 
    {
        this.schoolName = schoolName;
    }

    public String getSchoolName() 
    {
        return schoolName;
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
    public void setSchoolId(Long schoolId) 
    {
        this.schoolId = schoolId;
    }

    public Long getSchoolId() 
    {
        return schoolId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("needBook", getNeedBook())
            .append("bookVersion", getBookVersion())
            .append("press", getPress())
            .append("bookIsbn", getBookIsbn())
            .append("number", getNumber())
            .append("schoolName", getSchoolName())
            .append("schoolContacts", getSchoolContacts())
            .append("schoolTel", getSchoolTel())
            .append("schoolId", getSchoolId())
            .toString();
    }
}

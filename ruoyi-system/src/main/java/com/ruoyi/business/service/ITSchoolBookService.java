package com.ruoyi.business.service;

import com.ruoyi.business.domain.TSchoolBook;
import java.util.List;

/**
 * 学校需求书籍Service接口
 * 
 * @author wuyang
 * @date 2020-03-18
 */
public interface ITSchoolBookService 
{
    /**
     * 查询学校需求书籍
     * 
     * @param id 学校需求书籍ID
     * @return 学校需求书籍
     */
    public TSchoolBook selectTSchoolBookById(Long id);

    /**
     * 查询学校需求书籍列表
     * 
     * @param tSchoolBook 学校需求书籍
     * @return 学校需求书籍集合
     */
    public List<TSchoolBook> selectTSchoolBookList(TSchoolBook tSchoolBook);

    /**
     * 新增学校需求书籍
     * 
     * @param tSchoolBook 学校需求书籍
     * @return 结果
     */
    public int insertTSchoolBook(TSchoolBook tSchoolBook);

    /**
     * 修改学校需求书籍
     * 
     * @param tSchoolBook 学校需求书籍
     * @return 结果
     */
    public int updateTSchoolBook(TSchoolBook tSchoolBook);

    /**
     * 批量删除学校需求书籍
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTSchoolBookByIds(String ids);

    /**
     * 删除学校需求书籍信息
     * 
     * @param id 学校需求书籍ID
     * @return 结果
     */
    public int deleteTSchoolBookById(Long id);
}

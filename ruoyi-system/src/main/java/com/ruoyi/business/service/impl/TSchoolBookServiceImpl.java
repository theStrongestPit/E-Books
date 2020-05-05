package com.ruoyi.business.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.business.mapper.TSchoolBookMapper;
import com.ruoyi.business.domain.TSchoolBook;
import com.ruoyi.business.service.ITSchoolBookService;
import com.ruoyi.common.core.text.Convert;

/**
 * 学校需求书籍Service业务层处理
 * 
 * @author wuyang
 * @date 2020-03-18
 */
@Service
public class TSchoolBookServiceImpl implements ITSchoolBookService 
{
    @Autowired
    private TSchoolBookMapper tSchoolBookMapper;

    /**
     * 查询学校需求书籍
     * 
     * @param id 学校需求书籍ID
     * @return 学校需求书籍
     */
    @Override
    public TSchoolBook selectTSchoolBookById(Long id)
    {
        return tSchoolBookMapper.selectTSchoolBookById(id);
    }

    /**
     * 查询学校需求书籍列表
     * 
     * @param tSchoolBook 学校需求书籍
     * @return 学校需求书籍
     */
    @Override
    public List<TSchoolBook> selectTSchoolBookList(TSchoolBook tSchoolBook)
    {
        return tSchoolBookMapper.selectTSchoolBookList(tSchoolBook);
    }

    /**
     * 新增学校需求书籍
     * 
     * @param tSchoolBook 学校需求书籍
     * @return 结果
     */
    @Override
    public int insertTSchoolBook(TSchoolBook tSchoolBook)
    {
        return tSchoolBookMapper.insertTSchoolBook(tSchoolBook);
    }

    /**
     * 修改学校需求书籍
     * 
     * @param tSchoolBook 学校需求书籍
     * @return 结果
     */
    @Override
    public int updateTSchoolBook(TSchoolBook tSchoolBook)
    {
        return tSchoolBookMapper.updateTSchoolBook(tSchoolBook);
    }

    /**
     * 删除学校需求书籍对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTSchoolBookByIds(String ids)
    {
        return tSchoolBookMapper.deleteTSchoolBookByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除学校需求书籍信息
     * 
     * @param id 学校需求书籍ID
     * @return 结果
     */
    @Override
    public int deleteTSchoolBookById(Long id)
    {
        return tSchoolBookMapper.deleteTSchoolBookById(id);
    }
}

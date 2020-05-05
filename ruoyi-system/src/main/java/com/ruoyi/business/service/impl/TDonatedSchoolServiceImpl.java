package com.ruoyi.business.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.business.mapper.TDonatedSchoolMapper;
import com.ruoyi.business.domain.TDonatedSchool;
import com.ruoyi.business.service.ITDonatedSchoolService;
import com.ruoyi.common.core.text.Convert;

/**
 * 受助学校Service业务层处理
 * 
 * @author wuyang
 * @date 2020-03-02
 */
@Service
public class TDonatedSchoolServiceImpl implements ITDonatedSchoolService 
{
    @Autowired
    private TDonatedSchoolMapper tDonatedSchoolMapper;

    /**
     * 查询受助学校
     * 
     * @param id 受助学校ID
     * @return 受助学校
     */
    @Override
    public TDonatedSchool selectTDonatedSchoolById(Long id)
    {
        return tDonatedSchoolMapper.selectTDonatedSchoolById(id);
    }

    /**
     * 查询受助学校列表
     * 
     * @param tDonatedSchool 受助学校
     * @return 受助学校
     */
    @Override
    public List<TDonatedSchool> selectTDonatedSchoolList(TDonatedSchool tDonatedSchool)
    {
        return tDonatedSchoolMapper.selectTDonatedSchoolList(tDonatedSchool);
    }

    /**
     * 新增受助学校
     * 
     * @param tDonatedSchool 受助学校
     * @return 结果
     */
    @Override
    public int insertTDonatedSchool(TDonatedSchool tDonatedSchool)
    {
        return tDonatedSchoolMapper.insertTDonatedSchool(tDonatedSchool);
    }

    /**
     * 修改受助学校
     * 
     * @param tDonatedSchool 受助学校
     * @return 结果
     */
    @Override
    public int updateTDonatedSchool(TDonatedSchool tDonatedSchool)
    {
        return tDonatedSchoolMapper.updateTDonatedSchool(tDonatedSchool);
    }

    /**
     * 删除受助学校对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTDonatedSchoolByIds(String ids)
    {
        return tDonatedSchoolMapper.deleteTDonatedSchoolByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除受助学校信息
     * 
     * @param id 受助学校ID
     * @return 结果
     */
    @Override
    public int deleteTDonatedSchoolById(Long id)
    {
        return tDonatedSchoolMapper.deleteTDonatedSchoolById(id);
    }
}

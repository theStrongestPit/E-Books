package com.ruoyi.business.service.impl;

import java.util.List;


import com.ruoyi.business.service.ITBolgInfoService;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.business.mapper.TBolgInfoMapper;
import com.ruoyi.business.domain.TBolgInfo;
import com.ruoyi.common.core.text.Convert;

/**
 * 社区信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-02-08
 */
@Service
public class TBolgInfoServiceImpl implements ITBolgInfoService
{
    @Autowired
    private TBolgInfoMapper tBolgInfoMapper;

    /**
     * 查询社区信息
     * 
     * @param id 社区信息ID
     * @return 社区信息
     */
    @Override
    public TBolgInfo selectTBolgInfoById(Long id)
    {
        return tBolgInfoMapper.selectTBolgInfoById(id);
    }

    /**
     * 查询社区信息列表
     * 
     * @param tBolgInfo 社区信息
     * @return 社区信息
     */
    @Override
    public List<TBolgInfo> selectTBolgInfoList(TBolgInfo tBolgInfo)
    {
        return tBolgInfoMapper.selectTBolgInfoList(tBolgInfo);
    }

    /**
     * 发布信息
     *
     * @param tBolgInfo 社区信息
     * @return 结果
     */
    public int insertAnnounce(TBolgInfo tBolgInfo){
        tBolgInfo.setCreateTime(DateUtils.getNowDate());
        return tBolgInfoMapper.insertAnnounce(tBolgInfo);
    }

    /**
     * 新增社区信息
     * 
     * @param tBolgInfo 社区信息
     * @return 结果
     */
    @Override
    public int insertTBolgInfo(TBolgInfo tBolgInfo)
    {
        tBolgInfo.setCreateTime(DateUtils.getNowDate());
        return tBolgInfoMapper.insertTBolgInfo(tBolgInfo);
    }

    /**
     * 修改社区信息
     * 
     * @param tBolgInfo 社区信息
     * @return 结果
     */
    @Override
    public int updateTBolgInfo(TBolgInfo tBolgInfo)
    {
        tBolgInfo.setUpdateTime(DateUtils.getNowDate());
        return tBolgInfoMapper.updateTBolgInfo(tBolgInfo);
    }

    /**
     * 删除社区信息对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTBolgInfoByIds(String ids)
    {
        return tBolgInfoMapper.deleteTBolgInfoByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除社区信息信息
     * 
     * @param id 社区信息ID
     * @return 结果
     */
    @Override
    public int deleteTBolgInfoById(Long id)
    {
        return tBolgInfoMapper.deleteTBolgInfoById(id);
    }
}

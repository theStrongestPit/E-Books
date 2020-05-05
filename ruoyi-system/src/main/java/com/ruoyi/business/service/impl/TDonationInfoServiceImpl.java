package com.ruoyi.business.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.business.mapper.TDonationInfoMapper;
import com.ruoyi.business.domain.TDonationInfo;
import com.ruoyi.business.service.ITDonationInfoService;
import com.ruoyi.common.core.text.Convert;

/**
 * 捐助书籍Service业务层处理
 * 
 * @author wuyang
 * @date 2020-03-21
 */
@Service
public class TDonationInfoServiceImpl implements ITDonationInfoService 
{
    @Autowired
    private TDonationInfoMapper tDonationInfoMapper;

    /**
     * 查询捐助书籍
     * 
     * @param id 捐助书籍ID
     * @return 捐助书籍
     */
    @Override
    public TDonationInfo selectTDonationInfoById(Long id)
    {
        return tDonationInfoMapper.selectTDonationInfoById(id);
    }

    /**
     * 查询捐助书籍列表
     * 
     * @param tDonationInfo 捐助书籍
     * @return 捐助书籍
     */
    @Override
    public List<TDonationInfo> selectTDonationInfoList(TDonationInfo tDonationInfo)
    {
        return tDonationInfoMapper.selectTDonationInfoList(tDonationInfo);
    }

    /**
     * 新增捐助书籍
     * 
     * @param tDonationInfo 捐助书籍
     * @return 结果
     */
    @Override
    public int insertTDonationInfo(TDonationInfo tDonationInfo)
    {
        return tDonationInfoMapper.insertTDonationInfo(tDonationInfo);
    }

    /**
     * 修改捐助书籍
     * 
     * @param tDonationInfo 捐助书籍
     * @return 结果
     */
    @Override
    public int updateTDonationInfo(TDonationInfo tDonationInfo)
    {
        return tDonationInfoMapper.updateTDonationInfo(tDonationInfo);
    }

    /**
     * 删除捐助书籍对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTDonationInfoByIds(String ids)
    {
        return tDonationInfoMapper.deleteTDonationInfoByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除捐助书籍信息
     * 
     * @param id 捐助书籍ID
     * @return 结果
     */
    @Override
    public int deleteTDonationInfoById(Long id)
    {
        return tDonationInfoMapper.deleteTDonationInfoById(id);
    }
}

package com.ruoyi.business.service;

import com.ruoyi.business.domain.TDonationInfo;
import java.util.List;

/**
 * 捐助书籍Service接口
 * 
 * @author wuyang
 * @date 2020-03-21
 */
public interface ITDonationInfoService 
{
    /**
     * 查询捐助书籍
     * 
     * @param id 捐助书籍ID
     * @return 捐助书籍
     */
    public TDonationInfo selectTDonationInfoById(Long id);

    /**
     * 查询捐助书籍列表
     * 
     * @param tDonationInfo 捐助书籍
     * @return 捐助书籍集合
     */
    public List<TDonationInfo> selectTDonationInfoList(TDonationInfo tDonationInfo);

    /**
     * 新增捐助书籍
     * 
     * @param tDonationInfo 捐助书籍
     * @return 结果
     */
    public int insertTDonationInfo(TDonationInfo tDonationInfo);

    /**
     * 修改捐助书籍
     * 
     * @param tDonationInfo 捐助书籍
     * @return 结果
     */
    public int updateTDonationInfo(TDonationInfo tDonationInfo);

    /**
     * 批量删除捐助书籍
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTDonationInfoByIds(String ids);

    /**
     * 删除捐助书籍信息
     * 
     * @param id 捐助书籍ID
     * @return 结果
     */
    public int deleteTDonationInfoById(Long id);
}

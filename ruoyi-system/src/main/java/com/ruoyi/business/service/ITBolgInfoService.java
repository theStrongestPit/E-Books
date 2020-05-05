package com.ruoyi.business.service;

import com.ruoyi.business.domain.TBolgInfo;
import java.util.List;

/**
 * 社区信息Service接口
 * 
 * @author ruoyi
 * @date 2020-02-08
 */
public interface ITBolgInfoService 
{
    /**
     * 查询社区信息
     * 
     * @param id 社区信息ID
     * @return 社区信息
     */
    public TBolgInfo selectTBolgInfoById(Long id);

    /**
     * 查询社区信息列表
     * 
     * @param tBolgInfo 社区信息
     * @return 社区信息集合
     */
    public List<TBolgInfo> selectTBolgInfoList(TBolgInfo tBolgInfo);

    /**
     * 发布信息
     *
     * @param tBolgInfo 社区信息
     * @return 结果
     */
    public int insertAnnounce(TBolgInfo tBolgInfo);

    /**
     * 新增社区信息
     * 
     * @param tBolgInfo 社区信息
     * @return 结果
     */
    public int insertTBolgInfo(TBolgInfo tBolgInfo);

    /**
     * 修改社区信息
     * 
     * @param tBolgInfo 社区信息
     * @return 结果
     */
    public int updateTBolgInfo(TBolgInfo tBolgInfo);

    /**
     * 批量删除社区信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTBolgInfoByIds(String ids);

    /**
     * 删除社区信息信息
     * 
     * @param id 社区信息ID
     * @return 结果
     */
    public int deleteTBolgInfoById(Long id);
}

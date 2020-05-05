package com.ruoyi.business.mapper;

import com.ruoyi.business.domain.TDonatedSchool;
import java.util.List;

/**
 * 受助学校Mapper接口
 * 
 * @author wuyang
 * @date 2020-03-02
 */
public interface TDonatedSchoolMapper 
{
    /**
     * 查询受助学校
     * 
     * @param id 受助学校ID
     * @return 受助学校
     */
    public TDonatedSchool selectTDonatedSchoolById(Long id);

    /**
     * 查询受助学校列表
     * 
     * @param tDonatedSchool 受助学校
     * @return 受助学校集合
     */
    public List<TDonatedSchool> selectTDonatedSchoolList(TDonatedSchool tDonatedSchool);

    /**
     * 新增受助学校
     * 
     * @param tDonatedSchool 受助学校
     * @return 结果
     */
    public int insertTDonatedSchool(TDonatedSchool tDonatedSchool);

    /**
     * 修改受助学校
     * 
     * @param tDonatedSchool 受助学校
     * @return 结果
     */
    public int updateTDonatedSchool(TDonatedSchool tDonatedSchool);

    /**
     * 删除受助学校
     * 
     * @param id 受助学校ID
     * @return 结果
     */
    public int deleteTDonatedSchoolById(Long id);

    /**
     * 批量删除受助学校
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTDonatedSchoolByIds(String[] ids);
}

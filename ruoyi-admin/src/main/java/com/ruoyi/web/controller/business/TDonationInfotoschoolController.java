package com.ruoyi.web.controller.business;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.business.domain.TDonationInfo;
import com.ruoyi.business.service.ITDonationInfoService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 捐助书籍Controller
 * 
 * @author wuyang
 * @date 2020-03-21
 */
@Controller
@RequestMapping("/business/donation")
public class TDonationInfotoschoolController extends BaseController
{
    private String prefix = "business/donation";

    @Autowired
    private ITDonationInfoService tDonationInfoService;

    @RequiresPermissions("business:donation:view")
    @GetMapping()
    public String donation()
    {
        return prefix + "/donation";
    }

    /**
     * 查询捐助书籍列表
     */
    @RequiresPermissions("business:donation:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TDonationInfo tDonationInfo)
    {
        startPage();
        List<TDonationInfo> list = tDonationInfoService.selectTDonationInfoList(tDonationInfo);
        return getDataTable(list);
    }

    /**
     * 导出捐助书籍列表
     */
    @RequiresPermissions("business:donation:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TDonationInfo tDonationInfo)
    {
        List<TDonationInfo> list = tDonationInfoService.selectTDonationInfoList(tDonationInfo);
        ExcelUtil<TDonationInfo> util = new ExcelUtil<TDonationInfo>(TDonationInfo.class);
        return util.exportExcel(list, "donation");
    }

    /**
     * 新增捐助书籍
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存捐助书籍
     */
    @RequiresPermissions("business:donation:add")
    @Log(title = "捐助书籍", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TDonationInfo tDonationInfo)
    {
        return toAjax(tDonationInfoService.insertTDonationInfo(tDonationInfo));
    }

    /**
     * 修改捐助书籍
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TDonationInfo tDonationInfo = tDonationInfoService.selectTDonationInfoById(id);
        mmap.put("tDonationInfo", tDonationInfo);
        return prefix + "/edit";
    }

    /**
     * 修改保存捐助书籍
     */
    @RequiresPermissions("business:donation:edit")
    @Log(title = "捐助书籍", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TDonationInfo tDonationInfo)
    {
        return toAjax(tDonationInfoService.updateTDonationInfo(tDonationInfo));
    }

    /**
     * 删除捐助书籍
     */
    @RequiresPermissions("business:donation:remove")
    @Log(title = "捐助书籍", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tDonationInfoService.deleteTDonationInfoByIds(ids));
    }
}

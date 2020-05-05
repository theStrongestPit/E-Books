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
import com.ruoyi.business.domain.TBolgInfo;
import com.ruoyi.business.service.ITBolgInfoService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 社区信息Controller
 * 
 * @author ruoyi
 * @date 2020-02-08
 */
@Controller
@RequestMapping("/business/bolg")
public class TBolgInfoController extends BaseController
{
    private String prefix = "business/bolg";

    @Autowired
    private ITBolgInfoService tBolgInfoService;

    @RequiresPermissions("business:bolg:view")
    @GetMapping()
    public String bolg()
    {
        return prefix + "/bolg";
    }

    /**
     * 查询社区信息列表
     */
    @RequiresPermissions("business:bolg:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TBolgInfo tBolgInfo)
    {
        startPage();
        List<TBolgInfo> list = tBolgInfoService.selectTBolgInfoList(tBolgInfo);
        return getDataTable(list);
    }

    /**
     * 发布中心
     */
    @GetMapping("/announce")
    public String announce()
    {
        return prefix + "/announce";
    }

    /**
     * 保存发布信息
     */
    @RequiresPermissions("business:bolg:announce")
    @PostMapping("/announce")
    @ResponseBody
    public AjaxResult announceandSave(TBolgInfo tBolgInfo)
    {
        return toAjax(tBolgInfoService.insertAnnounce(tBolgInfo));
    }
    /**
     * 导出社区信息列表
     */
    @RequiresPermissions("business:bolg:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TBolgInfo tBolgInfo)
    {
        List<TBolgInfo> list = tBolgInfoService.selectTBolgInfoList(tBolgInfo);
        ExcelUtil<TBolgInfo> util = new ExcelUtil<TBolgInfo>(TBolgInfo.class);
        return util.exportExcel(list, "bolg");
    }

    /**
     * 新增社区信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存社区信息
     */
    @RequiresPermissions("business:bolg:add")
    @Log(title = "社区信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TBolgInfo tBolgInfo)
    {
        return toAjax(tBolgInfoService.insertTBolgInfo(tBolgInfo));
    }

    /**
     * 修改社区信息
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TBolgInfo tBolgInfo = tBolgInfoService.selectTBolgInfoById(id);
        mmap.put("tBolgInfo", tBolgInfo);
        return prefix + "/edit";
    }

    /**
     * 修改保存社区信息
     */
    @RequiresPermissions("business:bolg:edit")
    @Log(title = "社区信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TBolgInfo tBolgInfo)
    {
        return toAjax(tBolgInfoService.updateTBolgInfo(tBolgInfo));
    }

    /**
     * 删除社区信息
     */
    @RequiresPermissions("business:bolg:remove")
    @Log(title = "社区信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tBolgInfoService.deleteTBolgInfoByIds(ids));
    }
}

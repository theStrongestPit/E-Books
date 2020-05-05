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
import com.ruoyi.business.domain.TDonatedSchool;
import com.ruoyi.business.service.ITDonatedSchoolService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 受助学校Controller
 * 
 * @author wuyang
 * @date 2020-03-02
 */
@Controller
@RequestMapping("/business/school")
public class TDonatedSchoolController extends BaseController
{
    private String prefix = "business/school";

    @Autowired
    private ITDonatedSchoolService tDonatedSchoolService;

    @RequiresPermissions("business:school:view")
    @GetMapping()
    public String school()
    {
        return prefix + "/school";
    }

    /**
     * 查询受助学校列表
     */
    @RequiresPermissions("business:school:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TDonatedSchool tDonatedSchool)
    {
        startPage();
        List<TDonatedSchool> list = tDonatedSchoolService.selectTDonatedSchoolList(tDonatedSchool);
        return getDataTable(list);
    }

    /**
     * 导出受助学校列表
     */
    @RequiresPermissions("business:school:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TDonatedSchool tDonatedSchool)
    {
        List<TDonatedSchool> list = tDonatedSchoolService.selectTDonatedSchoolList(tDonatedSchool);
        ExcelUtil<TDonatedSchool> util = new ExcelUtil<TDonatedSchool>(TDonatedSchool.class);
        return util.exportExcel(list, "school");
    }

    /**
     * 新增受助学校
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存受助学校
     */
    @RequiresPermissions("business:school:add")
    @Log(title = "受助学校", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TDonatedSchool tDonatedSchool)
    {
        return toAjax(tDonatedSchoolService.insertTDonatedSchool(tDonatedSchool));
    }

    /**
     * 修改受助学校
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TDonatedSchool tDonatedSchool = tDonatedSchoolService.selectTDonatedSchoolById(id);
        mmap.put("tDonatedSchool", tDonatedSchool);
        return prefix + "/edit";
    }

    /**
     * 修改保存受助学校
     */
    @RequiresPermissions("business:school:edit")
    @Log(title = "受助学校", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TDonatedSchool tDonatedSchool)
    {
        return toAjax(tDonatedSchoolService.updateTDonatedSchool(tDonatedSchool));
    }

    /**
     * 删除受助学校
     */
    @RequiresPermissions("business:school:remove")
    @Log(title = "受助学校", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tDonatedSchoolService.deleteTDonatedSchoolByIds(ids));
    }
}

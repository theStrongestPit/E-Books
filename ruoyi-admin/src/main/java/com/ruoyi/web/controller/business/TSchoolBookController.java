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
import com.ruoyi.business.domain.TSchoolBook;
import com.ruoyi.business.service.ITSchoolBookService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 学校需求书籍Controller
 * 
 * @author wuyang
 * @date 2020-03-18
 */
@Controller
@RequestMapping("/business/needs")
public class TSchoolBookController extends BaseController
{
    private String prefix = "business/needs";

    @Autowired
    private ITSchoolBookService tSchoolBookService;

    @RequiresPermissions("business:needs:view")
    @GetMapping()
    public String needs()
    {
        return prefix + "/needs";
    }

    /**
     * 查询学校需求书籍列表
     */
    @RequiresPermissions("business:needs:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TSchoolBook tSchoolBook)
    {
        startPage();
        List<TSchoolBook> list = tSchoolBookService.selectTSchoolBookList(tSchoolBook);
        return getDataTable(list);
    }

    /**
     * 导出学校需求书籍列表
     */
    @RequiresPermissions("business:needs:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TSchoolBook tSchoolBook)
    {
        List<TSchoolBook> list = tSchoolBookService.selectTSchoolBookList(tSchoolBook);
        ExcelUtil<TSchoolBook> util = new ExcelUtil<TSchoolBook>(TSchoolBook.class);
        return util.exportExcel(list, "needs");
    }

    /**
     * 新增学校需求书籍
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存学校需求书籍
     */
    @RequiresPermissions("business:needs:add")
    @Log(title = "学校需求书籍", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TSchoolBook tSchoolBook)
    {
        return toAjax(tSchoolBookService.insertTSchoolBook(tSchoolBook));
    }

    /**
     * 修改学校需求书籍
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TSchoolBook tSchoolBook = tSchoolBookService.selectTSchoolBookById(id);
        mmap.put("tSchoolBook", tSchoolBook);
        return prefix + "/edit";
    }

    /**
     * 修改保存学校需求书籍
     */
    @RequiresPermissions("business:needs:edit")
    @Log(title = "学校需求书籍", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TSchoolBook tSchoolBook)
    {
        return toAjax(tSchoolBookService.updateTSchoolBook(tSchoolBook));
    }

    /**
     * 删除学校需求书籍
     */
    @RequiresPermissions("business:needs:remove")
    @Log(title = "学校需求书籍", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tSchoolBookService.deleteTSchoolBookByIds(ids));
    }
}

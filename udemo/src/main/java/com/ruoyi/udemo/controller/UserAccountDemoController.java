package com.ruoyi.udemo.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.udemo.domain.UserAccountDemo;
import com.ruoyi.udemo.service.IUserAccountDemoService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 用户账户DEMOController
 * 
 * @author john
 * @date 2024-12-09
 */
@RestController
@RequestMapping("/udemo/udemo_service_name")
public class UserAccountDemoController extends BaseController
{
    @Autowired
    private IUserAccountDemoService userAccountDemoService;

    /**
     * 查询用户账户DEMO列表
     */
    @PreAuthorize("@ss.hasPermi('udemo:udemo_service_name:list')")
    @GetMapping("/list")
    public TableDataInfo list(UserAccountDemo userAccountDemo)
    {
        startPage();
        List<UserAccountDemo> list = userAccountDemoService.selectUserAccountDemoList(userAccountDemo);
        return getDataTable(list);
    }

    /**
     * 导出用户账户DEMO列表
     */
    @PreAuthorize("@ss.hasPermi('udemo:udemo_service_name:export')")
    @Log(title = "用户账户DEMO", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, UserAccountDemo userAccountDemo)
    {
        List<UserAccountDemo> list = userAccountDemoService.selectUserAccountDemoList(userAccountDemo);
        ExcelUtil<UserAccountDemo> util = new ExcelUtil<UserAccountDemo>(UserAccountDemo.class);
        util.exportExcel(response, list, "用户账户DEMO数据");
    }

    /**
     * 获取用户账户DEMO详细信息
     */
    @PreAuthorize("@ss.hasPermi('udemo:udemo_service_name:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(userAccountDemoService.selectUserAccountDemoById(id));
    }

    /**
     * 新增用户账户DEMO
     */
    @PreAuthorize("@ss.hasPermi('udemo:udemo_service_name:add')")
    @Log(title = "用户账户DEMO", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody UserAccountDemo userAccountDemo)
    {
        return toAjax(userAccountDemoService.insertUserAccountDemo(userAccountDemo));
    }

    /**
     * 修改用户账户DEMO
     */
    @PreAuthorize("@ss.hasPermi('udemo:udemo_service_name:edit')")
    @Log(title = "用户账户DEMO", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody UserAccountDemo userAccountDemo)
    {
        return toAjax(userAccountDemoService.updateUserAccountDemo(userAccountDemo));
    }

    /**
     * 删除用户账户DEMO
     */
    @PreAuthorize("@ss.hasPermi('udemo:udemo_service_name:remove')")
    @Log(title = "用户账户DEMO", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(userAccountDemoService.deleteUserAccountDemoByIds(ids));
    }
}

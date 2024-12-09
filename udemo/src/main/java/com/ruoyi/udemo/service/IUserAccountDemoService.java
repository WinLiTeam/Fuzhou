package com.ruoyi.udemo.service;

import java.util.List;
import com.ruoyi.udemo.domain.UserAccountDemo;

/**
 * 用户账户DEMOService接口
 * 
 * @author john
 * @date 2024-12-09
 */
public interface IUserAccountDemoService 
{
    /**
     * 查询用户账户DEMO
     * 
     * @param id 用户账户DEMO主键
     * @return 用户账户DEMO
     */
    public UserAccountDemo selectUserAccountDemoById(String id);

    /**
     * 查询用户账户DEMO列表
     * 
     * @param userAccountDemo 用户账户DEMO
     * @return 用户账户DEMO集合
     */
    public List<UserAccountDemo> selectUserAccountDemoList(UserAccountDemo userAccountDemo);

    /**
     * 新增用户账户DEMO
     * 
     * @param userAccountDemo 用户账户DEMO
     * @return 结果
     */
    public int insertUserAccountDemo(UserAccountDemo userAccountDemo);

    /**
     * 修改用户账户DEMO
     * 
     * @param userAccountDemo 用户账户DEMO
     * @return 结果
     */
    public int updateUserAccountDemo(UserAccountDemo userAccountDemo);

    /**
     * 批量删除用户账户DEMO
     * 
     * @param ids 需要删除的用户账户DEMO主键集合
     * @return 结果
     */
    public int deleteUserAccountDemoByIds(String[] ids);

    /**
     * 删除用户账户DEMO信息
     * 
     * @param id 用户账户DEMO主键
     * @return 结果
     */
    public int deleteUserAccountDemoById(String id);
}

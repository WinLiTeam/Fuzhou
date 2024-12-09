package com.ruoyi.udemo.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.udemo.mapper.UserAccountDemoMapper;
import com.ruoyi.udemo.domain.UserAccountDemo;
import com.ruoyi.udemo.service.IUserAccountDemoService;

/**
 * 用户账户DEMOService业务层处理
 * 
 * @author john
 * @date 2024-12-09
 */
@Service
public class UserAccountDemoServiceImpl implements IUserAccountDemoService 
{
    @Autowired
    private UserAccountDemoMapper userAccountDemoMapper;

    /**
     * 查询用户账户DEMO
     * 
     * @param id 用户账户DEMO主键
     * @return 用户账户DEMO
     */
    @Override
    public UserAccountDemo selectUserAccountDemoById(String id)
    {
        return userAccountDemoMapper.selectUserAccountDemoById(id);
    }

    /**
     * 查询用户账户DEMO列表
     * 
     * @param userAccountDemo 用户账户DEMO
     * @return 用户账户DEMO
     */
    @Override
    public List<UserAccountDemo> selectUserAccountDemoList(UserAccountDemo userAccountDemo)
    {
        return userAccountDemoMapper.selectUserAccountDemoList(userAccountDemo);
    }

    /**
     * 新增用户账户DEMO
     * 
     * @param userAccountDemo 用户账户DEMO
     * @return 结果
     */
    @Override
    public int insertUserAccountDemo(UserAccountDemo userAccountDemo)
    {
        return userAccountDemoMapper.insertUserAccountDemo(userAccountDemo);
    }

    /**
     * 修改用户账户DEMO
     * 
     * @param userAccountDemo 用户账户DEMO
     * @return 结果
     */
    @Override
    public int updateUserAccountDemo(UserAccountDemo userAccountDemo)
    {
        return userAccountDemoMapper.updateUserAccountDemo(userAccountDemo);
    }

    /**
     * 批量删除用户账户DEMO
     * 
     * @param ids 需要删除的用户账户DEMO主键
     * @return 结果
     */
    @Override
    public int deleteUserAccountDemoByIds(String[] ids)
    {
        return userAccountDemoMapper.deleteUserAccountDemoByIds(ids);
    }

    /**
     * 删除用户账户DEMO信息
     * 
     * @param id 用户账户DEMO主键
     * @return 结果
     */
    @Override
    public int deleteUserAccountDemoById(String id)
    {
        return userAccountDemoMapper.deleteUserAccountDemoById(id);
    }
}

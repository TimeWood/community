package cn.timewood.community.service.Impl;

import cn.timewood.community.dao.UserMapper;
import cn.timewood.community.entity.User;
import cn.timewood.community.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @version v1.0
 * @Description: TODO(一句话描述该类的功能)
 * @Author: TimeWood
 * @Date: 2021/1/7
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;



    @Override
    public User findUserById(int id) {
        return userMapper.selectById(id);
    }
}

package cn.timewood.community.service;

import cn.timewood.community.dao.UserMapper;
import cn.timewood.community.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @version v1.0
 * @Description: TODO(一句话描述该类的功能)
 * @Author: TimeWood
 * @Date: 2021/1/7
 */
public interface UserService {

    public User findUserById(int id);
}

package cn.timewood.community.service;

import cn.timewood.community.dao.UserMapper;
import cn.timewood.community.entity.LoginTicket;
import cn.timewood.community.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/**
 * @version v1.0
 * @Description: TODO(一句话描述该类的功能)
 * @Author: TimeWood
 * @Date: 2021/1/7
 */
public interface UserService {

    public User findUserById(int id);

    public Map<String, Object> register(User user);

    public int activation(int userId, String code);

    public Map<String, Object> login(String username, String password, int expiredSeconds);

    public void logout(String ticket);

    public LoginTicket findLoginTicket(String ticket);

    public int updateHeader(int userId, String headerUrl);

    public User findUserByName(String username);

}

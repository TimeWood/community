package cn.timewood.community.util;

import cn.timewood.community.entity.User;
import org.springframework.stereotype.Component;

/**
 * @version v1.0
 * @Description: 持有用户信息，用于代替session对象
 * @Author: TimeWood
 * @Date: 2021/1/14
 */

@Component
public class HostHolder {
    private ThreadLocal<User> users = new ThreadLocal<>();

    public void setUsers(User user) {
        users.set(user);
    }

    public User getUsers() {
        return users.get();
    }

    public void clear() {
        users.remove();
    }
}

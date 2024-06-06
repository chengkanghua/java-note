package com.yemage.consumer.client;

import com.yemage.consumer.pojo.User;
import org.springframework.stereotype.Component;

/**
 * @author yemage
 */
@Component
public class UserClientFallback implements UserClient{

    @Override
    public User queryById(Long id) {
        User user = new User();
        user.setName("用户异常");
        return user;
    }
}

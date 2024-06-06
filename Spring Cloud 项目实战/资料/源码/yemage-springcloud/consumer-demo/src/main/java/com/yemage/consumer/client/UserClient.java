package com.yemage.consumer.client;

import com.yemage.consumer.config.FeignConfig;
import com.yemage.consumer.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author yemage
 */

@FeignClient(value = "user-service",fallback = UserClientFallback.class,configuration = FeignConfig.class)
public interface UserClient {
    //"http://user-service/user/" + id;

    @GetMapping("/user/{id}")
    public User queryById(@PathVariable Long id);
}

package com.kang.user.service;

import com.kang.user.service.hystrix.UserServiceHystrix;
import com.kang.user.vo.UserVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "user-service", fallback = UserServiceHystrix.class)
public interface IUserService {
    /**
     * 获取用户信息
     * @param id
     * @return
     */
    @GetMapping("/user")
    UserVO get(@RequestParam("id") Long id);

    /**
     * 保存用户信息
     * @param userVO
     * @return
     */
    @PostMapping("/user")
    boolean save(@RequestBody UserVO userVO);
}

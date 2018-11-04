package com.kang.user.web;

import com.kang.user.domain.User;
import com.kang.user.service.UserService;
import com.kang.user.vo.UserVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public UserVO get(Long id) {
        User user = userService.get(id);
        UserVO userVO = new UserVO();
        BeanUtils.copyProperties(user,userVO);
        return userVO;
    }

    @PostMapping
    public boolean save(@RequestBody UserVO userVO) {
        User user = new User();
        BeanUtils.copyProperties(userVO,user);
        userService.save(user);
        return true;
    }
}

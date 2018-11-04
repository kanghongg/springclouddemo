package com.kang.user.service.hystrix;

import com.kang.user.service.IUserService;
import com.kang.user.vo.UserVO;
import org.springframework.stereotype.Component;

@Component
public class UserServiceHystrix implements IUserService{
    /**
     * 获取用户信息
     *
     * @param id
     * @return
     */
    @Override
    public UserVO get(Long id) {
        return null;
    }

    /**
     * 保存用户信息
     *
     * @param userVO
     * @return
     */
    @Override
    public boolean save(UserVO userVO) {
        return false;
    }
}

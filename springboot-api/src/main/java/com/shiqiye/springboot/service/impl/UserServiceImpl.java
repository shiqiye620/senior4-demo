package com.shiqiye.springboot.service.impl;

import com.shiqiye.springboot.entity.User;
import com.shiqiye.springboot.mapper.UserMapper;
import com.shiqiye.springboot.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 石启业
 * @since 2020-05-27
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}

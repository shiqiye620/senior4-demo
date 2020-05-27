package com.shiqiye.springboot.service.impl;

import com.shiqiye.springboot.entity.Hobby;
import com.shiqiye.springboot.mapper.HobbyMapper;
import com.shiqiye.springboot.service.IHobbyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 爱好表 服务实现类
 * </p>
 *
 * @author 石启业
 * @since 2020-05-27
 */
@Service
public class HobbyServiceImpl extends ServiceImpl<HobbyMapper, Hobby> implements IHobbyService {

}

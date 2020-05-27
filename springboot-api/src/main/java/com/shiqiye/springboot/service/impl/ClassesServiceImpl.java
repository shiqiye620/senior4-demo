package com.shiqiye.springboot.service.impl;

import com.shiqiye.springboot.entity.Classes;
import com.shiqiye.springboot.mapper.ClassesMapper;
import com.shiqiye.springboot.service.IClassesService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 班级表 服务实现类
 * </p>
 *
 * @author 石启业
 * @since 2020-05-27
 */
@Service
public class ClassesServiceImpl extends ServiceImpl<ClassesMapper, Classes> implements IClassesService {

}

package com.shiqiye.springboot.service.impl;

import com.shiqiye.springboot.entity.Student;
import com.shiqiye.springboot.mapper.StudentMapper;
import com.shiqiye.springboot.service.IStudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 学生表 服务实现类
 * </p>
 *
 * @author 石启业
 * @since 2020-05-27
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {

}

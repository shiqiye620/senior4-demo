package com.shiqiye.springboot.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 班级表
 * </p>
 *
 * @author 石启业
 * @since 2020-05-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_classes")
public class Classes implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    /**
     * 班级名称
     */
    private String name;


}

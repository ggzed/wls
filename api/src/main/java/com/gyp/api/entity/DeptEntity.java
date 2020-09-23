package com.gyp.api.entity;

/**
 * @Classname DeptEntity
 * @Description TODO
 * @Date 2020/9/23 16:29
 * @Created by gyp
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@AllArgsConstructor  //全参数的构造函数
@NoArgsConstructor   //无参数的构造函数
@Data              //get和set方法
@Accessors(chain = true)  //链式访问，使用链式创建的set方法有返回值
@SuppressWarnings("serial")  //忽略黄色警告
public class DeptEntity implements Serializable {
    private Integer did;//部门id，主键
    private String dname;//部门名称
    private String dbsource;//来自哪个数据库的标识列
}

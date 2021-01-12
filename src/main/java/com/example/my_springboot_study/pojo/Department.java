package com.example.my_springboot_study.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//部门表
@Data //@Data可以为类提供读写功能，从而不用写get、set方法,他还会为类提供 equals()、hashCode()、toString() 方法。
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    private Integer id;
    private String departmentName;
}

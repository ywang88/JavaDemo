package com.mc.java8.Meth;

import com.mc.java8.entity.Employee;

/**
 * Author wangyi
 * Create 2020-10-27 23:43
 * ClassName FilterEmployeeByAge
 * Version 1.0
 */
//根据年龄大于xxx查询接口
public class FilterEmployeeByAge implements MyPredicate<Employee> {
    @Override
    public boolean test(Employee employee) {
        return employee.getAge() >= 35;
    }
}

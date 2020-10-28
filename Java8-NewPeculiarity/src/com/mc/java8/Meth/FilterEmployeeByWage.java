package com.mc.java8.Meth;

import com.mc.java8.entity.Employee;

/**
 * Author wangyi
 * Create 2020-10-27 23:52
 * ClassName FilterEmployeeByWage
 * Version 1.0
 */
//根据工资大于xxx查询接口
public class FilterEmployeeByWage implements MyPredicate<Employee> {
    @Override
    public boolean test(Employee employee) {
        return employee.getWage() >= 1000;
    }

}
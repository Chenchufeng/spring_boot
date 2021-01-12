package com.example.my_springboot_study.dao;


import com.example.my_springboot_study.pojo.Department;
import com.example.my_springboot_study.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class EmployeeDao {
    //员工有所属的部门
    private DepartmentDao departmentDao;
    //模拟数据库中的数据
    //模拟数据库中的数据，初始化数据
    private static Map<Integer, Employee> employees=null;


    @Autowired
    public  void setDepartmentDao(DepartmentDao departmentDao){
        this.departmentDao=departmentDao;
    }
    static{
        employees=new HashMap<Integer, Employee>();    //创建一个员工表
        employees.put(1001,new Employee(1001,"AA","437121948@qq.com",0,new Department(101,"教学部")));
        employees.put(1002,new Employee(1001,"BB","437456458@qq.com",1,new Department(102,"市场部")));
        employees.put(1003,new Employee(1001,"CC","346643666@qq.com",0,new Department(103,"教研部")));
        employees.put(1004,new Employee(1001,"DD","768761948@qq.com",1,new Department(104,"运营部")));
        employees.put(1005,new Employee(1001,"EE","498421948@qq.com",0,new Department(105,"后勤部")));
    }
    //主键自增！
    private static Integer initId=1006;
    //增加一个员工
    public void save(Employee employee){
        if(employee.getId()==null){
            employee.setId(initId++);
        }
        employee.setDepartment(departmentDao.getDepartmentById(employee.getDepartment().getId()));
        employees.put(employee.getId(),employee);
    }

    //查询全部员工信息
    public Collection<Employee> getAll(){
        return employees.values();
    }

    //用过id查询员工
    public Employee getEmployeeById(Integer id){
        return employees.get(id);
    }

    //删除员工
    public void delete(Integer id){
        employees.remove(id);
    }
}

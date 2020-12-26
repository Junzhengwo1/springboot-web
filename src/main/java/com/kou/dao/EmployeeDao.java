package com.kou.dao;

import com.kou.pojo.Department;
import com.kou.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author JIAJUN KOU
 */
@Repository
public class EmployeeDao {

    //模拟数据库
    //模拟数据库中的值
    private static Map<Integer, Employee> employeeMap=null;
    @Autowired
    private DepartmentDao departmentDao;
    static {
        //模拟创建了一个数据库表
        employeeMap=new HashMap<Integer, Employee>();
        employeeMap.put(101,new Employee(11,"aa",1,new Department(101,"教学部")));
        employeeMap.put(102,new Employee(12,"bb",0,new Department(102,"丞相府")));
        employeeMap.put(103,new Employee(13,"cc",1,new Department(103,"廷尉府")));
        employeeMap.put(104,new Employee(14,"dd",1,new Department(105,"章台宫")));

    }

    /**
     * 增加员工信息
     * 主键自增
     */
    private static Integer id=15;
    public void save(Employee employee){
        if(employee.getId()==null){
            employee.setId(id++);
        }
        employee.setDepartment(departmentDao.getDepartmentById(employee.getDepartment().getId()));

        employeeMap.put(employee.getId(),employee);
    }

    /**
     * 查询全部员工信息
     */

    public Collection<Employee> getAll(){
        return employeeMap.values();
    }
    /**
     * 通过id查询员工
     */

    public Employee getEmployeeById(Integer id){
        return employeeMap.get(id);
    }

    public void delete(Integer id){
        employeeMap.remove(id);
    }
}


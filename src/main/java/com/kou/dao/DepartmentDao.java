package com.kou.dao;

import com.kou.pojo.Department;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Joaquin
 */
@Repository
public class DepartmentDao {

    //模拟数据库中的值
    private static Map<Integer, Department> departmentMap=null;

    static {
        //模拟创建了一个数据库表
        departmentMap=new HashMap<Integer, Department>();
        departmentMap.put(101,new Department(101,"教学部"));
        departmentMap.put(102,new Department(102,"丞相府"));
        departmentMap.put(103,new Department(103,"廷尉府"));
        departmentMap.put(104,new Department(104,"小卖部"));
        departmentMap.put(105,new Department(105,"章台宫"));

    }

    /**
     * 获取所有部门信息
     */
    public Collection<Department> getDepartments(){
        return departmentMap.values();
    }

    /**
     * 通过id得到部门
     */
    public Department getDepartmentById(Integer id){
        return departmentMap.get(id);
    }
}

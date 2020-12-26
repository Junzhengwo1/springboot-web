package com.kou;


import com.kou.dao.EmployeeDao;
import com.kou.pojo.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collection;


@SpringBootTest
class SpringbootWebApplicationTests {

    @Autowired
    private EmployeeDao employeeDao;
    @Test
    void contextLoads() {
        Collection<Employee> all = employeeDao.getAll();
        System.out.println(all);

    }

}

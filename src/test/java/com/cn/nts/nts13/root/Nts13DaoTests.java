package com.cn.nts.nts13.root;

import com.cn.nts.nts13.root.dao.EmpMapper;
import com.cn.nts.nts13.root.entity.Emp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@SpringBootTest(classes =Nts13Application.class)
@Transactional
@Rollback
class Nts13DaoTests {

    @Autowired
    private EmpMapper empMapper;

    @Test
    public void testSelect(){
       List<Emp> empList=empMapper.selectAll();

        empList.forEach((item)->{
            System.out.println("######"+item.getName()+"######");
        });
    }
}

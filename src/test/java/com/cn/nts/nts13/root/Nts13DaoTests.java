package com.cn.nts.nts13.root;

import com.cn.nts.nts13.root.dao.EmpMapper;
import com.cn.nts.nts13.root.dao.ItemsMapper;
import com.cn.nts.nts13.root.entity.Emp;
import com.cn.nts.nts13.root.entity.Items;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.List;


@SpringBootTest(classes = Nts13Application.class)
@Transactional
@Rollback
class Nts13DaoTests {

    @Autowired
    private EmpMapper empMapper;

    @Autowired
    private ItemsMapper itemsMapper;

    @Test
    public void testSelect() {
        List<Emp> empList = empMapper.selectAll();

        empList.forEach((item) -> {
            System.out.println("######" + item.getName() + "######");
        });
    }

    @Test
    public void testPage() {
        PageHelper.startPage(1, 2);

        List<Items> list = itemsMapper.selectAll();
        list.forEach((items) -> {
            System.out.println(items.getName());
        });
        //创建一个PageInfo对象,传入泛型类
        PageInfo<Items> pageInfo = new PageInfo<>();

        pageInfo.setList(list);
        list=pageInfo.getList();
//        Example ex = new Example(Items.class);
//        PageInfo<Items> pageInfo = (PageInfo<Items>) itemsMapper.selectByExample(ex);
//        List<Items> list = pageInfo.getList();

        list.forEach((items) -> {
            System.out.println("##########"+items.getName());
        });
    }
}

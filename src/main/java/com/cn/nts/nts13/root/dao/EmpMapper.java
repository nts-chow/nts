package com.cn.nts.nts13.root.dao;

import com.cn.nts.nts13.root.entity.Emp;
import java.util.List;

public interface EmpMapper {
    int insert(Emp record);

    List<Emp> selectAll();
}
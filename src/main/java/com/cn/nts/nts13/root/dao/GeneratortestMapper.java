package com.cn.nts.nts13.root.dao;

import com.cn.nts.nts13.root.entity.Generatortest;
import java.util.List;

public interface GeneratortestMapper {
    int insert(Generatortest record);

    List<Generatortest> selectAll();
}
package com.cn.nts.nts13.root.service.impl;

import com.cn.nts.nts13.root.dao.ItemsMapper;
import com.cn.nts.nts13.root.entity.Items;
import com.cn.nts.nts13.root.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("MainService")
public class MainServiceImpl implements MainService {

    @Resource
    private ItemsMapper itemsMapper;

    @Override
    public List<Items> findAll() {
        return itemsMapper.selectAll();
    }
}

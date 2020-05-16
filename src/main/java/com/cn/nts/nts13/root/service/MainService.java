package com.cn.nts.nts13.root.service;

import com.cn.nts.nts13.root.entity.Items;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("MainService")
public interface MainService {
    List<Items> findAll();
}

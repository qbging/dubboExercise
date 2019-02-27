package com.gqb.dubbo.service;

import com.gqb.pojo.Menu;

import java.util.List;

public interface MenuDubboService {
    List<Menu> selAll();

    int updMenu(Menu menu);

    Menu selById(int id);
}

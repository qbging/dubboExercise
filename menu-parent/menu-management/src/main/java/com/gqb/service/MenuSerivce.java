package com.gqb.service;

import com.gqb.pojo.Menu;

import java.util.List;
import java.util.Map;

public interface MenuSerivce {
    List<Menu> show();

    Map<String,Object> showMenu(int id);

    int update(Menu menu);
}

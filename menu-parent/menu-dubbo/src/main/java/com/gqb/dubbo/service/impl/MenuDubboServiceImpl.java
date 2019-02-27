package com.gqb.dubbo.service.impl;

import com.gqb.dubbo.service.MenuDubboService;
import com.gqb.mapper.MenuMapper;
import com.gqb.pojo.Menu;

import javax.annotation.Resource;
import java.util.List;

public class MenuDubboServiceImpl implements MenuDubboService {

    @Resource
    private MenuMapper menuMapper;

    public List<Menu> selAll() {
        List<Menu> menus = menuMapper.selAll();
        for (Menu menu:menus){
            if (0!=menu.getPid()){
                menu.setParent(menuMapper.selById(menu.getPid()));
            }
            menu.setChildren(menuMapper.selByPid(menu.getId()));
        }
        return menus;
    }

    public int updMenu(Menu menu) {
        return menuMapper.updMenu(menu);
    }

    public Menu selById(int id) {
        return menuMapper.selById(id);
    }
}

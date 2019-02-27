package com.gqb.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gqb.dubbo.service.MenuDubboService;
import com.gqb.pojo.Menu;
import com.gqb.service.MenuSerivce;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MenuServiceImpl implements MenuSerivce {

    //远程dubbo服务
    @Reference
    private MenuDubboService menuDubboService;

    public List<Menu> show() {
        return menuDubboService.selAll();
    }

    public Map<String,Object> showMenu(int id) {
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("menu",menuDubboService.selById(id));
        map.put("allmenu",menuDubboService.selAll());
        return map;
    }

    public int update(Menu menu) {
        return menuDubboService.updMenu(menu);
    }
}

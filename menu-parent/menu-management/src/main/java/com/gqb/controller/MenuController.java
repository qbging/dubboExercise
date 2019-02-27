package com.gqb.controller;

import com.gqb.pojo.Menu;
import com.gqb.service.MenuSerivce;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Map;

@Controller
public class MenuController {

    @Resource
    private MenuSerivce menuSerivce;

    @RequestMapping("/show")
    public String show(Model model) {
        model.addAttribute("list",menuSerivce.show());
        return "index.jsp";
    }
    @RequestMapping("/showMenu")
    public String showMenu(int id,Model model){
        Map<String, Object> map = menuSerivce.showMenu(id);
        model.addAttribute("menu",map.get("menu") );
        model.addAttribute("allmenu",map.get("allmenu") );
        return "/update.jsp";
    }
    @RequestMapping("update")
    public String update(Menu menu){
        int index = menuSerivce.update(menu);
        if(index>0){
            //转发 路径显示/update
            return "/show";
            //重定向 路径现在/show
//            return "redirect:/show";
        }else{
            return "redirect:/showMenu?id="+menu.getId();
        }
    }
}

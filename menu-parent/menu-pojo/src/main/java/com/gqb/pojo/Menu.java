package com.gqb.pojo;

import java.io.Serializable;
import java.util.List;

public class Menu implements Serializable {
    private int id;
    private String name;
    private int pid;
    private List<Menu> children;
    private Menu parent;

    public Menu getParent() {
        return parent;
    }
    public void setParent(Menu parent) {
        this.parent = parent;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPid() {
        return pid;
    }
    public void setPid(int pid) {
        this.pid = pid;
    }
    public List<Menu> getChildren() {
        return children;
    }
    public void setChildren(List<Menu> children) {
        this.children = children;
    }
}

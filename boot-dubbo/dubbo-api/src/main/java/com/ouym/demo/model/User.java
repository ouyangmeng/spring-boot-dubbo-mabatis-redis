package com.ouym.demo.model;

import java.io.Serializable;

/**
 * @Author: ouym
 * @Description:
 * @Date: Created in 14:12 2018/9/26
 * @Modified By:
 */
public class User implements Serializable {
    private int id;
    private String username;
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

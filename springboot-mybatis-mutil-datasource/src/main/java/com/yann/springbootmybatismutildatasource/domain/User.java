package com.yann.springbootmybatismutildatasource.domain;

/**
 * @program: demo3
 * @description: 用户实体类
 * @author: Yann
 * @create: 2019-03-28 14:58
 **/
public class User {

    private Long id;
    private String userName;
    private String description;

    private City city;

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
//    user是主数据源，有从库的字段，
//    但是这么做好么

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

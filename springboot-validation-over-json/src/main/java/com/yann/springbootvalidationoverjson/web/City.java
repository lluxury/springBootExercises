package com.yann.springbootvalidationoverjson.web;

import com.yann.springbootvalidationoverjson.result.ErrorInfoInterface;

import java.io.Serializable;

/**
 * @program: demo3
 * @description: 城市实体类
 * @author: Yann
 * @create: 2019-03-26 14:47
 **/
public class City implements Serializable {
    private static final long serialVersionUID = -1L;

    private Long id;

    private Long provinceID;

    private String cityName;

    private String description;

    public City(){
}

public City(Long id, Long provinceID, String cityName, String description){
    this.id = id;
    this.provinceID = provinceID;
    this.cityName = cityName;
    this.description = description;
}

    public Long getId(){
    return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public Long getProvinceID() {
        return provinceID;
    }

    public void setProvinceID(Long provinceID) {
        this.provinceID = provinceID;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
package com.yc.model;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {

    private Integer id;
    private String name;
    private String sex;
    private String password;
    private String hobby;
    private Date regTime;
//    private String introduce;
    private String headPic;
    private Date birthday;
//    private String homeAddress;
//    private String workAddress;

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    public String getHeadPic() {
        return headPic;
    }

    public void setHeadPic(String headPic) {
        this.headPic = headPic;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public User(String name, String sex, String password, String hobby, Date regTime, String headPic, Date birthday) {
        this.name = name;
        this.sex = sex;
        this.password = password;
        this.hobby = hobby;
        this.regTime = regTime;
        this.headPic = headPic;
        this.birthday = birthday;
    }
}

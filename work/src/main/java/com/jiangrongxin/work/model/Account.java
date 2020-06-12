package com.jiangrongxin.work.model;

public class Account {
    private Integer cust_id;//客户号
    private String surname;//客户姓名
    private String gender;//性别
    private String educa_des;//教育状况
    private String mar_des;//婚姻状况
    private Integer birthday;//生日
    private String address;//住址

    public Integer getCust_id() {
        return cust_id;
    }

    public void setCust_id(Integer cust_id) {
        this.cust_id = cust_id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEduca_des() {
        return educa_des;
    }

    public void setEduca_des(String educa_des) {
        this.educa_des = educa_des;
    }

    public String getMar_des() {
        return mar_des;
    }

    public void setMar_des(String mar_des) {
        this.mar_des = mar_des;
    }

    public Integer getBirthday() {
        return birthday;
    }

    public void setBirthday(Integer birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Account{" +
                "cust_id=" + cust_id +
                ", surname='" + surname + '\'' +
                ", gender='" + gender + '\'' +
                ", educa_des='" + educa_des + '\'' +
                ", mar_des='" + mar_des + '\'' +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                '}';
    }
}

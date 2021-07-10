package com.service;

/**
 * 用户业务类
 */
public class ServiceUser {

    int no;

    int id;

    public ServiceUser() {
    }

    public ServiceUser(int no) {
        this.no = no;
    }

    public ServiceUser(int no, int id) {
        this.no = no;
        this.id = id;
        System.out.println(no + " " + id);
    }

    /**
     * 登陆方法
     * @param name 用户名
     * @param password 密码
     * @return  true表示登录成功，false表示登陆失败
     */

    public boolean login(String name,String password){
        if ("admin".equals(name) && "123".equals(password)){
            return  true;
        }
        return  false;
    }

    /**
     * 退出系统的方法
     */
    private void logout(){
        System.out.println("系统已安全退出！");
    }

    @Override
    public String toString() {
        return "ServiceUser{" +
                "no=" + no +
                ", id=" + id +
                '}';
    }
}

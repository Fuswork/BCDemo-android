package com.fuswork.bcdemo.model;

/**
 * Created by denggaofeng on 2018/1/19.
 */

public class PersonModel {

    private UserBean userBean;

    public UserBean getUserBean(){
        return userBean;
    }

    public void setUserBean(UserBean userBean){
        this.userBean = userBean;
    }

    public static class UserBean {

        private String name;
        private String age;
        private String gender;
        private String status;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
    }
}

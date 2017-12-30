package com.pinker.entity;

import java.util.Date;

/**
 * Created by Aries.Gu on 2017/12/25.
 *
 * 用户（用户名，密码，邮箱，安全问题，问题答案，用户角色，账号状态，
 *       创建时间，居住地，学校，性别，生日，星座，头像，个人说明）
 */

public class pk_user {
    private  Integer id;                  //id
    private  String loginName;          //登陆账号
    private  String password;           //密码
    private  String username;           //用户名
    private  String  email;              //邮箱
    private  Long roleId;               //角色ID
    private  Long status;               //状态
    private  Date createtime;           //创建时间
    private  Date lastlogin;            //最后登陆
    private  String residence;          //居住地
    private  String school;              //学校
    private  String gender;              //性别

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    private  Date birthday;              //生日
    private  String constellation;      //星座
    private  String introduction;       //个人说明
    private  String header;              //头像

    /**
     * 存放角色实体
     */
    private Role role;


    /*    构造方法     */
    public pk_user() {
    }

    public pk_user(Integer id, String loginName, String password, String username, String email, Long roleId, Long status, Date createtime, Date lastlogin, String residence, String school, String gender, Date birthday, String constellation, String introduction, String header) {
        this.id = id;
        this.loginName = loginName;
        this.password = password;
        this.username = username;
        this.email = email;
        this.roleId = roleId;
        this.status = status;
        this.createtime = createtime;
        this.lastlogin = lastlogin;
        this.residence = residence;
        this.school = school;
        this.gender = gender;
        this.birthday = birthday;
        this.constellation = constellation;
        this.introduction = introduction;
        this.header = header;
    }

    /*    toString方法 */
    @Override
    public String toString() {
        return "pk_user{" +
                "id=" + id +
                ", loginName='" + loginName + '\'' +
                ", password='" + password + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", roleId=" + roleId +
                ", status=" + status +
                ", createtime=" + createtime +
                ", lastlogin=" + lastlogin +
                ", residence='" + residence + '\'' +
                ", school='" + school + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday=" + birthday +
                ", constellation='" + constellation + '\'' +
                ", introduction='" + introduction + '\'' +
                ", header='" + header + '\'' +
                '}';
    }
    /*    get、set方法 */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getLastlogin() {
        return lastlogin;
    }

    public void setLastlogin(Date lastlogin) {
        this.lastlogin = lastlogin;
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getConstellation() {
        return constellation;
    }

    public void setConstellation(String constellation) {
        this.constellation = constellation;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }
}

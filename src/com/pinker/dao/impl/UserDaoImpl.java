package com.pinker.dao.impl;

import com.pinker.dao.BaseDao;
import com.pinker.dao.UserDao;
import com.pinker.entity.Page;
import com.pinker.entity.pk_user;

import java.util.Date;
import java.util.List;

/**
 * Created by Aries.Gu on 2017/12/26.
 */

public class UserDaoImpl extends BaseDao<pk_user> implements UserDao {

    @Override//注册 添加新用户 test pass
    public boolean addUser(String loginName, String  password, Date createtime) {
        String sql="insert into pk_user(loginName,password,username,createtime) values(?,?,?,?)";
        int update =
                this.update(sql,loginName,password,loginName,createtime );
        return update!=0;
    }

    @Override //修改资料 更新信息 test pass
    public boolean updateUser(pk_user pkuser) {
        String sql="update pk_user set loginName=?,password=?,username=?,email=?,roleId=?,status=?,createtime=?,lastlogin=?,residence=?,school=?,gender=?,birthday=?,constellation=?,introduction=?,header=?  where id=?";
        int update =
                this.update(sql, pkuser.getLoginName(), pkuser.getPassword(), pkuser.getUsername(), pkuser.getEmail(),
                        pkuser.getRoleId(), pkuser.getStatus(), pkuser.getCreatetime(), pkuser.getLastlogin(),
                        pkuser.getResidence(), pkuser.getSchool(), pkuser.getGender(), pkuser.getBirthday(),
                        pkuser.getConstellation(), pkuser.getIntroduction(), pkuser.getHeader(),pkuser.getId());
        return update!=0;
    }

    @Override//登陆 根据登录名和密码登陆 test pass
    public pk_user login(String loginName, String password) {
        String sql="select * from pk_user where loginName=? and password=?";
        pk_user bean = getBean(sql, loginName, password);
        return bean;
    }

    @Override//好友推荐 寻找相同学校的人 test pass
    public List<pk_user> findUsersBySchool(pk_user pkuser) {
        String sql="select * from pk_user where id not in (?) having school=?";
        List<pk_user> listBean = getListBean(sql, pkuser.getId(), pkuser.getSchool());
        return listBean;
    }

    @Override//好友推荐 寻找相同居住地的人 test pass
    public List<pk_user> findUsersByResidence(pk_user pkuser) {
        String sql="select * from pk_user where id not in (?) having residence=?";
        List<pk_user> listBean = getListBean(sql, pkuser.getId(), pkuser.getResidence());
        return listBean;
    }

    @Override//根据id查询用户  test pass
    public pk_user findByUserId(Integer id) {
        String sql="select * from pk_user where id=?";
        pk_user bean = this.getBean(sql, id);
        return bean;
    }

    @Override//根据姓名查询用户 test pass
    public  List<pk_user> findByUserName(String name) {
        String newname="%"+name+"%";
        String sql="select * from pk_user where username like ?" ;
        List<pk_user> listBean = this.getListBean(sql, newname);
        return listBean;
    }

    @Override//显示列表 查询所有用户 test pass
    public List<pk_user> findAll(int status) {
        String sql="select * from pk_user where status=?";

        List<pk_user> listBean = this.getListBean(sql,status);
        return listBean;
    }

    @Override//根据id冻结、解冻用户 test pass
    public boolean freezeUserById(Integer status,Integer id) {
        String sql="update pk_user set status=? where id=?";
        if(status==1){
            status=0;
        }else{
            status=1;
        }

        int update = this.update(sql, status,id);
        return update!=0;
    }

    /* 查询user类分页信息的方法
    *  pageNumber pagesize已设置 index
    * totalpage totalrecord date未设置
    * */
    @Override
    public Page<pk_user> findUser(Page<pk_user> page,Integer status) {

        /*设置totalrecord*/
        String sql="select count(*) from pk_user where status = ?";  //查询到所有的记录数
        long totalrecord = (long) this.getSingleValue(sql,status);//获得查询结果
        page.setTotalRecord((int) totalrecord);     //设置所有记录数

        /*设置date*/
        sql="select * from pk_user where status=? limit ?,?";
        List<pk_user> listBean = this.getListBean(sql,status, page.getIndex(), page.getPageSize());
        page.setDate(listBean);
        return page;
    }

}

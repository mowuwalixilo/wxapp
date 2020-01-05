package com.wxapp.dao;

import com.wxapp.dbbean.TbSysUser;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;

import java.util.List;
//+--------------+-------------+------+-----+---------+----------------+
//        | Field        | Type        | Null | Key | Default | Extra          |
//        +--------------+-------------+------+-----+---------+----------------+
//        | user_id      | int(64)     | NO   | PRI | NULL    | auto_increment |
//        | user_account | varchar(20) | NO   |     | NULL    |                |
//        | user_pwd     | varchar(20) | NO   |     | NULL    |                |
//        | user_cdkey   | varchar(50) | YES  |     | NULL    |                |
//        | user_role    | bit(64)     | NO   |     | NULL    |                |
//        | user_name    | varchar(20) | NO   |     | NULL    |                |
//        | user_isValid | bit(64)     | NO   |     | b'1'    |                |
//        +--------------+-------------+------+-----+---------+----------------+
//  private long userId;
//  private String userAccount;
//  private String userPwd;
//  private String userCdkey;
//  private String userRole;
//  private String userName;
//  private String userIsValid;

@Service
public interface TbSysUserDao {
    @Select("SELECT user_id,user_account,user_pwd,user_cdkey,user_role,user_name,user_isValid " +
            "FROM tb_sys_user")
    List<TbSysUser> getAll();

    @Select("SELECT user_id,user_account,user_pwd,user_cdkey,user_role,user_name,user_isValid " +
            "FROM tb_sys_user " +
            "WHERE user_id=#{userId}")
    TbSysUser getOne(long userId);

    @Insert("INSERT INTO tb_sys_user(user_id,user_account,user_pwd,user_cdkey,user_role,user_name,user_isValid) " +
            "VALUES(#{userId},#{userAccount},#{userPwd},#{userCdkey},#{userRole},#{userName},#{userIsValid})")
    void insert(TbSysUser tbSysUser);

    @Update("UPDATE tb_sys_user SET " +
            "user_account=#{userAccount},user_pwd=#{userPwd},user_cdkey=#{userCdkey},user_role=#{userRole},user_name=#{userName},user_isValid=#{userIsValid} " +
            "WHERE user_id=#{userId}")
    void update(TbSysUser tbSysUser);

    @Delete("DELETE FROM tb_sys_user " +
            "WHERE user_id=#{userId}")
    void delete(long userId);
}

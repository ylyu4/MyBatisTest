package cn.dao;

import cn.user.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface InterfaceUserDao {
    @Select("select * from Users")
    List<User> findAll();
}

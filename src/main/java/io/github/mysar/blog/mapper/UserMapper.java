package io.github.mysar.blog.mapper;

import io.github.mysar.blog.modal.vo.User;
import io.github.mysar.blog.modal.vo.UserInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * FILE: com.eumji.zblog.mapper.UserMapper.java
 * MOTTO:  不积跬步无以至千里,不积小流无以至千里
 * AUTHOR: EumJi
 * DATE: 2017/4/9
 * TIME: 10:20
 */
public interface UserMapper {
    /**
     * 获取用户凭证
     * @param username 账号
     * @return
     */
    User getUser(@Param("username") String username);

    /**
     * 获取所有的用户
     * @return
     */
    List<User> allUser();

    UserInfo getUserInfo();

    void updateAvatar(@Param("url") String url, @Param("username") String username);

    void updatePassword(User user);

    void updateUserInfo(UserInfo userInfo);

    void insertUser(User user);
}

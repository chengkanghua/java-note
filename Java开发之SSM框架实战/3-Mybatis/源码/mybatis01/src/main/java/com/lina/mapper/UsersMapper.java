package com.lina.mapper;

import com.lina.pojo.Users;

/**
 * ClassName: UsersMapper
 *
 * @author wanglina
 * @version 1.0
 */
public interface UsersMapper {

    Users queryById(int userId);
    Users queryById2(int userId);
}

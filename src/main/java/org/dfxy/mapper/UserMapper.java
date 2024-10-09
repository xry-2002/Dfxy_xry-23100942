package org.dfxy.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.dfxy.model.User;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> findAll();

}

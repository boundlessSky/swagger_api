package com.clare.mapper;

import com.clare.domain.Pr_user;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Pr_userMapper {
    public Pr_user getById(@Param("id") long id);
    public List<Pr_user> getListByPage(@Param("pageSize") int pageSize, @Param("pageNum") int pageNum);
    public void updateNickNameById(Pr_user user);
}

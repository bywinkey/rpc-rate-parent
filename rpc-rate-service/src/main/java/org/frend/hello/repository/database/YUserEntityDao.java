package org.frend.hello.repository.database;

import org.apache.ibatis.annotations.Param;
import org.frend.annotation.MyBatis;
import org.frend.hello.pojo.YUserEntity;

@MyBatis
public interface YUserEntityDao {
    int deleteByPrimaryKey(Integer id);

    int insert(YUserEntity record);

    int insertSelective(YUserEntity record);

    YUserEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YUserEntity record);

    int updateByPrimaryKey(YUserEntity record);

    /**
     * 根据用户名查询用户信息
     * @param name
     * @return
     */
    YUserEntity loadUserByName(@Param("username") String name);
}
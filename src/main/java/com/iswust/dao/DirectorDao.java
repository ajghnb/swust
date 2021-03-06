package com.iswust.dao;

import com.iswust.model.Director;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface DirectorDao {
    public Director selectDirectorById(@Param("id")int id);
    public int updateDirectorUser(@Param("user")Director director);
    public int addDirectorUser(@Param("user")Director director);
    public int deleteDirectorUser(@Param("user") Director director);
}

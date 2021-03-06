package com.iswust.dao;

import com.iswust.model.Community;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface CommunityDao {

    Community communityselectByid(@Param("id") int id);

    Community communityselectByname(@Param("name") String name);

    Boolean communitydeleteByname(@Param("co_name") String name);



}

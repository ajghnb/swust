package com.iswust.service;
import com.iswust.model.Community;


public interface CommunityService {

    public Community communityselectByid(int id);

    public Community communityselectByname(String name);

    public Boolean communitydeleteByname(String name);


}

package com.iswust.service;

import com.iswust.dao.CommunityDao;
import com.iswust.model.Community;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommunityServiceImpl implements CommunityService{
    @Autowired
    CommunityDao communityDao;

    @Override
    public Community communityselectByid(int id) {
        return communityDao.communityselectByid(id);
    }

    @Override
    public Community communityselectByname(String name) {
        return communityDao.communityselectByname(name);
    }

    @Override
    public Boolean communitydeleteByname(String name) {
        Boolean flag = false;
        flag = communityDao.communitydeleteByname(name);
        return flag;
    }
}

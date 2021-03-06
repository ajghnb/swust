package com.iswust.controller;


import com.iswust.model.Community;
import com.iswust.service.CommunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/community")
public class CommunityController {
    @Autowired
    CommunityService communityService;

    @RequestMapping("/selectbyid/{id}")
    @ResponseBody
    public Community communityselectByid(@PathVariable("id") int id){

        return communityService.communityselectByid(id);
    }

    @RequestMapping("/selectbyname/{name}")
    @ResponseBody
    public Community communityselectByname(@PathVariable("name") String name){
        Community community = communityService.communityselectByname(name);
        return community;
    }

    @RequestMapping("/deltebyname/{name}")
    @ResponseBody
    public Boolean communitydeleteByname(@PathVariable("name") String name){
        Boolean flag = communityService.communitydeleteByname(name);
        return flag;

    }
}

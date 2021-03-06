package com.iswust.controller;

import com.iswust.model.ApplicantUser;
import com.iswust.service.ApplicantUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
@ResponseBody
@RequestMapping(value = "/applicant", method = POST, produces = {APPLICATION_JSON_VALUE})
public class ApplicantUserController {

    @Autowired
    private ApplicantUserService applicantUserService;

    @RequestMapping(value = "/addApplicantUser", method = POST)
    public int addApplicantUser(@RequestBody ApplicantUser applicantUser) {
        return applicantUserService.addApplicantUser(applicantUser);
    }

    @RequestMapping(value = "/deleteApplicantUser", method = POST)
    public int deleteApplicantUser(@RequestBody ApplicantUser applicantUser) {
        return applicantUserService.deleteApplicantUser(applicantUser);
    }

    @RequestMapping(value = "/selectApplicantUserById", method = POST)
    public List<ApplicantUser> selectApplicantUserById(@RequestBody int id) {
        return applicantUserService.selectApplicantUserById(id);
    }

    @RequestMapping(value = "/updateApplicantUser", method = POST)
    public int updateApplicantUser(@RequestBody ApplicantUser applicantUser) {
        return applicantUserService.updateApplicantUser(applicantUser);
    }

}

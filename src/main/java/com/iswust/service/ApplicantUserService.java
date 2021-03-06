package com.iswust.service;

import com.iswust.model.ApplicantUser;

import java.util.List;

public interface ApplicantUserService {
    public int addApplicantUser(ApplicantUser applicantUser);
    public int deleteApplicantUser(ApplicantUser applicantUser);
    public List<ApplicantUser> selectApplicantUserById(int id);
    public int updateApplicantUser(ApplicantUser applicantUser);
}

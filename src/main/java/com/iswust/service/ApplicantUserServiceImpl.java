package com.iswust.service;

import com.iswust.dao.ApplicantUserDao;
import com.iswust.model.ApplicantUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicantUserServiceImpl implements ApplicantUserService{

    @Autowired
    private ApplicantUserDao applicantUserDao;

    @Override
    public int addApplicantUser(ApplicantUser applicantUser) {
        try {
            return applicantUserDao.addApplicantUser(applicantUser);
        } catch (Exception e) {
            return 2;
        }
    }

    @Override
    public int deleteApplicantUser(ApplicantUser applicantUser) {
        try {
            return applicantUserDao.deleteApplicantUser(applicantUser);
        } catch (Exception e) {
            return 2;
        }

    }

    @Override
    public List<ApplicantUser> selectApplicantUserById(int id) {
        try {
            return applicantUserDao.selectApplicantUserById(id);
        } catch (Exception e) {
            return null;
        }

    }

    @Override
    public int updateApplicantUser(ApplicantUser applicantUser) {
        try {
            return applicantUserDao.updateApplicantUser(applicantUser);
        } catch (Exception e) {
            return 2;
        }

    }
}

package com.iswust.dao;

import com.iswust.model.ApplicantUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ApplicantUserDao {
    public int addApplicantUser(@Param("user") ApplicantUser applicantUser);
    public int deleteApplicantUser(@Param("user") ApplicantUser applicantUser);
    public List<ApplicantUser> selectApplicantUserById(@Param("id") int id);
    public int updateApplicantUser(@Param("user") ApplicantUser applicantUser);
}

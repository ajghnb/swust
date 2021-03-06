package com.iswust.service;

import com.iswust.dao.ConsultationEventDao;
import com.iswust.model.ConsultationEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultationEventServiceImpl implements ConsultationEventService{

    @Autowired
    private ConsultationEventDao consultationEventDao;
    @Override
    public int addEvent(ConsultationEvent consultationEvent) {
        try {
            return consultationEventDao.addEvent(consultationEvent);
        } catch (Exception e) {
            return 2;
        }

    }

    @Override
    public int deleteEvent(ConsultationEvent consultationEvent) {
        try {
            return consultationEventDao.deleteEvent(consultationEvent);
        } catch (Exception e) {
            return 2;
        }
    }

    @Override
    public int updateEvent(ConsultationEvent consultationEvent) {
        try {
            return consultationEventDao.updateEvent(consultationEvent);
        } catch (Exception e) {
            return 2;
        }

    }

    @Override
    public List<ConsultationEvent> selectEventByCoId(int coId) {
        try {
            return consultationEventDao.selectEventByCoId(coId);
        } catch (Exception e) {
            return null;
        }

    }

    @Override
    public List<ConsultationEvent> selectEventByStuNum(String stuNum) {
        try {
            return consultationEventDao.selectEventByStuNum(stuNum);
        } catch (Exception e) {
            return null;
        }

    }
}

package com.iswust.service;

import com.iswust.model.ConsultationEvent;

import java.util.List;

public interface ConsultationEventService {
    public int addEvent(ConsultationEvent consultationEvent);
    public int deleteEvent(ConsultationEvent consultationEvent);
    public int updateEvent(ConsultationEvent consultationEvent);
    public List<ConsultationEvent> selectEventByCoId(int coId);
    public List<ConsultationEvent> selectEventByStuNum(String stuNum);
}

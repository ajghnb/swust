package com.iswust.dao;

import com.iswust.model.ConsultationEvent;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ConsultationEventDao {
    public int addEvent(@Param("event") ConsultationEvent consultationEvent);
    public int deleteEvent(@Param("event") ConsultationEvent consultationEvent);
    public int updateEvent(@Param("event") ConsultationEvent consultationEvent);
    public List<ConsultationEvent> selectEventByCoId(@Param("coId") int coId);
    public List<ConsultationEvent> selectEventByStuNum(@Param("stuNum") String stuNum);
}

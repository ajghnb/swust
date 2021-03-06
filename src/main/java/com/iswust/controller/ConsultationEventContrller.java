package com.iswust.controller;


import com.iswust.model.ConsultationEvent;
import com.iswust.service.ConsultationEventService;
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
@RequestMapping(value = "/consultationEvent", method = POST, produces = {APPLICATION_JSON_VALUE})
public class ConsultationEventContrller {

    @Autowired
    private ConsultationEventService consultationEventService;

    @RequestMapping(value = "/addEvent", method = POST)
    public int addEvent(@RequestBody ConsultationEvent consultationEvent) {
        return consultationEventService.addEvent(consultationEvent);
    }

    @RequestMapping(value = "/deleteEvent", method = POST)
    public int deleteEvent(@RequestBody ConsultationEvent consultationEvent) {
        return consultationEventService.deleteEvent(consultationEvent);
    }

    @RequestMapping(value = "/updateEvent", method = POST)
    public int updateEvent(@RequestBody ConsultationEvent consultationEvent) {
        return consultationEventService.updateEvent(consultationEvent);
    }

    @RequestMapping(value = "/selectEventByCoId", method = POST)
    public List<ConsultationEvent> selectEventByCoId(@RequestBody int coId) {
        return  consultationEventService.selectEventByCoId(coId);
    }

    @RequestMapping(value = "/selectEventByStuNum", method = POST)
    public List<ConsultationEvent> selectEventByStuNum(@RequestBody String stuNum) {
        return consultationEventService.selectEventByStuNum(stuNum);
    }


}

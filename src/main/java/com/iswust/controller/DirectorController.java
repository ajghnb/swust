package com.iswust.controller;

import com.iswust.model.Director;
import com.iswust.service.DirectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
@ResponseBody
@RequestMapping(value = "/director", method = POST, produces = {APPLICATION_JSON_VALUE})
public class DirectorController {

    @Autowired
    private DirectorService directorService;

    @RequestMapping(value = "/selectDirectorById", method = POST)
    public Director selectDirectorById(@RequestBody int id) {
        return directorService.selectDirectorById(id);
    }

    @RequestMapping(value = "/updateDirectorUser", method = POST)
    public int updateDirectorUser(@RequestBody Director director) {
        return directorService.updateDirectorUser(director);
    }

    @RequestMapping(value = "/addDirectorUser", method = POST)
    public int addDirectorUser(@RequestBody Director director) {
        return directorService.addDirectorUser(director);
    }

    @RequestMapping(value = "/deleteDirectorUser", method = POST)
    public int deleteDirectorUser(@RequestBody Director director) {
        return directorService.deleteDirectorUser(director);
    }
}

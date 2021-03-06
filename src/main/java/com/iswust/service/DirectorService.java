package com.iswust.service;

import com.iswust.model.Director;

public interface DirectorService {
    public Director selectDirectorById(int id);
    public int updateDirectorUser(Director director);
    public int addDirectorUser(Director director);
    public int deleteDirectorUser(Director director);
}

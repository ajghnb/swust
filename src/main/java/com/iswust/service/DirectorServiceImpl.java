package com.iswust.service;

import com.iswust.dao.DirectorDao;
import com.iswust.model.Director;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DirectorServiceImpl implements DirectorService{

    @Autowired
    private DirectorDao directorDao;

    @Override
    public Director selectDirectorById(int id) {
        try {
            return directorDao.selectDirectorById(id);
        } catch (Exception e) {
            return null;
        }

    }

    @Override
    public int updateDirectorUser(Director director) {
        try {
            return directorDao.updateDirectorUser(director);
        } catch (Exception e) {
            return 2;
        }

    }

    @Override
    public int addDirectorUser(Director director) {
        try {
            return directorDao.addDirectorUser(director);
        } catch (Exception e) {
            return 2;
        }

    }

    @Override
    public int deleteDirectorUser(Director director) {
        try {
            return directorDao.deleteDirectorUser(director);
        } catch (Exception e) {
            return 2;
        }

    }
}

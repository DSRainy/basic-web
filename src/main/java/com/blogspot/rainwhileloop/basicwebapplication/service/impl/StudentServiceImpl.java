/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blogspot.rainwhileloop.basicwebapplication.service.impl;

import com.blogspot.rainwhileloop.basicwebapplication.Model.Student;
import com.blogspot.rainwhileloop.basicwebapplication.dbmodel.Database;
import com.blogspot.rainwhileloop.basicwebapplication.service.StudentService;

/**
 *
 * @author RainWhileLoop
 */
public class StudentServiceImpl implements StudentService {

    @Override
    public boolean insert(Student student) {
        try {
            Database.add(student);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean update(Student before, Student after) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Student student) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Student select(int index) {
        return Database.getStudent(index);
    }
    
    

}

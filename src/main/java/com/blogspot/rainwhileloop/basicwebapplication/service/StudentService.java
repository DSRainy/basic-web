/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blogspot.rainwhileloop.basicwebapplication.service;

import com.blogspot.rainwhileloop.basicwebapplication.Model.Student;

/**
 *
 * @author RainWhileLoop
 */
public interface StudentService {
    
    
    public boolean insert(Student student);
    
    public boolean update(Student before, Student after);
    
    public boolean delete(Student student);
    
    public Student select(int index);
}

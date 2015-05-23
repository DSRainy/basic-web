/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blogspot.rainwhileloop.basicwebapplication.dbmodel;

import com.blogspot.rainwhileloop.basicwebapplication.Model.Student;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RainWhileLoop
 */
public class Database {
    private static final List<Student> students = new ArrayList<>();
    
    public static void add(Student student){
        Database.students.add(student);
    }
    
    public static Student getStudent(int index){
        return Database.students.get(index);
    }
}

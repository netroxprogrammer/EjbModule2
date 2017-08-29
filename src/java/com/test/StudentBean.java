/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateful;

/**
 *
 * @author mac
 */
@Stateful
public class StudentBean implements StudentBeanRemote {
    List<String> studentList;
    public  StudentBean(){
        studentList = new ArrayList<String>();
    }
    @Override
    public void setStudentName(String name) {
      studentList.add(name);
    }

    @Override
    public List<String> studentList() {
       return studentList;
    }

    @Override
    public String testBean(String msg) {
     return "Test is ok....";
    }
}

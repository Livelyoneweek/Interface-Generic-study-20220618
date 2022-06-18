package com.example._20220618_generic.util;

import com.example._20220618_generic.dto.AStudent;
import com.example._20220618_generic.dto.BStudent;

public class StartTest {

    public static AStudent aStudent = new AStudent();
    public static BStudent bStudent = new BStudent();

    public static void main(String[] args) {
        CheckStudentImpl checkStudent = new CheckStudentImpl();
        checkStudent.checkStudentType(aStudent);
        System.out.println("===================================");
        checkStudent.checkStudentType(bStudent);
    }

}

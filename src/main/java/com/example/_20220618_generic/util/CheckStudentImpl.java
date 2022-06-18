package com.example._20220618_generic.util;

import java.lang.reflect.Field;

public class CheckStudentImpl implements CheckStudent{

    @Override
    public <T> String checkStudentType(T student) {

        StringBuilder getAllBodyValue = new StringBuilder();

        try {
            Class c = student.getClass();
            Field[] fields = c.getDeclaredFields();
            for (Field field : fields) {

                // private Field일 경우 접근을 허용한다.
                field.setAccessible(true);

                System.out.println("type is: " + field.getName());
                System.out.println("value is: " + field.get(student));

                getAllBodyValue.append(field.get(student));

            }
        } catch(Exception e) {
            System.out.println(e.toString());
        }
        System.out.println(getAllBodyValue.toString());
        return "ok";
    }


}

package com.dazhi6.behavior.dataAccessObject;

import java.util.List;

/**
 * Created by Administrator on 2018/8/29.
 */
public interface StudentDao {
    public List<Student> getAllStudents();
    public Student getStudent(int rollNo);
    public void updateStudent(Student student);
    public void deleteStudent(Student student);
}

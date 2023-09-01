package de.wolffclan;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class School {

    List<Student> students = new ArrayList<Student>();

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student){
        students.add(student);
    }
    public Student getStudentById(int id){
        for(Student student:students){
            if(student.id == id){
                return student;
            }
        }
        return  null;
    }
    public void showStudents(){
        System.out.println(this.students);
    }

    @Override
    public String toString() {
        return "School{" +
                "students=" + students +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return Objects.equals(students, school.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(students);
    }
}

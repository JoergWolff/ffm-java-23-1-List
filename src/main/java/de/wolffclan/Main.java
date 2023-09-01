package de.wolffclan;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("List\n-------");

        List<Student> students= new ArrayList<Student>();
        students.add(new Student(1,"Hufstetter","Barbel", 10,"7b"));
        students.add(new Student(2,"Bärenreiter","Horst", 10,"7b"));
        students.add(new Student(4,"Meier","Ingeborg", 12,"8c"));
        students.add(new Student(4,"Obermoseer","Franz", 12,"7a"));
        System.out.println(students);

        System.out.println("List with class cchool\n-------");
        School schoolStudents = new School();
        schoolStudents.addStudent(new Student(5, "Hufstetter","Barbel", 10,"7b"));
        schoolStudents.addStudent(new Student(6,"Bärenreiter","Horst", 10,"7b"));
        schoolStudents.addStudent(new Student(7,"Meier","Ingeborg", 12,"8c"));
        schoolStudents.addStudent(new Student(8,"Obermoseer","Franz", 12,"7a"));
        schoolStudents.showStudents();

        System.out.println("get one student\n-------");
        System.out.println("Search for student with id = 7: "+schoolStudents.getStudentById(7));
    }
}
package de.wolffclan;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("List\n-------");

        List<Student> students= new ArrayList<Student>();
        students.add(new Student("Hufstetter","Barbel", 10,"7b"));
        students.add(new Student("Bärenreiter","Horst", 10,"7b"));
        students.add(new Student("Meier","Ingeborg", 12,"8c"));
        students.add(new Student("Obermoseer","Franz", 12,"7a"));
        System.out.println(students);

        System.out.println("List with class School\n-------");
        School schoolStudents = new School();
        schoolStudents.addStudent(new Student("Hufstetter","Barbel", 10,"7b"));
        schoolStudents.addStudent(new Student("Bärenreiter","Horst", 10,"7b"));
        schoolStudents.addStudent(new Student("Meier","Ingeborg", 12,"8c"));
        schoolStudents.addStudent(new Student("Obermoseer","Franz", 12,"7a"));

        schoolStudents.showStudents();
    }
}
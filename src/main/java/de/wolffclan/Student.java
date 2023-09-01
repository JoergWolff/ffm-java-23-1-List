package de.wolffclan;

import java.util.Objects;

public class Student {
    int id;
    String lastName;
    String firstName;
    int age;
    String schoolClass;

    public Student() {
    }

    public Student(int id, String lastName, String firstName, int age, String schoolClass) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.schoolClass = schoolClass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSchoolClass() {
        return schoolClass;
    }

    public void setSchoolClass(String schoolClass) {
        this.schoolClass = schoolClass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", age=" + age +
                ", schoolClass='" + schoolClass + '\'' +
                '}' + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && age == student.age && Objects.equals(lastName, student.lastName) && Objects.equals(firstName, student.firstName) && Objects.equals(schoolClass, student.schoolClass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, lastName, firstName, age, schoolClass);
    }
}

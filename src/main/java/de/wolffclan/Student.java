package de.wolffclan;

import java.util.Objects;

public class Student {
    String lastName;
    String firstName;
    int age;
    String schoolClass;

    public String getLastName() {
        return lastName;
    }

    public Student() {
    }

    public Student(String lastName, String schoolClass) {
        this.lastName = lastName;
        this.schoolClass = schoolClass;
    }

    public Student(String lastName, String firstName, int age, String schoolClass) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.schoolClass = schoolClass;
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
                "lastName='" + lastName + '\'' +
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
        return age == student.age && Objects.equals(lastName, student.lastName) && Objects.equals(firstName, student.firstName) && Objects.equals(schoolClass, student.schoolClass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName, age, schoolClass);
    }
}

package GradeManager;

import java.util.ArrayList;

public class GradeManager {
    private ArrayList<Student> studentList = new ArrayList<>();

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void showStudents() {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    public double calculateGPA() {
        if (studentList.isEmpty()) {
            return 0.0;
        }
        double totalGrade = 0.0;
        for (Student student : studentList) {
            totalGrade += student.getGrade();
        }
        return totalGrade / studentList.size();
    }
}













package GradeManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeManager gradeManager = new GradeManager();

        while (true) {
            System.out.print("Enter student name (or 'exit' to finish): ");
            String name = scanner.nextLine();

            if (name.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Enter student grade: ");
            double grade = scanner.nextDouble();
            scanner.nextLine();

            Student student = new Student(name, grade);
            gradeManager.addStudent(student);
        }

        System.out.println("List of Students and Grades:");
        gradeManager.showStudents();

        double gpa = gradeManager.calculateGPA();
        System.out.println("GPA of all students: " + gpa);
    }
}











package GradeManager;

public class Student {
    private String name;
    private double grade;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Grade: " + grade;
    }
}
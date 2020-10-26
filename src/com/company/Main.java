package com.company;
import java.util.Scanner;

public class Main {
    private static final int N = 1;

    public static Student[] ReadStudentsArray() {
        Scanner in = new Scanner(System.in);

        Student students[] = new Student[N];
        for (int i = 0; i < N; i++) {
            System.out.print("Name: ");
            String name = in.nextLine();

            System.out.print("Surname: ");
            String surname = in.nextLine();

            System.out.print("Group: ");
            String group = in.nextLine();

            System.out.print("Year: ");
            int year = in.nextInt();
            in.nextLine();

            System.out.println("Results: ");
            Result[] results = new Result[3];
            for (int j = 0; j < 3; j++) {
                System.out.println("Subject " + (j + 1) + ":");

                System.out.print("Subject name: ");
                String subject = in.nextLine();

                System.out.print("Teacher: ");
                String teacher = in.nextLine();

                System.out.print("Points: ");
                int points = in.nextInt();

                results[j] = new Result(subject, teacher, points);
            }

            students[i] = new Student(name, surname, group, 2020, results);
        }

        return students;
    }

    public static void PrintStudent(Student student) {
        System.out.println("Name: " + student.getName());
        System.out.println("Surname: " + student.getSurname());
        System.out.println("Group: " + student.getGroup());
        System.out.println("Year: " + student.getYear());

        System.out.println("Results:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Subject " + (i + 1) + ": " + student.getResults()[i].getPoints());
        }
    }

    public static void PrintStudents(Student students[]) {
        for (int i = 0; i < students.length; i++) {
            PrintStudent(students[i]);
        }
    }

    public static void GetStudentsInfo(Student students[], int min, int max) {
        min = students[0].GetAveragePoints();
        max = students[0].GetAveragePoints();
        for (int i = 1; i < students.length; i++) {
            int avg = students[i].GetAveragePoints();
            if (avg < min) {
                min = avg;
            }
            if (avg > max) {
                max = avg;
            }
        }
    }

    public static void main(String[] args) {
        Student students[] = ReadStudentsArray();
        PrintStudents(students);

        int min = 0, max = 0;
        GetStudentsInfo(students, min, max);
        System.out.print("Min: " + min);
    }
}

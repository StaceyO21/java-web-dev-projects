package org.launchcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
        public static void main(String[] args) {
            HashMap<Integer, String> students = new HashMap<>();
            Scanner input = new Scanner(System.in);
            String newStudent;
            String[] classRoster = new String[5];
            Integer newID = 0;

            System.out.println("Enter your students ID(or ENTER to finish):");

            // Get student names and grades
            do {

                System.out.print("Student: ");
                newStudent = input.nextLine();

                if (!newStudent.equals("")) {
                    System.out.print("ID: ");
                    Integer ID = input.nextInt();
                    students.put(newID, newStudent);

                    // Read in the newline before looping back
                    input.nextLine();
                }

            } while(!newStudent.equals(""));

            // Print class roster
            System.out.println("\nClass roster:");


            for (Map.Entry<Integer, String> student : students.entrySet()) {
                System.out.println(student.getValue() + "'s ID: " + student.getKey());
            }
            System.out.println("Number of Students in roster: " + students.size());
        }
    }



package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        /*
        Allow the array to hold multiple grades for each student
    John - {23, 76, 87,98}
    Barb - {12, 67, 87, 90}
    Allow the user to enter in the names and grades as before but output averages for each student
         */
        /* challenge 3
        Add the ability to enter the name and grade.
Keep the two arrays parallel so that grades[0] and names[0] correlate to the same person
SOP the name and grade
         */



        /*
        Step 1. Input student name, record index (ex. Steve = [0])
        2.enter first grade, record index of first grade in stuIniF (ex. 0(index) = [0])
        3. enter series of grades, last grade-when input = -1 , recorded in stuFinF(ex 12(index) = [0])
        4. students[0] relates to stuIniF[0]: grades begin at index 0, stuFinF[0] says grades end at index 12,
        so student Steve at [0] has grades within the array of Grades within the range of 0-12.
           */

        Scanner input = new Scanner(System.in);

        int grades[] = new int[4000];
        int studentIndex = 0;
        int counter = 0;
        int initIndex = 0;
        int finIndex = 0;
        String students[] = new String[1000];
        int stuIniF [] = new int[1000];
        int stuFinF [] = new int[1000];

// student index = good
        //IniF is screwed
        while (true) {
                System.out.println("Enter a student name(no spaces): ");

                students[studentIndex] = input.next();
                studentIndex++;


                // sets first number in range of grades for a student
                stuIniF[initIndex] = counter;
                initIndex++;

                while(true) {
                    System.out.println("Enter a grade, and '-1' to stop entering: ");
                    int gradeIn = input.nextInt();
                    if (gradeIn == -1 || counter == 3999) {
                        //records last index of grades for a student
                        stuFinF[finIndex] = counter;
                        finIndex++;
                        break;
                    }
                    else {
                        grades[counter] = gradeIn;
                        counter++;
                    }
                }
                // asks if user wants to continue
                System.out.println("Continue?('no' if you want to stop): ");
                String cont = input.next().toLowerCase();
                if (cont.equals("no")){
                break;
                }
        }
        while(true) {
            System.out.println("Who's grades would you like to access?(Enter an invalid name to stop.)");
            String tempStu = input.next();
            int tempStudentIndex = -1;
            for (int i = 0; i < students.length; i++) {
                //System.out.println(i);
                //System.out.println(students[i]);
                //System.out.println(tempStudentIndex);
                if(tempStu.equals(students[i])){
                    tempStudentIndex = i;
                    break;
                }
            }
            if(tempStudentIndex == -1){
                System.out.println("No such student. Terminating program.");
                return;
            }
            else{
                System.out.println("Exists at index: " + tempStudentIndex);
                //System.out.println(stuIniF[tempStudentIndex]);
                //System.out.println(stuFinF[tempStudentIndex]);
                int total = 0;
                int chec = (stuFinF[tempStudentIndex] - stuIniF[tempStudentIndex]);
                //System.out.println(chec);
                for (int i = stuIniF[tempStudentIndex]; i < stuFinF[tempStudentIndex]; i++) {
                    //System.out.println(grades[i]);
                    total += grades[i];

                }

                //System.out.println(total);
                //System.out.println(chec);
                double gr8grade = total/ chec;
                System.out.println(students[tempStudentIndex] + "'s grade average is: " + gr8grade);
            }
            /*double total = 0;
            for (int i = 0; i < grades.length; i++) {
                total += grades[i];
            }
            System.out.println(total / f);
            */

        }


    }
}

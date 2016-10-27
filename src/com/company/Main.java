package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int grades[] = new int[4000];
        int f = 0;
        while(true){
            System.out.println("Enter a grade, and '-1' to stop entering: ");
            int gradeIn = input.nextInt();
            if(gradeIn == -1 || f == 3999){
                break;
            }
            else{
                grades[f] = gradeIn;
                f++;
            }
        }
        double total = 0;
        for (int i = 0; i < grades.length; i++) {
            total += grades[i];
        }
        System.out.println(total/f);
      

    }
}

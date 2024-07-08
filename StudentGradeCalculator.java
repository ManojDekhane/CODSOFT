package com.company;
import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks of Mathematics - ");
        int mathematicsMarks = sc.nextInt();
        System.out.print("Enter marks of Science - ");
        int scienceMarks = sc.nextInt();
        System.out.print("Enter marks of Geography - ");
        int geographyMarks = sc.nextInt();
        System.out.print("Enter marks of History - ");
        int historyMarks = sc.nextInt();
        System.out.print("Enter marks of English - ");
        int englishMarks = sc.nextInt();
        System.out.print("Enter marks of Marathi - ");
        int marathiMarks = sc.nextInt();
        System.out.print("Enter marks of Sanskrit - ");
        int sanskritMarks = sc.nextInt();

        int totalMarks = mathematicsMarks + scienceMarks + geographyMarks + historyMarks + englishMarks + marathiMarks + sanskritMarks;

        float percentage = ((float)totalMarks)/7;

        System.out.println();
        System.out.println();
        System.out.println("*** Displaying Complete Mark Sheet ***");
        System.out.println("Mathematics = "+mathematicsMarks);
        System.out.println("Science = "+scienceMarks);
        System.out.println("Geography = "+geographyMarks);
        System.out.println("History = "+historyMarks);
        System.out.println("English = "+englishMarks);
        System.out.println("Marathi = "+marathiMarks);
        System.out.println("Sanskrit = "+sanskritMarks);
        System.out.println();
        System.out.println("Total Marks = "+totalMarks);
        System.out.println("Average Percentage = "+percentage);
        if(percentage<=100 && percentage>=91){
            System.out.println("Grade = A1");
        }else if(percentage>=81 && percentage<=90){
            System.out.println("Grade = A2");
        }else if(percentage>=71 && percentage<=80) {
            System.out.println("Grade = B1");
        }else if(percentage>=61 && percentage<=70) {
            System.out.println("Grade = B2");
        }else if(percentage>=51 && percentage<=60) {
            System.out.println("Grade = C1");
        }else if(percentage>=41 && percentage<=50) {
            System.out.println("Grade = C2");
        }else if(percentage>=35 && percentage<=40) {
            System.out.println("Grade = D");
        }else{
            System.out.println("Fail");
        }
    }
}

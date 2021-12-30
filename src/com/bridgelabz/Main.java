package com.bridgelabz;

public class Main {

    public static void main(String[] args) {
	    // i= Employee Attendance
        int i = (int)Math.floor(Math.random() * 10) % 2;
            System.out.println(i);

            if( i == 0 ) {
                System.out.println("Employee is Absent");
            } else {
                System.out.println("Employee is Present");
            }
    }
}

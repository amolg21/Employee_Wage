package com.bridgelabz;

public class Main {

    private static int wage_per_hr = 20;
    private static int full_day_hr = 8;
    private static int half_day_hr = 4;

    public static void main(String[] args) {
	    // i= Employee Attendance
        int i = (int)Math.floor(Math.random() * 10) % 3;
            System.out.println(i);

            if( i == 1 ) {
                System.out.println("Employee is Present for Full Day");
                int daily_wage = wage_per_hr * full_day_hr;
                System.out.println(daily_wage);

            } else if(i == 2) {
                System.out.println("Employee is Present for Half Day");
                int daily_wage = wage_per_hr * half_day_hr;
                System.out.println(daily_wage);

            } else {
                System.out.println("Employee is Absent");
            }
    }
}

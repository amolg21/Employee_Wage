package com.bridgelabz;

public class Main {

    private static int wage_per_hr = 20;
    private static int working_days = 20;
    private static final int Full_Time = 1;
    private static final int Part_Time = 2;

    public static void main(String[] args) {
	    /*i= Employee Attendance
            0=Employee is Absent
            1=Full time Employee
            2=Part time employee*/
        int day_hr = 0;
        int total_wages = 0;

        for (int day = 1; day <= working_days; day++) {

            int i = (int) Math.floor(Math.random() * 10) % 3;
            System.out.println(i);


            switch ((int) i) {
                case Full_Time:
                    System.out.println("Employee is Present for Full Day");
                    day_hr = 8;
                    break;

                case Part_Time:
                    System.out.println("Employee is Present for Half Day");
                    day_hr = 4;
                    break;

                default:
                    System.out.println("Employee is Absent");
                    day_hr = 0;
                    break;
            }
            int empWages = day_hr * wage_per_hr * working_days;
            total_wages = total_wages + empWages;
            System.out.println("Monthly Wages= " + empWages);
        }
        System.out.println("Total Wages= "+total_wages);
    }
}

package org.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int day, month, year = 0, week, q, m, K, J, h,total, mod;



        Scanner keyboard = new Scanner(System.in);
        boolean loop = true;
        while (loop) {
            month = checkMonth(keyboard);
            day = checkDay(keyboard);
            System.out.println();
            year = checkYear(keyboard);









            switch (month) {


                case 3:
                    System.out.println("There are 31 days in March");
                    break;
                case 4:
                    System.out.println("There are 30 days in April");
                    break;
                case 5:
                    System.out.println("There are 31 days in May");
                    break;
                case 6:
                    System.out.println("There are 30 days in June");
                    break;
                case 7:
                    System.out.println("There are 31 days in July");
                    break;
                case 8:
                    System.out.println("There are 31 days in August");
                    break;
                case 9:
                    System.out.println("There are 30 days in September");
                    break;
                case 10:
                    System.out.println("There are 31 days in October");
                    break;
                case 11:
                    System.out.println("There are 30 days in November");
                    break;
                case 12:
                    System.out.println("There are 31 days in December");
                    break;

                default:
            }

            if(day==28)
                System.out.println("You were born on Wednesday");
                System.out.println("Wednesday's child is full of woe,");

            q = 28;
            m = 5 + 1;
            K = 19;
            J = 20;
            mod = 7;
            total = (q+(13*m)/5 + K);
            total = (K/4)+(J/4) - 40 / (mod);
            total = total - 1;





            switch (day){


                case 0:
                    System.out.println(" You were born on Sunday");
                    break;
                case 1:
                    System.out.println(" You were born on Monday");
                    break;
                case 2:
                    System.out.println(" You were born on Tuesday");
                    break;
                case 3:
                    System.out.println(" You were born on Wednesday");
                    break;
                case 4:
                    System.out.println(" You were born on Thursday");
                    break;
                case 5:
                    System.out.println(" You were born on Friday");
                    break;
                case 6:
                    System.out.println(" You were born on Saturday");
                    break;

                default:
                    return;

            }

        }

        switch (year){

            case 2001:
                System.out.println("Monday's child is fair of face,");
                break;
            case 2002:
                System.out.println("Tuesday's child is full of grace,");
                break;
            case 2003:
                System.out.println("Wednesday's child is full of woe,");
                break;
            case 2004:
                System.out.println("Thursday's child has far to go.");
                break;
            case 2005:
                System.out.println("Friday's child is loving and giving,");
                break;
            case 2006:
                System.out.println("Saturday's child works hard for a living,");
                break;
            case 2007:
                System.out.println("But the child born on the Sabbath Day,");
                break;
            case 2008:
                System.out.println("Is fair and wise and good in every way.");


        }


    }








    public static int checkDay(Scanner keyboard) {
        int day = 0;
        boolean wrongNumber = true;
        while (wrongNumber) {

            System.out.println("What day were you born on");
            day = keyboard.nextInt();
            if (day > 0 && day < 32) {
                wrongNumber = false;
            }
        }



        return day;

    }


    public static int checkMonth(Scanner keyboard) {
        int month = 0;
        boolean wrongNumber = true;
        while (wrongNumber) {

            System.out.println("What month were you born in");
            month = keyboard.nextInt();
            if (month > 0 && month < 13) {
                wrongNumber = false;

            }

        }

        return month;




    }

        public static int checkYear(Scanner keyboard){
        int year = 0;
        boolean wrongNumber = true;
        while (wrongNumber){

            System.out.println("What year were you born?");
            year = keyboard.nextInt();
            if (year > 0 && year < 2019){
                wrongNumber = false;
            }
        }
            return year;

        }

}












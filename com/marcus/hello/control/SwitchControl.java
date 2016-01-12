package com.marcus.hello.control;

/**
 * @author marcus
 */
public class SwitchControl {


    public static void main(String[] args) {

        System.out.println(convertMonthToString(2));
        System.out.println(convertMonthToString(14));


    }


    public static String convertMonthToString(int month) {

        String strMonth;
        switch (month) {
            default:
                strMonth = "Invalid month";
                break;

            case 1:
                strMonth = "januari";
                break;

            case 2:
                strMonth = "februari";


        }

        return strMonth;
    }

}

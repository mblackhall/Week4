package com.marcus.hello.apps;

/**
 * @author marcus
 */

class Parms {

    private double total;
    private String noStudentsAsString;

    double getTotal() {
        return total;
    }
    void setTotal(double total) {
        this.total = total;
    }

    String getNoStudentsAsString() {
        return noStudentsAsString;
    }
    void setNoStudentsAsString(String noStudentsAsString) {
        this.noStudentsAsString = noStudentsAsString;
    }

    Parms(double total, String noStudentsAsString) {
        this.total = total;
        this.noStudentsAsString = noStudentsAsString;
    }
}

public class ExceptionsOpdracht {

    private static final String CORRECT_RESULT = "Average score of (%5.2f,%s) is %5.2f\n";
    private static final String INVALID_RESULT = "Average score of (%5.2f,%s) resulted in a  %s\n";

    private double calcAverage(double total, String noStudentsAsStr) {

        // note better to use pattern matching first
        int noStudents = Integer.parseInt(noStudentsAsStr);

        // result of double / int is a double and it wont abend
        // therfore I have to do a trick first

        int check = 1 / noStudents;
        return total / noStudents;

    }


    private void testAverages() {

        Parms[] parms = new Parms[]{new Parms(90, "10"),
                new Parms(90, "0"),
                new Parms(90, "aaa")
        };

        for (Parms parm : parms) {

            try {

                double result = calcAverage(parm.getTotal(), parm.getNoStudentsAsString());
                System.out.format(CORRECT_RESULT, parm.getTotal(), parm.getNoStudentsAsString(), result);
            } catch (RuntimeException e) {
                System.out.printf(INVALID_RESULT, parm.getTotal(), parm.getNoStudentsAsString(), e.getClass().getSimpleName());
            }
        }

    }

    public static void main(String[] args) {
        new ExceptionsOpdracht().testAverages();

    }

}

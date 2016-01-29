package com.marcus.hello.apps;

/**
 * @author marcus
 */

class Parms {

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getNoStudentsAsString() {
        return noStudentsAsString;
    }

    public void setNoStudentsAsString(String noStudentsAsString) {
        this.noStudentsAsString = noStudentsAsString;
    }

    private double total;
    private String noStudentsAsString;

    Parms(double total,String noStudentsAsString ){
        this.total = total;
        this.noStudentsAsString = noStudentsAsString;
    }
}

public class ExceptionsOpdracht {


    private double calcAverage(double total,String noStudentsAsStr){

        int noStudents = Integer.parseInt(noStudentsAsStr);

        // result of double / int is a double and it wont abend
        // therfore I have to throw arithmetic exceptiom myself;

        if (noStudents == 0) {
            throw new ArithmeticException();
        }


        return total / noStudents;

    }


    private void testAverages(){

        Parms[] parms = new Parms[] {new Parms(90,"10"),
                                      new Parms(90,"0"),
                                       new Parms(90,"aaa")
        };

        for(Parms parm: parms ){

            try {

               double result = calcAverage(parm.getTotal(), parm.getNoStudentsAsString());
                System.out.println("Average score of " +
                        "(" + parm.getTotal() + "," + parm.getNoStudentsAsString() + ") is " + result );
            } catch (RuntimeException e ){
                System.out.println("Average score of " +
                        "(" + parm.getTotal() + "," + parm.getNoStudentsAsString() +
                        ") resulted in a " + e.getClass().getSimpleName() );


            }

        }

    }

    public static void main(String[] args) {
        new ExceptionsOpdracht().testAverages();

    }
}

package com.marcus.hello.generics;

import com.marcus.hello.model.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author marcus
 */
public class ExploreGenerics {

    interface Predicate<T>{

          boolean evaluate(T t);
    }


    class MyNumber <T extends Number > {

        Number number;

        MyNumber(Number t){
            this.number = t;
        }


    }

    public static <T>  void filterList(List<T> items,Predicate<T> predicate){

        if (items == null ||items.isEmpty()) return;

        Iterator<T> iterator = items.iterator();
        while (iterator.hasNext()){

            if (! predicate.evaluate(iterator.next())){
                iterator.remove();
            }
        }


    }

    public static void main(String[] args) {

        Predicate<Student> predicate = new Predicate<Student>() {
            @Override
            public boolean evaluate(Student student) {
                if (student.getName().startsWith("J")){
                    return true;
                }
                return false;
            }
        };

        List<Student> students = new ArrayList<Student>();
        students.add(new Student("Jbbb",34));
        students.add(new Student("vvvvJbbb",34));
        students.add(new Student("vvvvJbbb",34));
        students.add(new Student("blob",34));
        students.add(new Student("annie",34));

        filterList(students,predicate);

        for (Student s : students){
            System.out.println(s.getName());
        }


        ExploreGenerics eg = new ExploreGenerics();
        Integer myint = new Integer(5);
        eg.new MyNumber<Integer>(myint);

        MyNumber<Integer> t = eg.new MyNumber<>(myint);

        List<Integer> li = new ArrayList<>();
        short s = 5;
        li.add(5);  // autoboxing
        // li.add(s); // autoboxing only for class A Short is NOT an INTEGER
        // li.add (5.0); not allowed
        Integer i2 = 5;  // aotoboxing;
        int i3 = new Integer(7);  // autoboxing

        eg.getInt(6);  // autoboxing;
        eg.getInt(null);


    }

    void getInt(Integer integer){
        assert integer != null;

    }

    void checkNumber(List<? extends Number> numbers ){

        Iterator<? extends Number> nums = numbers.iterator();
        while (nums.hasNext()){
            nums.next().intValue();
        }



    }

}

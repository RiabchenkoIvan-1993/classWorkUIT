package com.company;

public class My<T extends Number> {
    T a[];

    double getAVG(){
         double sum=0;
        for (T o : a) {
            sum+=o.doubleValue();
        }
        return sum/a.length;
    }
    double avg(My<?> o){
         return this.getAVG()-o.getAVG();
    }



    public My(T[] a) {
        this.a = a;
    }

    String getType(){
        return a.getClass().getCanonicalName();
    }
}

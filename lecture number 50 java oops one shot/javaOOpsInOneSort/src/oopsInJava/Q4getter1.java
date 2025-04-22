package oopsInJava;

import javax.print.attribute.standard.MediaSize;

public  class Q4getter1 {
    String name;
    private int age;
    double percentage;

    // getter function of use to access the private value
    public int getAge(){
        return age;
    }
    // setter function of use to set the private variable of value
    public String setName(String n){
        this.name=n;
        return this.name;
    }
}

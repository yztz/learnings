package top.yzzblog.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Demo {
    private int a;
    Demo(int a){
        this.a = a;
    }

    public void say(){
        //System.out.println(a);
    }
    public static void main(String [] args) {
        Demo demo = new Demo(3);
    }
}


class Father {
    int a = 0;

    public Father(){
        ;
    }

    private int b = 1;
    public void getB(){}

}

class Son extends Father {
    private int a = 1;

    public Son(){
        ;
    }

    private void getA(){
        System.out.println(a);
    }
}


/*class Employ {
    private String name;
    private int age;


    public Employ(){
        this.name = "yzz";
        this.age = 20;
    }

    public Employ(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge(){
        return age;
    }
}*/

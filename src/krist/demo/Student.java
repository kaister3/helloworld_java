package krist.demo;

public class Student {
    int age;
    public Student(String name){
        //构造器->即构造方法，与类名相同
        //一个类可以有多个构造方法
        System.out.println("My name is " + name);
    }
    public static void main(){
        Student me = new Student("NMSL");
    }
}

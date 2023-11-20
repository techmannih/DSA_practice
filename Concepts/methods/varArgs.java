package Concepts.methods;

public class varArgs {
    
    public static void main(String[] args) {
//
       multiple("manni",2, 3, "Kunal", "Rahul", "dvytsbhusc");
    }

    static void multiple(String name ,int a, int b, String ...v) {
        System.out.println(name);
        System.out.println(a);
        System.out.println(b);
        System.out.println(v);

    }
}
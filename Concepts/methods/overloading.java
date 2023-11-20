package Concepts.methods;

public class overloading {

    static int sum(int a,int b){
    return a+b;
    }
    static int sum(int a,int b,int c){
    return a+b+c;
    }
    
    public static void main (String[] args){
        int ans = sum(2,3,4);
        System.out.print(ans);

    }
    
}

//5. (The MyInteger class) Design a class named MyInteger. The class contains:
//• An int data field named value that stores the int value represented by this
//object.
//• A constructor that creates a MyInteger object for the specified int value. A
//getter method that returns the int value.
//• The methods isEven(), isOdd(), and isPrime() that return true if the value in
//this object is even, odd, or prime, respectively.
//• The static methods isEven(int), isOdd(int), and isPrime(int) that return true if
//the specified value is even, odd, or prime, respectively.
//• The static methods isEven(MyInteger), isOdd(MyInteger), and
//isPrime(MyInteger) that return true if the specified value is even, odd, or
//prime, respectively.
//• The methods equals(int) and equals(MyInteger) that return true if the value
//in this object is equal to the specified value.
//• Draw the UML diagram for the class and then implement the class. Write
//a client program that tests all methods in the class.

public class MyInteger {
    int value;

    public MyInteger(int value) {
        this.value = value;
    }
    boolean isEven(){
        if(value==1) return false;
        if (value%2==0) return true;
        return false;
    }
    boolean isOdd(){
        return !isEven();
    }
    boolean isPrime(){
       // boolean flag = true;
        if(value==0 || value == 1) return false;
        for (int i=2;i<value;i++){
            if(value%i==0) return false;
        }
        return true;
    }
    static public boolean isEven(int x){
        if(x==1) return false;
        if (x%2==0) return true;
        return false;
    }
    static public boolean isOdd(int x){
        return !isEven(x);
    }
    static public boolean isPrime(int x){
        if(x==0 || x == 1) return false;
        for (int i=2;i<x;i++){
            if(x%i==0) return false;
        }
        return true;
    }
    static public boolean isEven( MyInteger x){
        if(x.value==1) return false;
        if (x.value%2==0) return true;
        return false;
    }
    static public boolean isOdd(MyInteger x){
        return !isEven(x);
    }
    static public boolean isPrime( MyInteger x ){
        return isPrime(x.value);
    }
     boolean equals(int x ){
        if(x==value) return true;
        return false;
    }
    boolean equals(MyInteger x){
        if(x.value==value) return true;
        return false;
    }
    @Override public String toString(){
        return ""+value;
    }
}

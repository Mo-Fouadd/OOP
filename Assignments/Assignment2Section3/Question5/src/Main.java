public class Main {
    public static void main(String[] args) {
        MyInteger[] a = new MyInteger[5];
        int[] e ={6,7};
        int[] m ={6,7};
        MyInteger n1 = new MyInteger(4);
        MyInteger n2 = new MyInteger(5);
        MyInteger n3 = new MyInteger(4);
        for(int i=0;i<5;i++){
            a[i]=new MyInteger(i);
            System.out.println(a[i]+" is even " + a[i].isEven());
            System.out.println(a[i]+ " is odd "+ a[i].isOdd());
            System.out.println(a[i]+ " is prime "+ a[i].isPrime());
        }


        for(int i=0;i<2;i++){
            System.out.println(e[i]+" isEven(int) "+MyInteger.isEven(e[i]));
            System.out.println(e[i]+" isOdd(int) "+MyInteger.isOdd(e[i]));
            System.out.println(e[i]+" isPrime(int) "+MyInteger.isPrime(e[i]));
            System.out.println(m[i] + " is even(MyInteger) " +MyInteger.isPrime(m[i]));
            System.out.println(m[i] + " is odd(MyInteger) " +MyInteger.isPrime(m[i]));
            System.out.println(m[i] + " is prime(MyInteger) "+MyInteger.isPrime(m[i]) );
        }
        System.out.println(" false equals(int) " + n1.equals(3));
        System.out.println(" true equals(int) "+ n1.equals(4));
        System.out.println(" false equals(MyInteger) " + n1.equals(n2));
        System.out.println(" true equals(MyInteger) "+ n1.equals(n3));
        //• The methods equals(int) and equals(MyInteger) that return true if the value
        //in this object is equal to the specified value.
        //• Draw the UML diagram for the class and then implement the class. Write
        //a client program that tests all methods in the class.

    }
}
/*import java.util.*;
class Swap{
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
       System.out.println("value of a "+a);
       System.out.println("value of b "+b); 
        int temp = a;
        a = b;
        b = temp;
    System.out.println("value of a "+ a);
    System.out.println("value of b "+b);
    }
}*/

/*class Swap{
    public static void main(String[] args) {
        int a = 22;
        int b = 56;
         
        System.out.println("value of a "+ a);
        System.out.println("value of b "+b);
        a = a -b;
        b = a + b;
        a = b -a;
        
        System.out.println("value of a "+ a);
        System.out.println("value of b "+b);
        
    }
}*/

/*class Swap {
    public static void main(String[] args) {
        int a = 22;
        int b = 56;
       
        System.out.println("value of a "+ a);
        System.out.println("value of b "+b);
        a = a ^b;
        b = a ^ b;
        a = a^b;
        
        System.out.println("value of a "+ a);
        System.out.println("value of b "+b);
        
    }
}*/

class Swap{
    public static void main(String[] args) {
        int a = 11;
        int b = 22;

        System.out.println("Value of a : "+ a);
        System.out.println("Value of b :" + b );

        a = a*b;
        b = a/b;
        a = a/b;

        System.out.println("value of a "+ a);
        System.out.println("value of b "+b);
    }
}
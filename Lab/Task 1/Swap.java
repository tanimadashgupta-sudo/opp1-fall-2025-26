public class Swap {
    public static void main(String[] args) {
        int a = 12;
        int b=10;
        System.out.println( "Before swap : "+ a+"  "+ b );
        
         a  = a-b;
         b = a+b;
         a = b-a;
        
        
        System.out.println("After swap : "+ a+"  " + b);
    }
    
}

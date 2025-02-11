  class Interface1 {
 
     public void  fun(int a, String s){
        System.out.println("Value of a is "+a+" and value of s is "+s);

     }
    
 } 
 class aa extends Interface1{
      public void fun(int a, String s){
          System.out.println("Value of a is "+a+" and value of s is "+s);
      }
 }

public class Interface {
public static void main(String[] args) {
    aa i = new aa();
    i.fun(10, "Hello");
    System.out.println("Hello");
// fact(4);
}
 static void fact(int n){
    System.out.println("Hello dssgsrthyhgserfds");

}
    
}

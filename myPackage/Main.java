package myPackage;

import java.util.function.Function;
// import java.util.stream.Gatherer.Integrator;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
    //     Class2 c = new Class2();
        
    //     System.out.println("sdgf"+55);
    // c.a();

// ****1** 
// Inter1 i=()->{
//     System.out.println("Hello, i have successfully implemented thatt abstract func using lambda func");
//     // now what if that interface has more than one abstract func then we can't use lambda func ,so we have to use anonymous class for that
// };

// i.display();
// *************1




// ***************2
// now we will do the same thing using anonymous class

// Inter1 inter=new Inter1(){
// public void display1(){
//     System.out.println("Hello, i have successfully implemented thatt abstract func1 using anonymous class");
// };
// public void display2(){
//     System.out.println("Hello, i have successfully implemented thatt abstract func using anonymous class");
// };

// };
// inter.display1();
// ***************2



// *************************3
// just predicate interface dekhnege hm yha
// ye bs chck krta h ki kya ye true h ya false
// Predicate <Integer> p=(a)->{
//     if(a>10){
//         return true;
//     }
//     else{
//         return false;
//     }
// };

// Function Interface dekhnege hm yha



// apply fucntion se aap kuch b l skte h or kuch b return krwa skte ho , phla input hoga or dusra output
Function <String,String> fun1=(s)->{
return s.substring(0,3);

};
// Function <String,Integer> fun2=s->s.length();//to make r fucn understandable i m changinig its parameter
Function <String,String>fun2=s1->{
    return s1.substring(0, 4);
};

// System.out.println(fun1.apply("Hello"));

// System.out.println(fun2.apply("Hello"));

// ***********************3

 Function <Integer,Integer> fun3=(s)->{
    return s*2;
    
    };
    Function <Integer,Integer> fun4=s->s*s*s; 
    // Function <Integer> fun5=fun3.andThen(fun4).apply(4);
    System.out.println(fun3.andThen(fun4).apply(4));

// Consumer interface kuch letA H PR RETURN KRTA  nhi h kuch b 
// supplier interface leta kuch ni h pr return kuch krta h 

};
}

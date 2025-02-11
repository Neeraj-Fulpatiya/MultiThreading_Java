import java.util.*;
//   class String {
   

//     // public class Main {
//     //     public static void main(String[] args) {
//                         // ["", "Java", "Programming", ""]
//      }
    
    
    public class string {
        public static void main(String[] args) {
    //         StringBuffer sb = new StringBuffer("Hello");
    
    //         sb.append(" World");          // "Hello World"
    //         sb.insert(5, " Java");        // "Hello Java World"
    //         sb.replace(6, 10, "C++");     // "Hello C++ World"
    //         sb.delete(5, 9);              // "Hello World"
    //         sb.reverse();                 // "dlroW olleH"
    
    //         System.out.println(sb);
    String s = " Java Programming ";
            
            System.out.println(s.length());             // 18
            System.out.println(s.charAt(5));            // 'P'
            System.out.println(s.toLowerCase());        // " java programming "
            System.out.println(s.toUpperCase());        // " JAVA PROGRAMMING "
            System.out.println(s.trim());               // "Java Programming"
            System.out.println(s.substring(5, 11));     // "Progra"
            System.out.println(s.concat(" is fun!"));   // " Java Programming is fun!"
            System.out.println(s.equals(" Java Programming ")); // true
            System.out.println(s.equalsIgnoreCase(" java programming ")); // true
            System.out.println(s.contains("Pro"));      // true
            System.out.println(s.replace('a', 'x'));    // " Jxvx Progrxmming "
            System.out.println(s.indexOf('P'));         // 5
            String[] words = s.split(" ");  
        }
    }
    


}

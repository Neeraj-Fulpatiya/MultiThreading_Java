// public class Main {
//     public static void main(String[] args) {
//         int[] arr = {10, 20, 30, 40, 50};
//         int target = 40;  // Element to search for
//         boolean found = false;
        
//         // Linear search
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == target) {
//                 found = true;
//                 break;
//             }
//         }
        
//         // Output result
//         if (found) {
//             System.out.println("Element " + target + " found in the array.");
//         } else {
//             System.out.println("Element " + target + " not found in the array.");
//         }
//     }
// }
class Student {
      String name; // Private variable (Encapsulation)

    // Setter method to assign value
      void setName(String name) {
        this.name = name;
    }

    // Getter method to retrieve value
    public String getName() {
        return name;
    }

      public static  void main(String[] args) {
        Student obj = new Student();
        obj.setName("Neeraj");
        System.out.println("Student Name:nmbbj mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm" + obj.getName());
    }
}

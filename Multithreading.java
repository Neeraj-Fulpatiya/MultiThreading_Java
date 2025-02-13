
 
// public class Main extends Thread{
//    //we can also chng thread name by using its constructor ,
//   public void run(){
//   for(int i=0;i<5;i++){
//     System.out.println(i);
    
//     try {//try catch k ansd rh eara h sleep ,sleep use lrte kyoki hme hread ko rokna tha
//       Thread.sleep(2000);//ye curretn thread k executionn ko suspend kr deta h given mili sec k lie
//     } catch (InterruptedException e) {
//        e.printStackTrace();
//     }
//   }
//   System.out.println(Thread.currentThread().getName());// gives curr thread name
//   }
//     public static void main(String[] args) {
//         // System.out.println("Hello World");
//         Main t1=new Main();
//         t1.start();
//         // we also have fun like setprioroity 
        
//   //  yield() ;//ye current thread ko suspend kr deta h aur dusre thread ko chance deta h
//       }
// }



// class MyRunnable implements Runnable {
//   public void run() {
//       for (int i = 1; i <= 5; i++) {
//           System.out.println(Thread.currentThread().getName() + " - Count: " + i);
//           try {
//               Thread.sleep(3500); // Pause for 500ms
//           } catch (InterruptedException e) {
//               System.out.println(e);
//           }
//       }
//   }
// }

// public class nn {
//   public static void main(String[] args) {
//       Thread t1 = new Thread(new MyRunnable(), "Thread-1");
//       Thread t2 = new Thread(new MyRunnable(), "Thread-2");

//       t1.start();
//       t2.start();
//   }
// }


// class FileDownloader implements Runnable {
//     private String fileName;

//     public FileDownloader(String fileName) {
//         this.fileName = fileName;
//     }

//     public void run() {
//         System.out.println("Downloading: " + fileName + " - " + Thread.currentThread().getName());
//         try {
//             Thread.sleep(3000); // Simulating 2 seconds download time
//         } catch (InterruptedException e) {
//             System.out.println(e);
//         }
//         System.out.println("Completed: " + fileName + " - " + Thread.currentThread().getName());
//     }
// }

// public class Multithreading {
//     public static void main(String[] args) {
//         Thread t1 = new Thread(new FileDownloader("File1.pdf"));
//         Thread t2 = new Thread(new FileDownloader("File2.pdf"));
//         Thread t3 = new Thread(new FileDownloader("File3.pdf"));

//         t1.start();
//         t2.start();
//         t3.start();
//     }
// }
// o/p:
// Downloading: File2.pdf - Thread-1
// Downloading: File1.pdf - Thread-0
// Downloading: File3.pdf - Thread-2
// Completed: File3.pdf - Thread-2
// Completed: File1.pdf - Thread-0
// Completed: File2.pdf - Thread-1


// class Counter {
//     private int count = 0;

//     public synchronized void increment() {  // Only one thread can access this method at a time
//         count++;
//     }

//     public int getCount() {
//         return count;
//     }
// }

// public class  Multithreading{
//     public static void main(String[] args) {
//         Counter counter = new Counter();

//         // Creating two threads that increment the counter
//         Thread t1 = new Thread(() -> {
//             for (int i = 0; i < 1000; i++) counter.increment();
//         });

//         Thread t2 = new Thread(() -> {
//             for (int i = 0; i < 1000; i++) counter.increment();
//         });

//         t1.start();
//         t2.start();

//         try {
//             t1.join();
//             t2.join();
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }

//         System.out.println("Final Count: " + counter.getCount()); // Expected output: 2000
//     }
// }


public class Multithreading {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {//we are making run function Using lambda expression
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread-1: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread-2: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
// yield();//ye current thread ko suspend kr deta h aur dusre thread ko chance deta h
        t1.start();
 // t1.join(); // Wait for t1 to finish  . THEN only t2 strt
        // try {
        //     Thread.sleep(10);
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }
        t2.start();

    }
}
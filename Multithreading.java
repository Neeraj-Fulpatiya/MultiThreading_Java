
 
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
//               Thread.sleep(1500); // Pause for 500ms
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


class FileDownloader implements Runnable {
    private String fileName;

    public FileDownloader(String fileName) {
        this.fileName = fileName;
    }

    public void run() {
        System.out.println("Downloading: " + fileName + " - " + Thread.currentThread().getName());
        try {
            Thread.sleep(2000); // Simulating 2 seconds download time
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Completed: " + fileName + " - " + Thread.currentThread().getName());
    }
}

public class Multithreading {
    public static void main(String[] args) {
        Thread t1 = new Thread(new FileDownloader("File1.pdf"));
        Thread t2 = new Thread(new FileDownloader("File2.pdf"));
        Thread t3 = new Thread(new FileDownloader("File3.pdf"));

        t1.start();
        t2.start();
        t3.start();
    }
}

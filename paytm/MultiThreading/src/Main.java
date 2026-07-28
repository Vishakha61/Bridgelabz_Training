//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Thread1 t1=new Thread1();
        Thread2 t2=new Thread2();
        Thread th=new Thread(t2);

//        try {
//            t1.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }


        t1.start();
        th.start();
        if(t1.isAlive()){
            t1.setDaemon(true);
        }

       else{
           th.setDaemon(true);
        }
        }

}


//Garbage Collector is also a thread
//SO we have 4 threads in this program- main thread, t1,t2, garbage collector
//yield- im releasing cpu and giving other threads chance to work.
// pc register and stack memory is not shared by threads.
//stack mem is not shared because every thread has its own separate path of execution.
//why stack memory is used for threads execution : because we need to maintain recursion order(LIFO)

//topics: daemon thread - thread for which jvm doesnot wait to stop a program.
//setDaemon is the method to make method daemon.

//How thread shd be closed?
//1.gracefully
//2.forecfully- we shd not forefully close the thread as data inconsistency may occur and can cause memory leaks.
//for operating system memeory leaks occurs.
//deadlock may occur.
//Example of Deadlock in Programming: do threads hai dono ko ek dusre ki resource chahiye and both are waitint for each other
// to release the resoruce.
//synchronized keyword - can be used with both block and method.






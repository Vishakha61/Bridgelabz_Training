public class Thread1 extends Thread{

    @Override
    public void run(){

        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + " ");


        }

    }
}

public class TimerThread extends Thread {
    int sec;
    TimerThread(int sec) {
        this.sec = sec;
    }
    public void run(){
        for (int i = sec; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Відлік закінчено");
    }
}

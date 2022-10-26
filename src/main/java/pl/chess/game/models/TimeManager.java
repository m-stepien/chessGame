package pl.chess.game.models;

import pl.chess.game.models.Timer;

public class TimeManager extends Thread{
    public static void countTime(Timer timer1, Timer timer2){
        Thread thread1 = new Thread(timer1);
        thread1.setDaemon(true);
        thread1.setName("Timer 1");
        thread1.start();
        Thread thread2 = new Thread(timer2);
        thread2.setDaemon(true);
        thread2.setName("Timer 2");
        try {
            thread1.join();
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
        thread2.start();
        try {
            thread2.join();
        }catch(InterruptedException e) {
            e.printStackTrace();
    }
}
}

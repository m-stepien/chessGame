package pl.chess.game.models;

import java.util.ArrayList;

public class Timer implements Runnable{
    private Integer day;
    private Integer hour;
    private Integer minute;
    private Integer second;

    public Timer(int second) {
        this.second = second;
    }

    public Timer(int minute, int second) {
        this.minute = minute;
        this.second = second;
    }

    public Timer(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Timer(int day, int hour, int minute, int second) {
        this.day = day;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public ArrayList<Integer> getTime(){
        ArrayList<Integer> time=new ArrayList<>();
        if(this.day!=null){
            time.add(this.day);
        }
        if(this.hour!=null){
            time.add(this.hour);
        }
        if(this.minute!=null){
            time.add(this.minute);
        }
        if(this.second!=null){
            time.add(this.second);
        }
        return time;
    }
    public void countTime() {
        try {
            Thread.sleep(1000);
            this.second--;
            if(this.second.intValue()<0){
                minute--;
                this.second=59;
            }
            if(this.minute.intValue()<0){
                this.hour--;
                this.minute=59;
            }
            if(this.day.intValue()<0){
                this.day--;
                this.hour=24;
            }

            System.out.println("Time "+this.getTime().get(2)+"  "+this.getTime().get(3));
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
    boolean isTimeRemind(){
        boolean timeRemind=false;
        for(Integer t:this.getTime()){
            if(t!=0){
                timeRemind=true;
            }
        }
        return timeRemind;
    }


    @Override
    public void run() {
        while(this.isTimeRemind()){
            this.countTime();

        }
    }

}

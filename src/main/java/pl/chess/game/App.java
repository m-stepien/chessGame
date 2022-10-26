package pl.chess.game;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import pl.chess.game.models.TimeManager;
import pl.chess.game.models.Timer;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        Timer t1 = new Timer(0,0,1,5);
        Timer t2 = new Timer(0,0,0,40);;
        TimeManager.countTime(t1,t2);
        SpringApplication.run(App.class, args);
        }
}

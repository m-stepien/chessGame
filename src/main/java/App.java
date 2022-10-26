import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
<<<<<<< Updated upstream:src/main/java/App.java
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
=======
import pl.chess.game.models.TimeManager;
import pl.chess.game.models.Timer;

>>>>>>> Stashed changes:src/main/java/pl/chess/game/App.java
@SpringBootApplication
@RestController
public class App {
    public static void main(String[] args) {
        Timer t1 = new Timer(0,0,1,5);
        Timer t2 = new Timer(0,0,0,40);;
        TimeManager.countTime(t1,t2);
        SpringApplication.run(App.class, args);
        }

}

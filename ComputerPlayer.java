<<<<<<< HEAD
import java.util.Random;

public class ComputerPlayer extends Player {

    ComputerPlayer(int numberOfPlayer) {
        selectPlayerMark(numberOfPlayer);
        setPlayerName("COMPUTER " + numberOfPlayer);
    }

    @Override
    public int getHit() {
        Random r = new Random();
        return r.nextInt(7);
    }
=======
import java.util.Random;

public class ComputerPlayer extends Player {

    public ComputerPlayer(int numberOfPlayer) {
        selectPlayerMark(numberOfPlayer);
        setPlayerName("COMPUTER " + numberOfPlayer);
    }

    @Override
    public int getHit() {
        Random r = new Random();
        return r.nextInt(7);
    }
>>>>>>> 0e8fc75a7491f1a0e2eb44a61009e0f2cc84d18c
}
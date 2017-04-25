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
}
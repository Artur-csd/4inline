import java.util.Random;

public class ComputerPlayer extends Player {

    public ComputerPlayer(int num) {
        setPlayerName("COMPUTER " + num);
        if(num == 1){
            setMark(Mark.X);
        } else{
            setMark(Mark.O);
        }
    }

    @Override
    public int getHit() {

        Random r = new Random();

        return r.nextInt(7);
    }

}
import java.util.Scanner;


public class HumanPlayer extends Player{

    private  Scanner scanner = new Scanner(System.in);

    public HumanPlayer(int numberOfPlayer) {
        if (numberOfPlayer == 2) {
            setMark(Mark.O);
        } else {
            setMark(Mark.X);
        }


        System.out.println(Messenger.ENTER_PLAYER_NAME +" "+ numberOfPlayer +":");
        setPlayerName(scanner.nextLine());

    }

    @Override
    public int getHit() {
        Integer move = 0;
        boolean validMove = false;

        while (!validMove) {
            try {
                TurmMessage();
                move = Integer.parseInt(scanner.nextLine());

                if ((move >= 1) && (move <= 7)) {

                    validMove = true;

                } else {

                    System.out.println(Messenger.SET_VALID_NUM);
                }

            } catch (Exception e) {
                System.out.println(Messenger.SET_VALID_NUM);
            }
        }

        return move-1;
    }





}

import java.util.Scanner;

public class Game {

    private Player player1;
    private Player player2;
    public Player currentPlayer;
    public Board board;


    Game() {
        board = new Board();
        displayMsg(Messenger.CREATE_PLAYER_ONE);
        player1 = createPlayer(1);
        displayMsg(Messenger.CREATE_PLAYER_TWO);
        player2 = createPlayer(2);
        currentPlayer = player1;
    }

    public void start(){
        board.display();
        Boolean winner = false;
        while ( board.checkBord() && !winner ){

            board.setHitMark(currentPlayer.getMark());
            int hit = currentPlayer.getHit();
            if( board.checkHit(hit) ){
                board.updateBoard();
                if(board.checkWinner()){
                    winner = true;
                }
                else{
                    changeTurn();
                }
            }
            else{
                displayMsg(board.messege);
            }
            board.display();
        }
        if(winner){
            System.out.print(currentPlayer.getPlayerName());
            displayMsg(Messenger.WINNER);
        }
        else{
            displayMsg(Messenger.FULL_BOARD);
        }

    }

    private void changeTurn(){
        if(currentPlayer == player1){
            currentPlayer =  player2;
        }
        else{
            currentPlayer =  player1;
        }
    }

    private Player createPlayer(int playerNum) {
        return getPlayerType(playerNum);
    }

    private Player getPlayerType(int playerNum) {
        boolean check = false;
        Scanner scanner = new Scanner(System.in);
        String number = "";
        while(!check){
            number =  scanner.nextLine();
            if(number.equals("1") || number.equals("2")){
               check = true;
            }
            else{
                displayMsg(Messenger.INVALID_PLAYER_NUM);
            }
        }

        Player player = (number.equals("1"))?new HumanPlayer(playerNum):new ComputerPlayer(playerNum);

        return player;
    }

    public void displayMsg(Messenger msg){
        System.out.print(msg);
    }
}
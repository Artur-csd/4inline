<<<<<<< HEAD
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class HumanPlayer extends Player{

    private  Scanner scanner = new Scanner(System.in);

    HumanPlayer(int numberOfPlayer) {
        selectPlayerMark(numberOfPlayer);
        System.out.println(Messege.ENTER_PLAYER_NAME +" "+ numberOfPlayer +":");
        setPlayerName(scanner.nextLine());
    }

    @Override
    public int getHit() {
        boolean check = false;
        Scanner scanner = new Scanner(System.in);
        int number = 1;
        while(!check){
            String input = scanner.nextLine();
            Pattern p = Pattern.compile("^[1-7]$");
            Matcher m = p.matcher(input);
            if(m.matches()){
             number =  Integer.parseInt(input);
                check = true;
            }
            else{
                System.out.println(Messege.SET_VALID_NUM);
            }
        }
        return number-1;
    }
}
=======
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class HumanPlayer extends Player{

    private  Scanner scanner = new Scanner(System.in);

    public HumanPlayer(int numberOfPlayer) {
        selectPlayerMark(numberOfPlayer);
        System.out.println(Messege.ENTER_PLAYER_NAME +" "+ numberOfPlayer +":");
        setPlayerName(scanner.nextLine());
    }

    @Override
    public int getHit() {
        boolean check = false;
        Scanner scanner = new Scanner(System.in);
        int number = 1;
        while(!check){
            String input = scanner.nextLine();
            Pattern p = Pattern.compile("^[1-7]{1}");
            Matcher m = p.matcher(input);
            if(m.matches()){
             number =  Integer.parseInt(input);
                check = true;
            }
            else{
                System.out.println(Messege.SET_VALID_NUM);
            }
        }
        return number-1;
    }
}
>>>>>>> 0e8fc75a7491f1a0e2eb44a61009e0f2cc84d18c

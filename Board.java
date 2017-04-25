<<<<<<< HEAD
public class Board {

    private static final int HEIGHT = 6;
    private static final int WIDTH = 7;
    private  static  final int SLOTS_TO_WIN = 4;
    public Messege messege = Messege.NO_MSG;
    private Mark[][] boardArr = new Mark[HEIGHT][WIDTH];

    Board() {
        for(int iHeight=0; iHeight<HEIGHT; iHeight++)
        {
            for(int iWidth=0; iWidth<WIDTH; iWidth++){
                boardArr[iHeight][iWidth] =  Mark.EMPTY;
            }
        }
    }

    public void display(){
        numRow();
        for(int iHeight = (HEIGHT-1); iHeight >=0; iHeight--){
            for(int iWidth = 0; iWidth < WIDTH; iWidth++){
                System.out.print(" " + boardArr[iHeight][iWidth] + " ");
            }
            System.out.println();
        }
    }

    public Boolean checkHit(int hit){
        return checkRow(getRow(hit));
    }


    private boolean checkRow(int row) {
        if(row < HEIGHT){
            return true;
        }
        else{
            this.messege = Messege.COLUMN_NO_SLOT;
            return false;
        }
    }

    private int getRow(int hit){
        for(int i=0; i< HEIGHT; i++){
            if(this.boardArr[i][hit] == Mark.EMPTY){
                return i;
            }
        }
        return HEIGHT;
    }

    public void updateBoard(Mark mark, int hit){
        this.boardArr[getRow(hit)][hit] = mark;
    }

    public boolean checkBord() {
        for(int iHeight=0; iHeight<HEIGHT; iHeight++)
        {
            for(int iWidth=0; iWidth<WIDTH; iWidth++){
                if(boardArr[iHeight][iWidth] == Mark.EMPTY){
                    return true;
                }
            }
        }
        return false;
    }

    public Boolean checkWinner(Mark mark,int hit){
        if( checkHorizontal(mark, hit) || checkVertical(mark, hit) || checkDiagonalUp(mark, hit) || checkDiagonalDown(mark, hit)){
            return true;
        }
        else {return false;}
    }

    private Boolean checkHorizontal(Mark mark,int hitX){
        int count = 0;
        int hitY = getRow(hitX)-1;
        for(int iWidth=0; iWidth<WIDTH; iWidth++){
            count = boardArr[hitY][iWidth]==mark ? ++count : 0;
            if (count == SLOTS_TO_WIN){
                return true;
            }
        }
        return false;
    }

    private Boolean checkVertical(Mark mark, int hitX){
        int count = 0;
        for(int iHeight=0; iHeight<HEIGHT; iHeight++){
            count = (boardArr[iHeight][hitX] == mark) ? ++count : 0;
            if (count == SLOTS_TO_WIN){
                return true;
            }
        }
        return false;
    }

    private Boolean checkDiagonalUp(Mark mark, int hitX){
        int xStart;
        int yStart;
        int times;
        int hitY = getRow(hitX)-1;
        if(hitX > hitY){
            xStart = hitX - hitY;
            yStart = 0;
            times = WIDTH - xStart;
        }
        else{
            xStart = 0;
            yStart = getRow(hitX)-1 - hitX ;
            times = HEIGHT - yStart;
        }
        int count = 0;

        for(int i=0; i<times; i++){
            count = (boardArr[yStart+i][xStart+i] == mark) ? ++count : 0;
            if (count == SLOTS_TO_WIN){
                return true;
            }
        }
        return false;
    }

    private Boolean checkDiagonalDown(Mark mark, int hitX){
        int xStart;
        int yStart = hitX + getRow(hitX)-1;
        int times;
        if(yStart >= HEIGHT){
            xStart = yStart - (HEIGHT-1);
            yStart = HEIGHT-1;
            times = WIDTH - xStart;
        }
        else{
            xStart = 0;
            times = yStart+1;
        }
        int count = 0;

        for(int i=0; i<times; i++){
            count = (boardArr[yStart-i][xStart+i] == mark) ? ++count : 0;
            if (count == SLOTS_TO_WIN){
                return true;
            }
        }
        return false;
    }

    private void numRow(){
        System.out.println("\n");
        for(int i=0; i<WIDTH; i++){
            System.out.print(" " + (i + 1) + " ");
        }
        System.out.println("\n");
    }

=======
public class Board {

    private static final int HEIGHT = 6;
    private static final int WIDTH = 7;
    private  static  final int SLOTS_TO_WIN = 4;
    public Messege messege = Messege.NO_MSG;
    public Mark[][] boardArr = new Mark[HEIGHT][WIDTH];

    Board() {
        for(int iHeight=0; iHeight<HEIGHT; iHeight++)
        {
            for(int iWidth=0; iWidth<WIDTH; iWidth++){
                boardArr[iHeight][iWidth] =  Mark.EMPTY;
            }
        }
    }

    public void display(){
        NumRow();
        for(int iHeight = (HEIGHT-1); iHeight >=0; iHeight--){
            for(int iWidth = 0; iWidth < WIDTH; iWidth++){
                System.out.print(" " + boardArr[iHeight][iWidth] + " ");
            }
            System.out.println();
        }
    }

    public Boolean checkHit(int hit){
        return checkRow(getRow(hit));
    }


    private boolean checkRow(int row) {
        if(row < HEIGHT){
            return true;
        }
        else{
            this.messege = Messege.COLUMN_NO_SLOT;
            return false;
        }
    }

    private int getRow(int hit){
        for(int i=0; i< HEIGHT; i++){
            if(this.boardArr[i][hit] == Mark.EMPTY){
                return i;
            }
        }
        return HEIGHT;
    }

    public void updateBoard(Mark mark, int hit){
        this.boardArr[getRow(hit)][hit] = mark;
    }

    public boolean checkBord() {
        for(int iHeight=0; iHeight<HEIGHT; iHeight++)
        {
            for(int iWidth=0; iWidth<WIDTH; iWidth++){
                if(boardArr[iHeight][iWidth] == Mark.EMPTY){
                    return true;
                }
            }
        }
        return false;
    }

    public Boolean checkWinner(Mark mark,int hit){
        if( checkHorizontal(mark, hit) || checkVertical(mark, hit) || checkDiagonalUp(mark, hit) || checkDiagonalDown(mark, hit)){
            return true;
        }
        else {return false;}
    }

    private Boolean checkHorizontal(Mark mark,int hitX){
        int count = 0;
        int hitY = getRow(hitX)-1;
        for(int iWidth=0; iWidth<WIDTH; iWidth++){
            count = boardArr[hitY][iWidth]==mark ? ++count : 0;
            if (count == SLOTS_TO_WIN){
                return true;
            }
        }
        return false;
    }

    private Boolean checkVertical(Mark mark, int hitX){
        int count = 0;
        for(int iHeight=0; iHeight<HEIGHT; iHeight++){
            count = (boardArr[iHeight][hitX] == mark) ? ++count : 0;
            if (count == SLOTS_TO_WIN){
                return true;
            }
        }
        return false;
    }

    private Boolean checkDiagonalUp(Mark mark, int hitX){
        int xStart;
        int yStart;
        int times;
        int hitY = getRow(hitX)-1;
        if(hitX > hitY){
            xStart = hitX - hitY;
            yStart = 0;
            times = WIDTH - xStart;
        }
        else{
            xStart = 0;
            yStart = getRow(hitX)-1 - hitX ;
            times = HEIGHT - yStart;
        }
        int count = 0;

        for(int i=0; i<times; i++){
            count = (boardArr[yStart+i][xStart+i] == mark) ? ++count : 0;
            if (count == SLOTS_TO_WIN){
                return true;
            }
        }
        return false;
    }

    private Boolean checkDiagonalDown(Mark mark, int hitX){
        int xStart;
        int yStart = hitX + getRow(hitX)-1;
        int times;
        if(yStart >= HEIGHT){
            xStart = yStart - (HEIGHT-1);
            yStart = HEIGHT-1;
            times = WIDTH - xStart;
        }
        else{
            xStart = 0;
            times = yStart+1;
        }
        int count = 0;

        for(int i=0; i<times; i++){
            count = (boardArr[yStart-i][xStart+i] == mark) ? ++count : 0;
            if (count == SLOTS_TO_WIN){
                return true;
            }
        }
        return false;
    }

    private void NumRow(){
        System.out.println("\n");
        for(int i=0; i<WIDTH; i++){
            System.out.print(" " + (i + 1) + " ");
        }
        System.out.println("\n");
    }

>>>>>>> 0e8fc75a7491f1a0e2eb44a61009e0f2cc84d18c
}
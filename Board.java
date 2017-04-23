public class Board {

    private static final int HEIGHT = 6;
    private static final int WIDTH = 7;
    private  static  final int SLOTS_TO_WIN = 4;
    private int hitX = 0;
    private int hitY = 0;
    public Messenger messege = Messenger.NO_MSG;
    private Mark hitMark = Mark.EMPTY;

    public Mark[][] boardArr = new Mark[HEIGHT][WIDTH];


    Board() {
        for(int iHeight=0; iHeight<HEIGHT; iHeight++)
        {
            for(int iWidth=0; iWidth<WIDTH; iWidth++){
                boardArr[iHeight][iWidth] =  hitMark;
            }
        }
    }


    public void setHitMark(Mark hitMark) {
        this.hitMark = hitMark;
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
        return checkCol(hit) && checkRow(getRow(hit));
    }


    private Boolean checkCol(int hit){
        if(hit >= 0 && hit < WIDTH){
            hitX = hit;
            return true;
        }
        else{
            this.messege = Messenger.FROM_ONE_TO_SEVEN;
            return false;
        }
    }


    private boolean checkRow(int row) {
        if(row < HEIGHT){
            hitY = row;
            return true;
        }
        else{
            this.messege = Messenger.COLUMN_NO_SLOT;
            return false;
        }
    }


    private int getRow(int instNum){
        for(int i=0; i< HEIGHT; i++){
            if(this.boardArr[i][instNum] == Mark.EMPTY){
                return i;
            }
        }
        return HEIGHT;
    }


    public void updateBoard(){
        this.boardArr[hitY][hitX] = hitMark;
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

    public Boolean checkWinner(){
        if( checkHorizontal() || checkVertical() || checkDiagonalUp() || checkDiagonalDown()){
            return true;
        }
        else {return false;}


    }

    private Boolean checkHorizontal(){
        int count = 0;
        for(int iWidth=0; iWidth<WIDTH; iWidth++){
            count = boardArr[hitY][iWidth]==hitMark ? ++count : 0;
            if (count == SLOTS_TO_WIN){
                return true;
            }
        }
        return false;
    }

    private Boolean checkVertical(){
        int count = 0;
        for(int iHeight=0; iHeight<HEIGHT; iHeight++){
            count = (boardArr[iHeight][hitX] == hitMark) ? ++count : 0;
            if (count == SLOTS_TO_WIN){
                return true;
            }
        }
        return false;
    }



    private Boolean checkDiagonalUp(){
        int xStart;
        int yStart;
        int times;
        if(hitX > hitY){
            xStart = hitX - hitY;
            yStart = 0;
            times = WIDTH - xStart;
        }
        else{
            xStart = 0;
            yStart = hitY - hitX;
            times = HEIGHT - yStart;
        }
        int count = 0;

        for(int i=0; i<times; i++){
            count = (boardArr[yStart+i][xStart+i] == hitMark) ? ++count : 0;
            if (count == SLOTS_TO_WIN){
                return true;
            }
        }
        return false;
    }

    private Boolean checkDiagonalDown(){
        int xStart;
        int yStart = hitX + hitY;
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
            count = (boardArr[yStart-i][xStart+i] == hitMark) ? ++count : 0;
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

}
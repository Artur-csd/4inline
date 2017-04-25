<<<<<<< HEAD
public abstract class Player {

    private String playerName;
    private Mark mark;

    public Mark getMark() {
        return mark;
    }

    public void setMark(Mark mark) {
        this.mark = mark;
    }

    public void selectPlayerMark(int playerNum){
        if (playerNum == 1) {
            setMark(Mark.X);
        } else {
            setMark(Mark.O);
        }
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public abstract int getHit();
}
=======
public abstract class Player {

    private String playerName;
    private Mark mark;

    public Mark getMark() {
        return mark;
    }

    public void setMark(Mark mark) {
        this.mark = mark;
    }

    public void selectPlayerMark(int playerNum){
        if (playerNum == 1) {
            setMark(Mark.X);
        } else {
            setMark(Mark.O);
        }
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public abstract int getHit();
}
>>>>>>> 0e8fc75a7491f1a0e2eb44a61009e0f2cc84d18c

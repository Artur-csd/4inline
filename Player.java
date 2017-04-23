public abstract class Player {

    private String playerName;
    private Mark mark;

    public Mark getMark() {
        return mark;
    }

    public void setMark(Mark mark) {
        this.mark = mark;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }


    public void TurmMessage(){
        System.out.print(getPlayerName() + " - " + Messenger.INFO_TEXT);
    }


    public abstract int getHit();



}

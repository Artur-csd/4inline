public enum Messenger {
    NO_MSG(""),
    WINNER(" is a winner!\n"),
    FULL_BOARD("The board is full, nobody wins"),
    COLUMN_NO_SLOT("\nNo free slots in this column\n"),
    FROM_ONE_TO_SEVEN("\nNo free slots in this column\n"),
    CREATE_PLAYER_ONE("Select Player 1 type:\nHuman - press 1 and ENTER\nComputer - press 2 and ENTER\n"),
    CREATE_PLAYER_TWO("Select Player 2 type:\nHuman - press 1 and ENTER\nComputer - press 2 and ENTER\n"),
    INFO_TEXT(" Please, Enter the number from 1 to 7: \n"),
    INVALID_PLAYER_NUM("Wrong! Please enter valid number! Valid number range 1 or 2"),
    SET_VALID_NUM("Try again. Please set valid number range (1-7)"),
    ENTER_PLAYER_NAME("Enter the name of Player ");
    private String messenger;

    Messenger(String messenger) {
        this.messenger = messenger;
    }

    @Override
    public String toString() {
        return this.messenger;
    }
}
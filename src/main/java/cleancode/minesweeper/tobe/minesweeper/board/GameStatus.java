package cleancode.minesweeper.tobe.minesweeper.board;

public enum GameStatus {
    IN_PROGRESS("진행중"),
    WIN("승리"),
    LOSE("패배"),
    ;

    private final String desciption;

    GameStatus(String desciption) {
        this.desciption = desciption;
    }
}

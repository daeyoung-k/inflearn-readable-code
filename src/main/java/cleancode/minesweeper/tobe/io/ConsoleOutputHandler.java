package cleancode.minesweeper.tobe.io;

import cleancode.minesweeper.tobe.GameBoard;
import cleancode.minesweeper.tobe.GameException;

public class ConsoleOutputHandler {
    public void showGameStartComments() {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("지뢰찾기 게임 시작!");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }

    public void showBoard(GameBoard board) {
        System.out.println("   a b c d e f g h i j");
        for (int i = 0; i < board.getRowSize(); i++) {
            System.out.printf("%d  ", i + 1);
            for (int j = 0; j < board.getColSize(); j++) {
                System.out.print(board.getSign(i, j) + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void printGameWinningComment() {
        System.out.println("지뢰를 모두 찾았습니다. GAME CLEAR!");
    }

    public void printGameLosingComment() {
        System.out.println("지뢰를 밟았습니다. GAME OVER!");
    }

    public void printCommentForSelectingCell() {
        System.out.println("선택할 좌표를 입력하세요. (예: a1)");
    }

    public void printCommentForUserAction() {
        System.out.println("선택한 셀에 대한 행위를 선택하세요. (1: 오픈, 2: 깃발 꽂기)");
    }

    public void printExceptionMessage(GameException e) {
        System.out.println(e.getMessage());
    }

    public void printSimpleMessage(String message) {
        System.out.println(message);
    }
}
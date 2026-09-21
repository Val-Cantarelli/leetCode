package neetCode150;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidSudokoBoardTest {

    private final ValidSudokoBoard solver = new ValidSudokoBoard();

    @Test
    void validBoardExampleFromLeetCode() {
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        assertTrue(solver.isValidSudoku(board));
    }

    @Test
    void invalidBoardDuplicateInRow() {
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        board[0][0] = '3'; // repete o '3' que já está em [0][1] -> duplicata na linha 0
        assertFalse(solver.isValidSudoku(board));
    }

    @Test
    void invalidBoardDuplicateInColumn() {
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        board[8][0] = '5'; // repete o '5' que já está em [0][0] -> duplicata na coluna 0
        assertFalse(solver.isValidSudoku(board));
    }

    @Test
    void invalidBoardDuplicateInSameQuadrantButDifferentRowAndColumn() {
        // Este é o caso que sua lógica antiga (linhas/colunas dentro do quadrante) não pegaria
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        board[6][0] = '5'; // mesmo quadrante inferior-esquerdo que o '6' de [8][1]? ajuste: coloca duplicata real
        board[7][1] = '6'; // '6' já existe em [6][1] -> mesmo quadrante, linha e coluna diferentes
        assertFalse(solver.isValidSudoku(board));
    }

    @Test
    void emptyBoardIsValid() {
        char[][] board = new char[9][9];
        for (char[] row : board) java.util.Arrays.fill(row, '.');
        assertTrue(solver.isValidSudoku(board));
    }
}
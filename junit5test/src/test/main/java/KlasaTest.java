package main.java;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

class KlasaTest {

    @ParameterizedTest
    @ValueSource(ints = { -1, 8})
    public void shouldRaiseException_whenBoardRankPositionIsOutOfBounds(int boardRankPosition)
    {
        assertTrue(boardRankPosition > 0 && boardRankPosition < 4);
//        int validBoardFilePosition = 1;
//        assertThrows(IllegalArgumentException.class,() -> new ChessPosition(boardRankPosition,validBoardFilePosition));
    }

}
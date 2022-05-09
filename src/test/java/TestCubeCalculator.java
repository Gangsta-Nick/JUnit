import org.junit.jupiter.api.Assertions;

public class TestCubeCalculator {
    final int SIDE = 5;

    @org.junit.jupiter.api.Test
    public void testCalculateBySide() {
        // given:
        int expected = 25;

        // when:
        int bySideTest = CubeCalculator.calculateBySide(SIDE);

        // then:
        Assertions.assertEquals(expected, bySideTest);
    }

    @org.junit.jupiter.api.Test
    public void testCalculateByDiagonal() {
        // given:
        int expected = 12;

        // when:
        int diagonalTest = CubeCalculator.calculateByDiagonal(SIDE);

        // then:
        Assertions.assertEquals(expected, diagonalTest);
    }

    @org.junit.jupiter.api.Test
    public void testCalculateByPerimeter() {
        // given:
        int expected = 1;

        // when:
        int perimeterTest = CubeCalculator.calculateByPerimeter(SIDE);

        // then:
        Assertions.assertEquals(expected, perimeterTest);
    }
}
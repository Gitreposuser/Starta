import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SquareEquationTest {

    @Test
    void solutionTwoRoots() {
        SquareEquation equation = new SquareEquation(8, 4, -2);
        Roots actual = equation.solution();
        float actualX1 = actual.getX1();
        float actualX2 = actual.getX2();

        float expectedX1 = 0.309017F;
        float expectedX2 = -0.809017F;
        Assertions.assertEquals(expectedX1, actualX1);
        Assertions.assertEquals(expectedX2, actualX2);
    }

    @Test
    void solutionOneRoot() {
        SquareEquation equation = new SquareEquation(3, -18, 27);
        Roots actual = equation.solution();
        float actualX1 = actual.getX1();
        float actualX2 = actual.getX2();

        float expectedX1 = 3.0F;
        float expectedX2 = 3.0F;
        Assertions.assertEquals(expectedX1, actualX1);
        Assertions.assertEquals(expectedX2, actualX2);
    }

    @Test
    void solutionNoRoots() {
        SquareEquation equation = new SquareEquation(8, 4, 2);
        try {
            Roots actual = equation.solution();
            Assertions.assertEquals(false, true);
        } catch (Exception e) {
            Assertions.assertEquals(true, true);
        }
    }
}
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SetServiceTest {
    @Test
    void fillSetTest() {
        Set<Integer> expectedSet = new HashSet<>();
        expectedSet.add(0);
        expectedSet.add(1);
        expectedSet.add(2);
        expectedSet.add(3);
        expectedSet.add(4);

        Set<Integer> actualSet = new HashSet<>();
        SetDemo.fillSet(actualSet, 0, 5);

        Assertions.assertEquals(expectedSet, actualSet);
    }

    @Test
    void unionTest() {
        // Triple - A pattern
        // Arrange
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        SetDemo.fillSet(set1, 0, 5);
        SetDemo.fillSet(set2, 3, 5);

        Set<Integer> expectedSet = new HashSet<>();
        expectedSet.add(0);
        expectedSet.add(1);
        expectedSet.add(2);
        expectedSet.add(3);
        expectedSet.add(4);

        // Act
        Set<Integer> actualSet = SetService.union(set1, set2);

        // Assert
        Assertions.assertEquals(expectedSet, actualSet);
    }

    @Test
    void intersectTest() {
        // Triple - A pattern
        // Arrange
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        SetDemo.fillSet(set1, 0, 5);
        SetDemo.fillSet(set2, 3, 5);

        Set<Integer> expectedSet = new HashSet<>();
        expectedSet.add(3);
        expectedSet.add(4);

        // Act
        Set<Integer> actualSet = SetService.intersect(set1, set2);

        // Assert
        Assertions.assertEquals(expectedSet, actualSet);
    }
}
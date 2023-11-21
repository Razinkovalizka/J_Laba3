package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ComparisonOfListsTest {
    // Проверка на проброс ошибки при некорректных параметрах конструктора
    @Test
    void testWithParametersException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new ComparisonOfLists(2000, 4000);
        });
    }
}
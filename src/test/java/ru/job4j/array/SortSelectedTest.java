package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort11() {
        int[] data = new int[]{3, 4, 1, 2, 5, 9, 7, 2, 6, 22, 42};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 2, 3, 4, 5, 6, 7, 9, 22, 42};
        assertThat(result).containsExactly(expected);
    }
}
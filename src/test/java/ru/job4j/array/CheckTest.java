package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CheckTest {
    @Test
    void whenDataMonoByTrueThenTrue() {
        boolean[] data = new boolean[]{true, true, true};
        boolean result = Check.mono(data);
        assertThat(result).isTrue();
    }

    @Test
    void whenDataNotMonoByTrueThenFalse() {
        boolean[] data = new boolean[]{true, false, true};
        boolean result = Check.mono(data);
        assertThat(result).isFalse();
    }

    @Test
    void whenDataMonoByFalseThenTrue() {
        boolean[] data = new boolean[]{false, false, false};
        boolean result = Check.mono(data);
        assertThat(result).isTrue();
    }

    @Test
    void whenDataNotMonoByFalseThenFalse() {
        boolean[] data = new boolean[]{false, true, false};
        boolean result = Check.mono(data);
        assertThat(result).isFalse();
    }

    @Test
    void compress() {
        int[] array = new int[]{1, 2, 0, 3, 0, 4, 5};
        int[] expected = new int[]{1, 2, 3, 4, 5, 0, 0};
        int[] rsl = Check.compress(array);
        assertThat(rsl).containsExactly(expected);

    }
}
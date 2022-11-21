package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSortArrayOf5elements() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf3elements() {
        int[] data = new int[]{15, 6, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 6, 15};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf5elementsDuplicate() {
        int[] data = new int[]{15, 6, 1, 1, 6};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 1, 6, 6, 15};
        Assert.assertArrayEquals(expected, result);
    }
}
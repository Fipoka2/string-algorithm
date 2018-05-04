package core;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

public class StringAnalysisUtilsTest
{
    @Before
    public void before() {
        System.out.println("Старт тестов");
    }

    @Test
    public void getMaxBorderArray()
    {
        int[] expected = {0,0,0,1,2,0,1,2,3,4,5,0,1,2,3,4,5,6,7,8,9,10,11,3};
        String str = "abcabdabcabeabcabdabcabc";
        assertArrayEquals(expected, StringAnalysisUtils.getMaxBorderArray(str));
    }

    @Test
    public void getMaxBlockArrray()
    {
        assertNotNull(null);
    }
}
import static org.junit.jupiter.api.Assertions.*;


    import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

    public class IIarrTest{
        @Test
        public void testFindCommonElements() {
            int[] array1 = {1, 2, 5, 5, 8, 9, 7, 10};
            int[] array2 = {1, 0, 6, 15, 6, 4, 7, 0};
            int[] expected = {1, 7};
            int[] actual = IIarr.findCommonElements(array1, array2);
            assertArrayEquals(expected, actual);
        }
    }



    import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.*;

    public class IITest2 {
        @Test
        public void testCommonElements() {
            int[] array1 = {1, 2, 5, 5, 8, 9, 7, 10};
            int[] array2 = {1, 0, 6, 15, 6, 4, 7, 0};

            Set<Integer> expected = new HashSet<>();
            expected.add(1);
            expected.add(7);

            Set<Integer> actual = new HashSet<>();
            Set<Integer> set1 = new HashSet<>();
            for (int i : array1) {
                set1.add(i);
            }
            for (int i : array2) {
                if (set1.contains(i)) {
                    actual.add(i);
                }
            }

            assertEquals(expected, actual);
        }
    }



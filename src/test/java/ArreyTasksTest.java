import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArreyTasksTest {
    @Test
    void findCommon(){
        int[] a = new int[] {1, 2, 5, 5, 8, 9, 7, 10};
        int[] b = new int[]{1, 0, 6, 15, 6, 4, 7, 0};
        ArreyTasks tasks=new ArreyTasks();
        int[]common= tasks.findCommon(a,b);
        assertTrue(Arrays.stream(common).anyMatch(value -> value==1));
        assertTrue(Arrays.stream(common).anyMatch(value -> value==7));
        assertEquals(common[0],1);
        assertEquals(common[1],7);

    }

}
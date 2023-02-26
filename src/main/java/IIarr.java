import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;



    public class IIarr {
        public static void main(String[] args) {
            int[] array1 = {1, 2, 5, 5, 8, 9, 7, 10};
            int[] array2 = {1, 0, 6, 15, 6, 4, 7, 0};
            int[] common = findCommonElements(array1, array2);
            System.out.println("Common Elements: " + Arrays.toString(common));
        }

        public static int[] findCommonElements(int[] array1, int[] array2) {
            Set<Integer> set1 = new HashSet<Integer>();
            Set<Integer> commonSet = new HashSet<Integer>();

            for (int i : array1) {
                set1.add(i);
            }

            for (int i : array2) {
                if (set1.contains(i)) {
                    commonSet.add(i);
                }
            }

            int[] common = new int[commonSet.size()];
            int index = 0;

            for (int i : commonSet) {
                common[index++] = i;
            }

            return common;
        }
    }






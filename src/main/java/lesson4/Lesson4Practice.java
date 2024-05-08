package lesson4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lesson4Practice {

    public boolean has22(Integer[] numbers) {

//        Integer[] numbers = {1, 2, 1, 2, 2};

        for (int i = 0; i <= numbers.length - 1; i++) {

            if (numbers[i] == 2 && numbers[i + 1] == 2) {

                return true;
            }
        }
        return false;
    }

    public boolean lucky13(Integer[] nums) {

//        Integer[] nums = {1, 2, 1, 2, 2};

        for (int num : nums) {

            if (num == 1 || num == 3) {

                return false;
            }
        }
        return true;
    }

    public int maxTriple(Integer[] max) {
        Arrays.sort(max);
        int result = max[2];
        return result;
    }

    public boolean front9(Integer[] fronts) {

        int end = Math.min(fronts.length, 4);

        for (int i = 0; i < end; i++) {
            if (fronts[i] == 9) {
                return true;  // Return true immediately if a 9 is found
            }
        }
        return false;
    }


    public static List<Integer> square(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();  // Create a new list to store the squared values
        for (Integer num : numbers) {
            result.add(num * num);  // Square the number and add it to the result list
        }
        return result;
    }
}

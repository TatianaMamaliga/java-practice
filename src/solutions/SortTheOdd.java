package solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortTheOdd {
    public int[] sortArray(int[] arr) {
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        for (int num : arr) {
            if (num % 2 != 0) {
                oddNumbers.add(num);
            }
        }

        Collections.sort(oddNumbers);

        int oddIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] = oddNumbers.get(oddIndex);
                oddIndex++;
            }
        }
        return arr;
    }
}
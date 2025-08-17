// do not remove imports
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

class ArrayUtils {
    // define invert method here
    public static <T> T[] invert(T[] array) {
        T[] invertedArray = Arrays.copyOf(array, array.length);

        for (int i = array.length - 1; i >= 0; i--) {
            invertedArray[array.length - 1 - i] = array[i];
        }

        return invertedArray;
    }
}
package reverse_stack;

import java.util.Arrays;
import java.util.Stack;

public class RevereStack {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        String words = "Apple And the Rabbit";
        String[] arrayString = words.split(" ");
        System.out.println(Arrays.toString(arrayString));
        System.out.println(Arrays.toString(array));

        Stack<Integer> stack = new Stack<>();
        Stack<String> stackString = new Stack<>();

        pushToStack(array, stack);
        pushToStack(arrayString, stackString);

        reGetFromStack(array, stack);
        reGetFromStack(arrayString, stackString);

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arrayString));

    }

    private static <T> void reGetFromStack(T[] array, Stack<T> stack) {
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
    }

    private static <T> void pushToStack(T[] array, Stack<T> stack) {
        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }
    }
}

package count_number_of_word;

import java.util.Map;
import java.util.TreeMap;

public class StringMap {
    public static void main(String[] args) {
        String test = "Chương trình đếm các lần xuất hiện của từ trong một văn bản và hiển thị các từ và sự xuất hiện của chúng theo thứ tự trong bảng chữ cái của các từ.";

        String[] arrayTest = test.split(" ");

        for (int i = 0; i < arrayTest.length; i++) {
            arrayTest[i] = arrayTest[i].toLowerCase();
        }

        Map<String, Integer> stringMap = new TreeMap<>();

        for (String word : arrayTest) {
            if (stringMap.containsKey(word)) {
                stringMap.put(word, stringMap.get(word) + 1);
            } else {
                stringMap.put(word, 1);
            }
        }

        System.out.println(stringMap);

//        System.out.println(Arrays.toString(arrayTest));
//
//        System.out.println(Arrays.asList(arrayTest).contains("lan"));


    }
}

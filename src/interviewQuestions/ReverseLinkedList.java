package interviewQuestions;

import java.util.LinkedList;

public class ReverseLinkedList {

    private static final LinkedList<String> list = new LinkedList<String>(){
        {
            add("sheva");
            add("rost");
            add("some");
            add("test");
            add("arina");
        }
    };

    public static void main(String... args) {

        String temp;

        for (int i = 0; i < list.size()/2; i++) {
            temp = list.get(list.size() - i - 1);

            list.remove(list.size() - i - 1);
            list.add(list.size() - i, list.get(i));

            list.remove(i);
            list.add(i, temp);
        }

        System.out.println(list);
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void fillList(List<Integer> list) {
        for  (int i = 0; i < 10; i++) {
            list.add(i);
        }
    }

    private static void outputElements(List<Integer> list) {
        for  (int i = 0; i < 10; i++) {
            System.out.println("list[" + i + "] = " + list.get(i));
        }
    }

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        fillList(myList);
        System.out.println("Наш список містить наступні елементи:");
        System.out.println("--------------------------------");
        outputElements(myList);
        System.out.println("--------------------------------");

        System.out.println();
        System.out.println("Збільшимо значення кожного елемента списку на 1:");
        ListIterator<Integer> listIterator = myList.listIterator();

        while (listIterator.hasNext()) {
            int value = listIterator.next();
            listIterator.set(value + 1);
        }

        System.out.println("Після збільшення значень елементів списку на 1:");

        System.out.println("--------------------------------");
        outputElements(myList);
        System.out.println("--------------------------------");
    }
}
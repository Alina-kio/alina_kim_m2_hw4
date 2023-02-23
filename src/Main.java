import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();
        ArrayList<String> listB = new ArrayList<>();
        ArrayList<String> listC = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write any 5 words for listA");
        for (int i = 0; i < 5; i++) {
            listA.add(scanner.next());
        }
        System.out.println("ListA " + listA);


        System.out.println("Write any 5 words for listB");
        for (int i = 0; i < 5; i++) {
            listB.add(scanner.next());
        }
        System.out.println("ListB " + listB);

        Collections.reverse(listB);
        for (int i = 0; i < 5; i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(i));
        }
        System.out.println("ListC " + listC);
        listC.sort(Comparator.comparing(String :: length));
        System.out.println("После сортировки");
        System.out.println("ListC " + listC);
    }
}

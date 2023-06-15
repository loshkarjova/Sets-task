package task_2;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        print();
        outputSet(createSet());
        removeElement(createSet());
    }

    public static void print() {
        System.out.println("Current set: ");
    }

    public static HashSet<String> createSet() {
        HashSet<String> set = new HashSet<>();
        set.add("ORANGE");
        set.add("PLUM");
        set.add("PEACH");
        set.add("TOMATO");
        set.add("LEMON");
        return set;
    }

    public static HashSet<String> removeElement(HashSet<String> set) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write string for remove: ");
        String str = scanner.nextLine().toUpperCase().trim();
        if (set.contains(str)) {
            System.out.println("\nNew set: ");
            set.remove(str);
            outputSet(set);
        } else {
            System.out.println(str + " is absent in this set.");
        }

        return set;
    }

    public static void outputSet(HashSet<String> set) {
        int count = 1;
        for (String element : set) {
            System.out.println(count + "." + element);
            count++;
        }
    }
}

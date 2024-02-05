package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class flames {
    public static void find(String male, String female) {
        ArrayList<Character> maleList = new ArrayList<>();
        ArrayList<Character> femaleList = new ArrayList<>();
        for (char i : male.toCharArray()) {
            maleList.add(i);
        }
        for (char i : female.toCharArray()) {
            femaleList.add(i);
        }

        for (char i : male.toCharArray()) {
            if (femaleList.contains(i)) {
                femaleList.remove(Character.valueOf(i));
                maleList.remove(Character.valueOf(i));
            }
        }
        int number = maleList.size() + femaleList.size();
        int count = 0;

        List<Character> flames = new ArrayList<>(Arrays.asList('f', 'l', 'a', 'm', 'e', 's'));

        while (flames.size() > 1) {
            count = (count + number - 1) % flames.size();
            flames.remove(count);
        }

        char result = flames.get(0);
        switch (result) {
            case 'f':
                System.out.println("Friendship");
                break;
            case 'l':
                System.out.println("Love");
                break;
            case 'a':
                System.out.println("Affection");
                break;
            case 'm':
                System.out.println("Marriage");
                break;
            case 'e':
                System.out.println("Enmity");
                break;
            case 's':
                System.out.println("Sibling");
                break;
            default:
                System.out.println("Invalid result");
        }

    }

    public static void main(String[] args) {
        String male = "aravinth";
        String female = "tamannah";
        if (male.length() < female.length()) {
            find(male.toLowerCase(), female.toLowerCase());
        } else {
            find(female.toLowerCase(), male.toLowerCase());
        }
    }
}

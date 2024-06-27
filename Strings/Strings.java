import java.util.*;

public class Strings {
    public static void main(String[] args) {

        // String declering

        System.out.println();

        String word = "Hello";
        String words = "Hello World";
        String Sentence = "Hello World i am learning DSA.";

        System.out.println("word : " + word);
        System.out.println("words : " + words);
        System.out.println("Sentence : " + Sentence);

        System.out.println();

        // String input

        // for single word input
        Scanner sc = new Scanner(System.in);

        String name;
        System.out.print("Entre name : ");
        name = sc.next(); // for single word

        System.out.println("My name is : " + name);

        // for multiple word input

        Scanner pc = new Scanner(System.in);

        String fullName;
        System.out.print("Entre full name : ");
        fullName = pc.nextLine(); // for multiple words

        System.out.println("My name is : " + fullName);

        System.out.println();

        // concatenation
        String firstName = "Tony";
        String lastname = "Stark";

        String completeName = firstName + " " + lastname;

        System.out.println("Full name is " + completeName);
        System.out.println("Length of full name is : " + completeName.length());

        System.out.println();

        // charAt

        for (int i = 0; i < completeName.length(); i++) {
            System.out.print(completeName.charAt(i) + " ");
        }

        System.out.println();

        // String comparision
        System.out.println();

        String name1 = "Tony";
        String name2 = "Tony";

        // compareTo()
        // 1. s1>s2 --------> +ve value
        // 1. s1=s2 --------> 0
        // 1. s1<s2 --------> -ve value

        if (name1.compareTo(name2) == 0) {
            System.out.println("Strings are equal.");
        } else {
            System.out.println("Strings are not equal");
        }

        System.out.println();

        if (name1 == name2) {
            System.out.println("Strings are equal.");
        } else {
            System.out.println("Strings are not equal");
        }

        // we use compareTo() functions mostly ....as == operator fails in some
        // cases...as follows

        System.out.println();

        if (new String("Tony") == new String("Tony")) {
            System.out.println("Strings are equal.");
        } else {
            System.out.println("Strings are not equal");
        }

        // sunStrings ------> name.substring(starting index, ending index)

        System.out.println();

        String sent = "Tony Stark";

        String subStr1 = sent.substring(5, sent.length());
        System.out.println(subStr1);

        String subStr2 = sent.substring(0, 7);
        System.out.println(subStr2);

        String subStr3 = sent.substring(2);
        System.out.println(subStr3);
    }
}
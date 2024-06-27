import java.util.*;
// In java strings are immutable
// StringBuilder is used to apply operations on string in minimal excution time

public class StringBuilderIntro {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        // char at index 0
        System.out.println(sb.charAt(0));

        // set char at index 0
        sb.setCharAt(0, 'P');
        System.out.println(sb);

        // insert char
        sb.insert(2, 'n');
        System.out.println(sb);

        // delete char
        sb.delete(2, 3);
        System.out.println(sb);

        // append char to string
        sb.append('a');
        sb.append('t');
        sb.append('a');

        System.out.println(sb);

        // length of string

        System.out.println(sb.length());

    }
}

import java.util.*;

public class UpdateBit {

    public static void main(String[] args) {
        int n = 5; // 0101
        int pos = 1;
        int BitMask = 1 << pos;

        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();

        if (oper == 1) {
            int newNumber = BitMask | n;
            System.out.println(newNumber);
        } else {
            int newBitMask = ~(BitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }

    }

}

public class SetBit {
    public static void main(String[] args) {
        int n = 5; // 0101
        int pos = 1;
        int BitMask = 1 << pos;

        int newNumber = BitMask | n;

        System.out.println(newNumber);

    }
}

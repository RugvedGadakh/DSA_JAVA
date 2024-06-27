public class ClearBit {

    public static void main(String[] args) {
        int n = 5;  //0101
        int pos = 2;
        int BitMask = 1 << pos;

        int newNumber = n & (~(BitMask));

        System.out.println(newNumber);
    }

}

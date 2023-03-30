package school.mjc.stage0.conditions.finalTask;

public class BitwiseValuesSwap {
    public static void swap(int first, int second) {
//first  1 = 01  -> 2
//second 2 = 10  -> 1
        first = first ^ second; // 11
        second = first ^ second; // 01
        first = first ^ second; // 10
        System.out.println(first);
        System.out.println(second);
    }

    public static void main(String[] args) {
        swap(1, 2);
    }
}

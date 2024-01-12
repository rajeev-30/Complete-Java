package METHODS;

public class VarArgs {

    static int sum(int... arr) {
        // Available as int []arr;
        int r = 0;
        for (int a : arr) {
            r += a;
        }
        return r;
    }

    public static void main(String[] args) {
        System.out.println(sum(6, 7, 8));
        System.out.println(sum(5, 6, 7, 8));
        System.out.println(sum(4, 5, 6, 7, 8, 3, 5, 66));

    }

}

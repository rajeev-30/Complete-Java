package EVALUATION02;

class Addition {
    int s = 0;

    int sum() {
        for (int i = 1; i <= 10; i++) {
            s += i;
        }
        return s;
    }
}

class Solution extends Addition {
    void show() {
        System.out.println("sum: " + sum());
    }
}

public class Que_01 {
    public static void main(String[] args) {
        Solution s = new Solution();
        s.show();

    }

}

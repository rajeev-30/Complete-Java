class ParentClass {
    private int num;

    public void setData(int n) {
        num = n;
    }

    public int getData() {
        return num;
    }
}

class child extends ParentClass {
    int n;

    public void show() {
        int num = getData();
        System.out.println("sum: " + (num + n));

    }
}

public class Question_02 {
    public static void main(String[] args) {
        child c = new child();
        c.n = 10;
        c.setData(20);
        c.show();
    }

}

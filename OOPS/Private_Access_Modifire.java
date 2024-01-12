package OOPS;

class Private {
    private int id;
    private String name;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }

}

public class Private_Access_Modifire {
    public static void main(String[] args) {
        Private p1 = new Private();

        p1.setId(86);
        System.out.println(p1.getId());

        p1.setName("Rajeev");
        System.out.println(p1.getName());
    }

}

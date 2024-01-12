public class Try_catch {
    public static void main(String[] args) {
        String[] cars = { "Maruti", "Suzuki", "Innova", "Ford Titanium" };
        for (String value : cars) {
            System.out.println(value);
        }

        try {
            System.out.println(cars[10]);
        }

        catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("this code run with error!");
    }

}

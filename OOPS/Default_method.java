package OOPS;

interface camera {
    void takeSnap();

    void recordVideo();

    private void greet() { // this method can only use inside this camera2 interface;
        System.out.println("Good morning");
    }

    default void record4KVideo() { // this is default method
        greet(); // this method will run whenever record4KVideo will be called;
        System.out.println("Recording in 4K...");
    }
}

interface wifi {
    String[] getNetwork();

    void connectToNetwork(String network);
}

class cellPhone {
    void callNumber(int number) {
        System.out.println("Calling " + number);
    }

    void pickCall() {
        System.out.println("Connecting... ");
    }

}

class mySmartPhone extends cellPhone implements wifi, camera {

    public void takeSnap() {
        System.out.println("Taking snap");
    }

    public void recordVideo() {
        System.out.println("Recording video");
    }

    public String[] getNetwork() {
        System.out.println("Getting List of Networks");
        String[] networkList = { "Rajeev", "Mourya", "Kushwaha" };
        return networkList;
    }

    public void connectToNetwork(String network) {
        System.out.println("Connect to " + network);
    }
}

public class Default_method {
    public static void main(String[] args) {
        mySmartPhone mi = new mySmartPhone();

        mi.record4KVideo();
        String[] ar = mi.getNetwork();

        for (String item : ar) {
            System.out.println(item);
        }
    }
}

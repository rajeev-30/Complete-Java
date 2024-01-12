package OOPS;

interface camera2 {
    void takeSnap();

    void recordVideo();

    private void greet() {
        System.out.println("Good morning");
    }

    default void record4KVideo() {
        greet();
        System.out.println("Recording in 4K...");
    }
}

interface wifi2 {
    String[] getNetwork();

    void connectToNetwork(String network);
}

class cellPhone2 {
    void callNumber(int number) {
        System.out.println("Calling " + number);
    }

    void pickCall() {
        System.out.println("Connecting... ");
    }

}

class mySmartPhone2 extends cellPhone2 implements wifi2, camera2 {

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

public class PolyMorphism {
    public static void main(String[] args) {
        camera2 cam = new mySmartPhone2();// This is a smartPhone but, use it as a camera
        // cam.getNetwork() ---> not allowed
        cam.record4KVideo();
    }

}

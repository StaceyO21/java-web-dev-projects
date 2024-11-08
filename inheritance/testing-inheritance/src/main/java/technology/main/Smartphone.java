package technology;

public class Smartphone extends Computer{

    private boolean isConnectedTo5G;

    public Smartphone(int screenWidth, int screenHeight, String techAge, boolean isConnectedTo5G) {
        super(screenWidth,screenHeight,techAge);
        this.isConnectedTo5G = isConnectedTo5G;
    }

    public void makeAPhoneCall(String number) {
        System.out.println("Calling: " + number);
    }
}

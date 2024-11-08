package technology;

public class Laptop extends Computer{

    private boolean isIntelliJOpen;

    public Laptop(int screenWidth, int screenHeight, String techAge) {
        super(screenWidth, screenHeight,techAge);
        this.isIntelliJOpen = false;
    }

    public Laptop(int screenWidth, int screenHeight, String techAge, boolean isIntelliJOpen) {
        super(screenWidth, screenHeight,techAge);
        this.isIntelliJOpen = isIntelliJOpen;
    }

    public void openIntelliJ() {
        this.isIntelliJOpen = true;
        System.out.println("IntelliJ is now open");
    }
}

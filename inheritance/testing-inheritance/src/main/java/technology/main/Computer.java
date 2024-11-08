package technology;

public class Computer {
    private int screenWidth;
    private int screenHeight;
    private String techAge;

    public Computer(int screenWidth, int screenHeight, String techAge) {
        this.screenWidth = screenWidth;
        this.screenHeight = screenHeight;
        this.techAge = techAge;
    }

    public int twoPlusTwo() {
        return 2 + 2;
    }

    public void saySomethingFunny() {
        System.out.println("What is black and white and red all over? a penguin reading the newspaper!");
    }
}

package technology;

public class Program {
    public static void main(String[] args) {
        Smartphone mySmartPhone = new Smartphone(1200, 500, "2022", true);
//        mySmartPhone.makeAPhoneCall("573-434-9080");
        int result = mySmartPhone.twoPlusTwo();
//        System.out.println("The result is: " + result);

        Laptop myLaptop = new Laptop(5000, 5000, "2018");
//        myLaptop.openIntelliJ();
        int laptopResult = myLaptop.twoPlusTwo();
//        System.out.println("The result is: " + laptopResult);

        Computer myComputer = new Computer(6000, 5000, "1999");
        int computerResult = myComputer.twoPlusTwo();
        System.out.println("The result is: " + computerResult);
        myComputer.saySomethingFunny();
    }
}

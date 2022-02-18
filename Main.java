public class Main {
    public static void main(String[] args) {

        ElectricShaver electricShaver = new ElectricShaver();
        ElectricShaver electricShaver1 = new ElectricShaver("LG");
        ElectricShaver electricShaver2 = new ElectricShaver("Gillette",5, 1000);
        System.out.println(electricShaver);
        System.out.println(electricShaver1);
        System.out.println(electricShaver2);
    }
}

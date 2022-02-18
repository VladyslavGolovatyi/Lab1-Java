public class Main {
    public static void main(String[] args) {

        ElectricShaver electricShaver = new ElectricShaver();
        ElectricShaver electricShaver1 = new ElectricShaver("Braun",4,120);
        ElectricShaver electricShaver2 = new ElectricShaver("Gillette",5, 60,
                                                            1000,"China","Black");
        System.out.println(electricShaver);
        System.out.println(electricShaver1);
        System.out.println(electricShaver2);
    }
}

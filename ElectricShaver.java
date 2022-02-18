
public record ElectricShaver(String firm, int numberOfBlades, int priceInUAH) {
    static int numberOfElectricShavers;
    static int getNumberOfElectricShavers(){
        return numberOfElectricShavers;
    }

    public ElectricShaver() {
        this("");
    }

    public ElectricShaver(String firm) {

        this(firm, 0);
    }

    public ElectricShaver(String firm, int numberOfBlades) {
        this(firm, numberOfBlades, 0);
    }

    public ElectricShaver(String firm, int numberOfBlades, int priceInUAH) {
        this.firm = firm;
        this.numberOfBlades = numberOfBlades;
        this.priceInUAH = priceInUAH;
    }

    @Override
    public String toString() {
        return "ElectricShaver{" +
                "firm='" + firm + '\'' +
                ", numberOfBlades=" + numberOfBlades +
                ", priceInUAH=" + priceInUAH +
                '}';
    }
}

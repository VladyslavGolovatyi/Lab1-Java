public record ElectricShaver(String firm, int numberOfBlades, int batteryLifeInMinutes,
                             int priceInUAH, String producingCountry, String color) {

    static int numberOfElectricShavers;
    static int getNumberOfElectricShavers(){
        return numberOfElectricShavers;
    }

    public ElectricShaver() {
        this(null,0,0);
    }

    public ElectricShaver(String firm, int numberOfBlades, int batteryLifeInMinutes) {
        this(firm, numberOfBlades, batteryLifeInMinutes, 0, null, null);
    }

    @Override
    public String toString() {
        return "ElectricShaver{" +
                "firm='" + firm + '\'' +
                ", numberOfBlades=" + numberOfBlades +
                ", batteryLifeInMinutes=" + batteryLifeInMinutes +
                ", priceInUAH=" + priceInUAH +
                ", producingCountry='" + producingCountry + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

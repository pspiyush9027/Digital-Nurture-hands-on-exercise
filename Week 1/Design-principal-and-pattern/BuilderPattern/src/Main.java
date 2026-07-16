public class Main {
    public static void main(String[] args) {
        Computer gamingPc = new Computer.Builder()
                .withCpu("Intel Core i9")
                .withRam("32GB")
                .withStorage("1TB SSD")
                .addGraphicsCard("NVIDIA RTX 4080")
                .withOperatingSystem("Windows 11")
                .build();

        Computer officeSetup = new Computer.Builder()
                .withCpu("Intel Core i5")
                .withRam("16GB")
                .withStorage("512GB SSD")
                .withOperatingSystem("Windows 10")
                .build();

        System.out.println("Gaming setup:");
        gamingPc.printSpecs();

        System.out.println("Office setup:");
        officeSetup.printSpecs();
    }
}


public class Main {
    public static void main(String[] args) {
        // Create different configurations of Computer using the Builder pattern

        // Basic Computer configuration
        Computer basicComputer = new Computer.Builder()
                .setCPU("Intel i5")
                .setRAM("8GB")
                .setStorage("256GB SSD")
                .setOperatingSystem("Windows 10")
                .build();

        // High-end Gaming Computer configuration
        Computer gamingComputer = new Computer.Builder()
                .setCPU("Intel i9")
                .setRAM("32GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA RTX 3080")
                .setOperatingSystem("Windows 11")
                .build();

        // Print the computer configurations
        System.out.println(basicComputer);
        System.out.println();
        System.out.println(gamingComputer);
    }
}

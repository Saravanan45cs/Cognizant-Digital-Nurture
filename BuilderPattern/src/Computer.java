
public class Computer {
    // Attributes of the Computer
    private final String CPU;
    private final String RAM;
    private final String storage;
    private final String graphicsCard;
    private final String operatingSystem;

    // Private constructor to be used by the Builder
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.operatingSystem = builder.operatingSystem;
    }

    @Override
    public String toString() {
        return "Computer Specifications:\n" +
                "CPU: " + CPU + "\n" +
                "RAM: " + RAM + "\n" +
                "Storage: " + storage + "\n" +
                "Graphics Card: " + graphicsCard + "\n" +
                "Operating System: " + operatingSystem;
    }

    // Static nested Builder class
    public static class Builder {
        // Builder attributes matching Computer attributes
        private String CPU;
        private String RAM;
        private String storage;
        private String graphicsCard;
        private String operatingSystem;

        // Methods to set each attribute
        public Builder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public Builder setRAM(String RAM) {
            this.RAM = RAM;
            return this;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Builder setOperatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
            return this;
        }

        // Build method to create the Computer instance
        public Computer build() {
            return new Computer(this);
        }
    }
}

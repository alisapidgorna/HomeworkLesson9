package packageForComputer;

public class Computer {
    private String name;
    private String color;
    private double weight;
    private Processor processor;
    private Motherboard motherboard;
    private Monitor monitor;
    private HDD hdd;

    public Computer(String name, String color, double weight, Processor processor, Motherboard motherboard, Monitor monitor, HDD hdd) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.processor = processor;
        this.motherboard = motherboard;
        this.monitor = monitor;
        this.hdd = hdd;
    }
    public Processor getProcessor(){
        return this.processor;
    }
    public Motherboard getMotherboard(){
        return this.motherboard;
    }
    public HDD getHdd(){
        return this.hdd;
    }
    public void showMonitor(){
        System.out.println("Computer -> is showing monitor");
        monitor.show();
    }
}

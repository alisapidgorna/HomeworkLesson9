package packageForComputer;

public class Main {
    public static void main(String[] args) {
        Processor processor = new Processor(4,2.8,"L3");
        Motherboard motherboard = new Motherboard("4096+2048 Мбайт DDR3-1333", "NVIDIA GeForce GT 330M");
        Monitor monitor = new Monitor(16.4,1920,1080);
        HDD hdd = new HDD(500,5400);
        Computer computer = new Computer("Sony VAIO F","black",3.2, processor,motherboard,monitor,hdd);
        System.out.println("Sony VAIO F laptop review:");
        computer.showMonitor();
        computer.getProcessor().turnOn();
        computer.getProcessor().think();
        computer.getProcessor().give();
        computer.getMotherboard().getRam();
        computer.getMotherboard().connect();
        computer.getHdd().getPerformance();
    }
}

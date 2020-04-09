package packageForComputer;

public class Motherboard {
    private String ram;
    private String graphicsCard;

    public Motherboard(String ram, String graphicsCard) {
        this.ram = ram;
        this.graphicsCard = graphicsCard;
    }
    public void connect(){
        System.out.println("Motherboard -> is connecting with processor, RAM, Graphics card, HDD, keyboard etc and forcing them to work");
    }
    public String getRam() {
        System.out.println("Motherboard -> Ram -> is working");
        return ram;
    }
    public String getGraphicsCard() {
        return graphicsCard;
    }
}

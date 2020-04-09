package packageForComputer;

public class Processor {
    private int numOfCores;
    private double clockFrequency;
    private String cache;

    public Processor(int numOfCores, double clockFrequency, String cache) {
        this.numOfCores = numOfCores;
        this.clockFrequency = clockFrequency;
        this.cache = cache;
    }
    public void turnOn(){
        System.out.println("Processor -> is turning on for work");
    }
    public void think(){
        System.out.println("Processor -> is thinking");
    }
    public void give(){
        System.out.println("Processor -> is giving the result");
    }
    public int getNumOfCores(){
        return numOfCores;
    }
    public double getClockFrequency(){
        return clockFrequency;
    }
    public String getCache(){
        return cache;
    }
}

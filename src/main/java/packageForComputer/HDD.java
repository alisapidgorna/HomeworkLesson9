package packageForComputer;

public class HDD {
    private int volume;
    private int performance;

    public HDD(int volume, int performance) {
        this.volume = volume;
        this.performance = performance;
    }
    public int getVolume() {
        return volume;
    }
    public int getPerformance() {
        System.out.println("HDD -> Performance -> the performance of HDD is fast");
        return performance;
    }
}

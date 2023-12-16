package Vorlesung.JavaIO;

public class Uhr {
    private long start;
    private long end;

    public void startTime() {
        start = System.nanoTime();
    }

    public void stopTime() {
        end = System.nanoTime();
    }

    public long getDuration() {
        return end - start;
    }
}

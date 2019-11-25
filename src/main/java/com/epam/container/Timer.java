package com.epam.container;

public class Timer {

    private long startTime = 0;
    private long stopTime = 0;
    private boolean running = false;

    public void start() {
        startTime = System.currentTimeMillis();
        running = true;
    }

    public void stop() {
        stopTime = System.currentTimeMillis();
        running = false;
    }

    public long getElapsedTime() {
        long elapsed;
        if (running) {
            elapsed = (System.currentTimeMillis() - startTime);
        } else {
            elapsed = (stopTime - startTime);
        }
        return elapsed;
    }

    public String toString() {
        String result = "" + getElapsedTime() + " ms";
        return result;
    }
}

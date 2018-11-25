package com.maestro.player.lambda;

public class OutputModel {

    private int numberOfPices;

    public OutputModel() {

    }

    public OutputModel(int numberOfPices) {
        this.numberOfPices = numberOfPices;
    }

    public int getNumberOfPices() {
        return numberOfPices;
    }

    public void setNumberOfPices(int numberOfPices) {
        this.numberOfPices = numberOfPices;
    }
}

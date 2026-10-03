package ru.mirea;

public class Memory {
    private int sizeGB;
    private String type;

    public Memory(int sizeGB, String type) {
        this.sizeGB = sizeGB;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Память: " + sizeGB + " GB, тип " + type;
    }
}
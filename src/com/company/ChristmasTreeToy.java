package com.company;



public class ChristmasTreeToy {
    private ToyColor color;
    private int size;

    public ChristmasTreeToy(ToyColor color, int size) {
        this.color = color;
        this.size = size;
    }

    public ToyColor getColor() {
        return color;
    }

    public void setColor(ToyColor color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "ChristmasTreeToy{" +
                "color=" + color +
                ", size=" + size +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChristmasTreeToy that = (ChristmasTreeToy) o;
        return size == that.size &&
                color == that.color;
    }

}

package com.company;

import java.util.List;

public class ChristmasTree {
    private float height;
    private boolean light;
    private List<ChristmasTreeToy> christmasTreeToys;

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public boolean isLight() {
        return light;
    }

    public void setLight(boolean light) {
        this.light = light;
    }

    public List<ChristmasTreeToy> getChristmasTreeToys() {
        return christmasTreeToys;
    }

    public void setChristmasTreeToys(List<ChristmasTreeToy> christmasTreeToys) {
        this.christmasTreeToys = christmasTreeToys;
    }

    public ChristmasTree(float height, boolean light, List<ChristmasTreeToy> christmasTreeToys) {
        this.height = height;
        this.light = light;
        this.christmasTreeToys = christmasTreeToys;


    }
}

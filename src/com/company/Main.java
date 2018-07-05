package com.company;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static com.company.ToyColor.*;

public class Main {


    public static void main(String[] args) {
        ChristmasTreeToy toy1 = new ChristmasTreeToy(RED, 1);
        ChristmasTreeToy toy2 = new ChristmasTreeToy(GREEN, 1);
        ChristmasTreeToy toy3 = new ChristmasTreeToy(RED, 2);
        ChristmasTreeToy toy4 = new ChristmasTreeToy(YELLOW, 3);
        ChristmasTreeToy toy5 = new ChristmasTreeToy(BLUE, 1);
        ChristmasTreeToy toy6 = new ChristmasTreeToy(RED, 3);
        ChristmasTreeToy toy7 = new ChristmasTreeToy(GREEN, 2);
        ChristmasTreeToy toy8 = new ChristmasTreeToy(YELLOW, 1);
        List<ChristmasTreeToy> christmasToys = new ArrayList<>();
        christmasToys.add(toy1);
        christmasToys.add(toy2);
        christmasToys.add(toy3);
        christmasToys.add(toy4);
        christmasToys.add(toy5);
        christmasToys.add(toy6);
        christmasToys.add(toy7);
        christmasToys.add(toy8);
        ChristmasTree tree = new ChristmasTree(1.8f, true, christmasToys);
        int n = countRedToys(tree.getChristmasTreeToys());
        System.out.println("Колличество красных шаров = " + n);
        List<ChristmasTreeToy> toys2 = tree.getChristmasTreeToys();
        System.out.println("Сортировка по цвету");
        toys2.sort(Comparator.comparing(ChristmasTreeToy::getColor));
        for (ChristmasTreeToy toy : toys2) {
            System.out.println(toy);
        }
        System.out.println("Сортировка по размеру");
        toys2.sort(Comparator.comparing(ChristmasTreeToy::getSize));
        for (ChristmasTreeToy toy : toys2) {
            System.out.println(toy);
        }

    }

    private static int countRedToys(List<ChristmasTreeToy> christmasTreeToys) {
        int count = 0;
        for (ChristmasTreeToy toy : christmasTreeToys) {
            if (toy.getColor() == RED) {
                count++;
            }
        }
        return count;
    }

}

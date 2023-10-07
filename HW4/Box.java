package ru.geekbrains.lesson4.homework;

import java.util.ArrayList;

public class Box<T extends Fruct> {

    ArrayList<T> fructs;

}

    public Box () {
        this.box = new ArrayList<>();
    }
    public Box(ArrayList<T> box) {
        this.box = box;
    }

    public void takeFromBox(Box<T> donorBox) {
        this.box.addAll(donorBox.box);
        donorBox.box.clear();
    }
    public void addFruit(T e) {
        this.box.add(e);
    }

    public float getWeight() {
        return box.size() * box.get(0).getWeight();
    }

    public int getQuantity() {
        return box.size();
    }

    public boolean compare(Box<?> box) {
        return this.getWeight() == box.getWeight();
    }
}
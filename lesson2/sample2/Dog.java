package ru.geekbrains.lesson2.sample2;

public class Dog extends BaseDog implements Animal{
    @Override
    public void jump() {
        System.out.println("Собака прыгает.");
    }

    @Override
    public void voice() {
        System.out.println("Собака лает.");
    }
}

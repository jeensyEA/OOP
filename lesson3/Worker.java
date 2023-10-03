package ru.geekbrains.lesson3;

/**
 * Рабочий (фулл-тайм)
 */
public class Worker extends Employee {
    public Worker(String surName, String name, double salary) {
        super(surName, name, salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Рабочий; Среднемесячная заработная плата (фиксированная): %.2f (руб.)",
                surName, name, calculateSalary());
    }
}

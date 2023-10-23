package SEM_1.SEM_7.observer;

import java.util.ArrayList;
import java.util.List;

public class JobAgency implements Publisher {

    private List<Observer> observers = new ArrayList<>();
    private List<Job> vacancies = new ArrayList<>();

    @Override
    public void sendOffer(String companyName, double salary) {
        for (Observer observer : observers){
            observer.receiveOffer(companyName, salary);
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void addVacancy(Job vacancy) {
        vacancies.add(vacancy);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            for (Job offer : vacancies) {
                observer.receiveVacancy(offer);
            }
        }
    }

}
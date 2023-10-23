package SEM_1.SEM_7.observer;

public interface Publisher {

    void sendOffer(String companyName, double salary);

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);

    void addVacancy(Job vacancy);

    void notifyObservers();

}
package SEM_1.SEM_7.observer;

public interface Observer {

    void receiveOffer(String nameCompany, double salary);

    void receiveVacancy(Job vacancy);

}
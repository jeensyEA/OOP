package SEM_1.SEM_7.observer;

public class Master implements Observer {

    private String name;
    private double salary = 80000;

    public Master(String name) {
        this.name = name;
        this.salary = 80000;
    }

    @Override
    public void receiveOffer(String nameCompany, double salary) {
        if (this.salary <= salary) {
            System.out.printf("Мастер %s >>> Мне нужна эта работа! [%s - %f]\n",
                    name, nameCompany, salary);
            this.salary = salary;
        } else {
            System.out.printf("Специалист %s: Я найду работу получше! (компания: %s; заработная плата: %d)\n",
                    name, nameCompany, salary);
        }
    }

    @Override
    public void receiveVacancy(Job vacancy) {
        if (this.salary < vacancy.getSalary()) {
            System.out.printf("Мастер %s >>> Мне нужна эта работа! [%s - %s - %f]\n", name, vacancy.getPosition(),
                    vacancy.getCompany(),
                    vacancy.getSalary());
            this.salary = vacancy.getSalary();
        } else {
            System.out.printf("Мастер %s >>> Я найду работу получше! [%s - %s - %f]\n", name, vacancy.getPosition(),
                    vacancy.getCompany(),
                    vacancy.getSalary());
        }
    }
}
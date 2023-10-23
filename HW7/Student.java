package SEM_1.SEM_7.observer;

public class Student implements Observer{

    private String name;
    private double salary = 2000;

    public Student(String name) {
        this.name = name;
        this.salary = 2000;
    }

    @Override
    public void receiveOffer(String nameCompany, double salary) {
        if (this.salary <= salary){
            System.out.printf("Студент %s >>> Мне нужна эта работа! [%s - %f]\n",
                    name, nameCompany, salary);
            this.salary = salary;
        }
        else {
            System.out.printf("Студент %s >>> Я найду работу получше! [%s - %f]\n",
                    name, nameCompany, salary);
        }
    }

    @Override
    public void receiveVacancy(Job vacancy) {
        if (this.salary < vacancy.getSalary()) {
            System.out.printf("Студент %s >>> Мне нужна эта работа! [%s - %s - %f]\n", name, vacancy.getPosition(),vacancy.getCompany(),vacancy.getSalary());
            this.salary = vacancy.getSalary();
        } else {
            System.out.printf("Студент %s >>> Я найду работу получше! [%s - %s - %f]\n", name, vacancy.getPosition(),vacancy.getCompany(),vacancy.getSalary());
        }
    }
}

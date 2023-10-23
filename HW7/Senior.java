package SEM_1.SEM_7.observer;

public class Senior implements Observer {

    private  String name;
    private double salary;

    public Senior(String name) {
        this.name = name;
        salary = 85000;
    }

    @Override
    public void receiveOffer(String companyName, double salary) {
        if (this.salary < salary){
            System.out.printf("Сеньор %s Мне нужна эта работа! [%s - %f]\n", name, companyName, salary);
            this.salary = salary;
        }
        else {
            System.out.printf("Сеньор %s Я найду работу получше! [%s - %f]\n", name, companyName, salary);
        }
    }

    @Override
    public void receiveVacancy(Job vacancy) {
        if (this.salary < vacancy.getSalary()) {
            System.out.printf("Сеньор %s Мне нужна эта работа! [%s - %s - %f]\n", name, vacancy.getPosition(),
                    vacancy.getCompany(),
                    vacancy.getSalary());
            this.salary = vacancy.getSalary();
        } else {
            System.out.printf("Сеньор %s Я найду работу получше! [%s - %s - %f]\n", name, vacancy.getPosition(),
                    vacancy.getCompany(),
                    vacancy.getSalary());
        }
    }

}package SEM_1.SEM_7.observer;

        import java.util.Random;

public class VacancyFactory implements JobFactory {

    private String name;
    private double maxSalary;
    private Random random;

    public VacancyFactory(String name, double maxSalary) {
        this.name = name;
        this.maxSalary = maxSalary;
        this.random = new Random();
    }

    @Override
    public Vacancy createVacancy(String position) {
        return new Vacancy(name,
                random.nextDouble(2000, maxSalary), position);
    }

}
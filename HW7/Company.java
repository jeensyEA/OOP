package SEM_1.SEM_7.observer;

import java.util.Random;

public class Company {

    private Random random = new Random();
    private String name;
    private double maxSalary;

    private Publisher jobAgency;
    private JobFactory jobFactory;

    public Company(String name, Publisher jobAgency, double maxSalary) {
        this.name = name;
        this.jobAgency = jobAgency;
        this.maxSalary = maxSalary;
        random = new Random();
        jobFactory = new VacancyFactory(name, maxSalary);
    }

    public Job createVacancy(String position) {
        Job vacancy = jobFactory.createVacancy(position);
        return vacancy;
    }

    public void needEmployee(){
        double salary = random.nextDouble(2000,maxSalary);
        jobAgency.sendOffer(name, salary);
    }


    public void needSpecialist(){

    }

}
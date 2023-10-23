package SEM_1.SEM_7.observer;


public abstract class Job {

    protected String company;
    protected double salary;
    protected String position;

    public Job(String company, double maxSalary, String position) {
        this.company = company;
        this.salary = maxSalary;
        this.position = position;
    }

    public abstract String getCompany();
    public abstract double getSalary();
    public abstract String getPosition();

}
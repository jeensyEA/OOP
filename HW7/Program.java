package SEM_1.SEM_7.observer;

public class Program {

    /**
     * TODO: Доработать приложение, которое разрабатывалось на семинаре, поработать с шаблоном проектирования Observer,
     *  добавить новый тип соискателя.
     *  Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *  Только после этого вы можете усложнить ваше приложение (при желании), например, добавить тип вакансии (enum),
     *  учитывать тип вакансии при отправке предложения соискателю.
     * @param args
     */
    public static void main(String[] args) {

        Publisher jobAgency = new JobAgency();
        Company google = new Company("Google", jobAgency, 120000);
        Company yandex = new Company("Yandex", jobAgency, 95000);
        Company geekBrains = new Company("GeekBrains", jobAgency, 98000);

        Student student1 = new Student("Petrov");
        Master master1 = new Master("Ivanov");
        Master master2 = new Master("Sidorov");
        Senior senior1 = new Senior("Cyrkov");

        jobAgency.registerObserver(student1);
        jobAgency.registerObserver(master1);
        jobAgency.registerObserver(master2);
        jobAgency.registerObserver(senior1);

        jobAgency.addVacancy(geekBrains.createVacancy("System Administrator"));
        jobAgency.addVacancy(geekBrains.createVacancy("Mobile Developer"));
        jobAgency.addVacancy(geekBrains.createVacancy("Software Developer"));

        jobAgency.addVacancy(google.createVacancy("Network Engineer"));
        jobAgency.addVacancy(google.createVacancy("Information Security Specialist"));
        jobAgency.addVacancy(google.createVacancy("Data Analyst"));

        jobAgency.addVacancy(yandex.createVacancy("Project Manager"));
        jobAgency.addVacancy(yandex.createVacancy("Web Developer"));
        jobAgency.addVacancy(yandex.createVacancy("Technical Writer"));

        jobAgency.notifyObservers();

    }

}
}

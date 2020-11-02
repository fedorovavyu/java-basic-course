public class Employee {
    private String fio;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee(String fio, String position, String email, String phoneNumber, int salary, int age){
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void showInfo(){
        System.out.println("ФИО: " + fio + ", Должность: " + position + ", email: " + email +
                ", Номер телефона: " + phoneNumber + ", Зарплата: " + salary + ", Возраст: " + age);
    }

    int getAge(){
        return age;
    }

}

public class Main {
    public static void main(String[] args) {
//        "Иванов Иван Иванович1", "Бизнес-аналитик", "1ivanovii@gmail.com", "+79852367896", 80000, 32
//        "Иванов Иван Иванович2", "Программист", "2ivanovii@gmail.com", "+79052767896", 110000, 28
//        "Иванов Иван Иванович3", "UX/UI дизайнер", "3ivanovii@gmail.com", "+79152367899", 100000, 37
//        "Иванов Иван Иванович4", "Менеджер проекта", "4ivanovii@gmail.com", "+79037736789", 120000, 48
//        "Иванов Иван Иванович5", "QA", "5ivanovii@gmail.com", "+79109953366", 90000, 52


        Employee[] employee = new Employee[5];
        employee[0] = new Employee("Иванов Иван Иванович", "Бизнес-аналитик", "ivanovii@gmail.com", "+79852367896", 80000, 32);
        employee[0].showInfo();
        System.out.println();
        employee[1] = new Employee("Иванов Иван Иванович2", "Программист", "2ivanovii@gmail.com", "+79052767896", 110000, 28);
        employee[1].showInfo();
        System.out.println();
        employee[2] = new Employee("Иванов Иван Иванович3", "UX/UI дизайнер", "3ivanovii@gmail.com", "+79152367899", 100000, 37);
        employee[2].showInfo();
        System.out.println();
        employee[3] = new Employee("Иванов Иван Иванович4", "Менеджер проекта", "4ivanovii@gmail.com", "+79037736789", 120000, 48);
        employee[3].showInfo();
        System.out.println();
        employee[4] = new Employee("Иванов Иван Иванович5", "QA", "5ivanovii@gmail.com", "+79109953366", 90000, 52);
        employee[4].showInfo();
        System.out.println();

        System.out.println("Сотрудники старше 40 лет:");
        for (Employee age : employee){
            if (age.getAge() > 40) age.showInfo();
        }

    }
}

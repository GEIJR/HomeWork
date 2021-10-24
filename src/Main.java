public class Main {
    public static void main(String[] args) {
        Employee FirstEmployee = new Employee("Борсуков Юрий Александрович", "Мастер участка", "master@mail.ru", "+79536581256", 65000, 42);
        Employee SecondEmployee = new Employee("Левкин Виктор Максимович", "Слесарь-ремонтник", "slecar@mail.ru", "+79568365462", 50000, 25);
        Employee FirthEmployee = new Employee("Сидоренко Светлана Ильинична", "Бухгалтер", "byh@mail.ru", "+ 79302568942", 54000, 35);
        Employee FourthEmployee = new Employee("Коршунов Алексей Андреевич", "Главный инженер", "enginer@mail.ru", "+79532562124", 150000, 40);
        Employee FifthEmployee = new Employee("Башина Виктория Валентиновна", "Менеджер", "manager@mail.ru", "+79352659845", 50000, 28);


        FirstEmployee.EmployeePrint();
        SecondEmployee.EmployeePrint();
        FirthEmployee.EmployeePrint();
        FourthEmployee.EmployeePrint();
        FifthEmployee.EmployeePrint();


        Employee[] EmpArray = new Employee[5];
        EmpArray[0] = new Employee("Борсуков Юрий Александрович", "Мастер участка", "master@mail.ru", "+79536581256", 65000, 42);
        EmpArray[1] = new Employee("Левкин Виктор Максимович", "Слесарь-ремонтник", "slecar@mail.ru", "+79568365462", 50000, 25);
        EmpArray[2] = new Employee("Сидоренко Светлана Ильинична", "Бухгалтер", "byh@mail.ru", "+ 79302568942", 54000, 35);
        EmpArray[3] = new Employee("Коршунов Алексей Андреевич", "Главный инженер", "enginer@mail.ru", "+79532562124", 150000, 40);
        EmpArray[4] = new Employee("Башина Виктория Валентиновна", "Менеджер", "manager@mail.ru", "+79352659845", 50000, 28);

        for (int i = 0; i < EmpArray.length; i++) {
            if (EmpArray[i].age > 40) EmpArray[i].print();
        }
    }
}

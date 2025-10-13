import java.util.*;

class EmployeesCounter {

    /**
     * Calculates the number of employees with salary >= threshold (only for 111- departments)
     *
     * @param departments are list of departments
     * @param threshold is lower edge of salary
     *
     * @return the number of employees
     */
    public static long calcNumberOfEmployees(List<Department> departments, long threshold) {
        return departments
                .stream()
                .filter(department -> department.getCode().startsWith("111-"))
                .flatMap(department -> 
                        department.getEmployees()
                                .stream()
                                .filter(employee -> employee.getSalary() >= threshold))
                .count();
    }

    // Don't change the code below
    static class Employee {
        private final String name;
        private final Long salary;

        Employee(String name, Long salary) {
            this.name = name;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public Long getSalary() {
            return salary;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", salary=" + salary +
                    '}';
        }
    }

    static class Department {
        private final String name;
        private final String code;
        private final List<Employee> employees;

        Department(String name, String code, List<Employee> employees) {
            this.name = name;
            this.code = code;
            this.employees = employees;
        }

        public String getName() {
            return name;
        }

        public String getCode() {
            return code;
        }

        public List<Employee> getEmployees() {
            return employees;
        }

        @Override
        public String toString() {
            return "Department{" +
                    "name='" + name + '\'' +
                    ", code='" + code + '\'' +
                    ", employees=" + employees +
                    '}';
        }
    }

//    public static void main(String[] args) {
//        // Создаем сотрудников
//        Employee emp1 = new Employee("Ivan", 2000L);
//        Employee emp2 = new Employee("Anna", 3500L);
//        Employee emp3 = new Employee("Petr", 1500L);
//        Employee emp4 = new Employee("Maria", 4000L);
//        Employee emp5 = new Employee("Oleg", 5000L);
//        Employee emp6 = new Employee("Svetlana", 1800L);
//
//        // Создаем департаменты
//        Department dep1 = new Department(
//                "IT",
//                "111-abc",
//                Arrays.asList(emp1, emp2, emp3)
//        );
//
//        Department dep2 = new Department(
//                "HR",
//                "111-def",
//                Arrays.asList(emp4, emp5)
//        );
//
//        Department dep3 = new Department(
//                "Sales",
//                "222-xyz",
//                Arrays.asList(emp6)
//        );
//
//        // Собираем все департаменты в список
//        List<Department> departments = Arrays.asList(dep1, dep2, dep3);
//
//        // Задаем порог ЗП
//        long threshold = 3000;
//
//        // Проверяем функцию
//        long result = calcNumberOfEmployees(departments, threshold);
//        System.out.println(result); // Ожидается: 3 (Anna, Maria, Oleg из департаментов, начинающихся на 111-)
//    }
}
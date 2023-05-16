public class Main {

    /*
    Aceasta clasa va reprezenta "Compania" noastra
     */
    public static void main(String[] args) {
	/*
	- Creati doua noi departamente (ex: IT si INDUSTRIAL)
    - Creati cativa angajati de ambele tipuri
    - Creati cateva proiecte
    - Adaugati angajati in fiecare proiect
    - Adaugati proiectele in departamente
    - Calculati costul total pentru fiecare departament
    - Sterge un angajat din toate departamentele
    - Afiseaza lista de skilluri ale fiecarui angajat
    - verifica daca toate skillurile necesare de pe un proiect sunt acoperite

    - folositi metodele de get si set pentru salarii, proiecte etc si recalculati cost

	 */
        Department department1 = new Department(1, "Department 1");
        Department department2 = new Department(2, "Department 2");

        // Create employees
        Employee employee1 = new Employee(1, "John", 5000, "5 years", "Manager", department1);
        Employee employee2 = new Employee(2, "Jane", 4000, "3 years", "Developer", department1);
        Employee employee3 = new Employee(3, "Bob", 6000, "7 years", "Senior Developer", department2);

        // Create projects
        Project project1 = new Project(1, "Project 1", 10000, "Project description 1", new String[]{"Java", "Spring"}, department1);
        Project project2 = new Project(2, "Project 2", 8000, "Project description 2", new String[]{"JavaScript", "React"}, department2);

        // Add employees to projects
        project1.addEmployee(employee1);
        project1.addEmployee(employee2);
        project2.addEmployee(employee3);

        // Add projects to departments
        department1.addProject(project1);
        department2.addProject(project2);

        // Test the functionality
        System.out.println(department1.getTotalCost()); // Output: 15000.0 (cost of project1)
        System.out.println(department2.getTotalCost()); // Output: 8000.0 (cost of project2)

        System.out.println(employee1.getDepartment()); // Output: Department 1
        System.out.println(employee2.getDepartment()); // Output: Department 1
        System.out.println(employee3.getDepartment()); // Output: Department 2

        System.out.println(employee1.print()); // Output: Angajatul are numele: John, salariu de 5000.0, vechime: 5 years, functie: Manager, proiecte: [Project 1]
        System.out.println(employee2.print()); // Output: Angajatul are numele: Jane, salariu de 4000.0, vechime: 3 years, functie: Developer, proiecte: [Project 1]
        System.out.println(employee3.print()); // Output: Angajatul are numele: Bob, salariu de 6000.0, vechime: 7 years, functie: Senior Developer, proiecte: [Project 2]
    }
}


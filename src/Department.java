import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Department {
      /*
    Adaugati urmatoarele atribute cu tipurile corespunzatoare
    - id -> identificator UNIC pentru fiecare departament
    - nume -> denumirea departamentului
    - proiecte ->un array cu proiectele din departament
     */
    public int id;
    public String name;
    public List<Project> projects;
    public Set<Employee> employees;
//    public Project project;

    public Department(int id, String name) {
    this.id = id;
    this.name = name;
    this.projects = new ArrayList<>();
    this.employees = new HashSet<>();
//    this.project = project;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addProject(Project project) {
        if (!projects.contains(project)) {
            projects.add(project);
            for (Employee employee : project.getEmployees()) {
                if (!employees.contains(employee)) {
                    employees.add(employee);
                    employee.addProject(project);
                }
            }
        }
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
        employee.setDepartment(this);
        for(Project project: projects){
            if(!employee.getProjects().contains(project)){
                employee.getProjects().add(project);
            }
        }
    }

    public double getTotalCost() {
        double totalCost = 0.0;
        for (Project project : projects) {
            totalCost += project.getCost();
        }
        for(Employee employee: employees){
            totalCost += employee.getSalary();
        }
        return totalCost;
    }

    public void removeEmployeeFromProjects(Employee employee){
        for(Project project: projects){
            employee.getProjects().remove(project);
        }
    }

    public int getUniqueEmployeeCount(){
        return employees.size();
    }
    /*
    Implementati urmatoarele metode METODE:
    - addProject(){
           - primeste un proiect si il adauga in lista de proiecte
           - ATENTIE: adauga si angajatii din acel proiect care nu sunt deja in departament
    }

    - calcTotalCost(){
        - calculeaza si returneaza costul total al departamentului
            -> acest cost reprezinta costul tuturor proiectelor din departament
    }

    - removeEmployee(){
        - sterge angajatul din toate proiectele din departament
    }

    -calAngajati(){
        - calculeaza numarul total de angajati
        - ATENTIE: un angajat care lucreaza pe mai multe proiecte nu trebuie numarat de mai multe ori
     */
}

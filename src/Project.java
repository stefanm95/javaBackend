import java.util.List;
import java.util.ArrayList;
public class Project {
    public int id;
    public String name;
    public double cost;
    public String description;
    public List<Employee> employees;
    public Department department;
    public String[] skills;

    public Project(int id, String name, double cost, String description, String[] skills, Department department){
        this.id = id;
        this.name= name;
        this.cost = cost;
        this.description = description;
        this.employees = new ArrayList<>();
        this.department = department;
        this.skills = skills;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public String getDescription() {
        return description;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public Department getDepartment() {
        return department;
    }

    public String[] getSkills() {
        return skills;
    }

    public void addEmployee(Employee employee){
        if(!employees.contains(employee)){
            employees.add(employee);
            employee.addProject(this);
        }
    }
    public void removeEmployee(Employee employee){
        employees.remove(employee);
        employee.removeProject(this);
    }
    public double calcCostTotal() {
        double totalCost = cost;
        for(Employee employee: employees){
            totalCost += employee.getSalary();
        }
        return totalCost;
    }
    /*
    Adaugati urmatoarele atribute cu tipurile corespunzatoare
    - id -> identificator UNIC pentru fiecare proiect
    - alteCosturi -> costul proiectului, mai putin salariu angajatilor
    - nume -> denumirea proiectului
    - descriere -> mai multe informatii despre proiect
    - angajati -> un array cu angajatii implicati in proiect
    - departament -> departamentul din care face parte
    - skills -> array de skilluri necesare pe proiect
     */

        /*
    Adaugati Constructor care seteaza campurile id, nume, alteCosturi, descriere
    Adaugati metode de setare informatii pentru toate, mai putin ID
    Adaugati metode de preluare(get) de informatii
     */


    /*
    Adaugati urmatoarele metode:
    - addEmployee(){
        - primeste un angajat si il adauga pe proiect
        - adauga proiectul la arrayul de proiecte al angajatului
        }

    - calcCostTotal(){
        - metoda care calculeaza si intoarce cost total
        cost total = alteCosturi + salarii lunare angajati
        ATENTIE: daca un angajat lucreaza pe mai multe proiecte se va presupune ca si cost per proiect doar partea corespunzatoare a salariului:
            ex: 12000 salariu si lucreaza pe 3 proiecte => cost proiect cu angajatul = 4000 ron
     }

     - print(){
        - afiseaza informatiile despre proiect
     }

     -checkSkills(){
      - returneaza un boolean care spune daca inginerii care lucreaza la proiect au skillurile necesare impreuna
     */
}

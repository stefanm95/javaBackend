import java.util.ArrayList;
import java.util.List;

public class Employee {
    public int id;
    public String name;
    public double salary;
    public String vechime;
    public String functie;
    public List<Project> projects;
    public Department department;

    public Employee(int id, String name, double salary, String vechime, String functie, Department department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.vechime = vechime;
        this.functie = functie;
        this.projects = new ArrayList<>();
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setSalariu(int salariu) {
        this.salary = salary;
    }

    public void setVechime(String vechime) {
        this.vechime = vechime;
    }

    public void setFunctie(String functie) {
        this.functie = functie;
    }

    public List<Project> getProjects(){
        return projects;
    }
    public void addProject(Project project){
        if(!projects.contains(project)){
            projects.add(project);
            project.addEmployee(this);
        }
    }
    public void removeProject(Project project) {
        projects.remove(project);
        project.removeEmployee(this);
    }

    public String getDepartment(){
        if(department != null){
            return department.getName();
        }
        return null;
    }
    public String print(){
        StringBuilder projectNames = new StringBuilder();
        for (Project project : projects) {
            projectNames.append(project.getName()).append(", ");
        }
        if (projectNames.length() > 0) {
            projectNames.delete(projectNames.length() - 2, projectNames.length());
        }
        return "Angajatul are numele: " + name + ", salariu de " + salary + ", vechime: " + vechime + ", functie: " + functie + ", proiecte: " + projectNames.toString();
    }
}

    /*
    Adaugati urmatoarele campuri cu tipurile aferente:
        - id -> identificator UNIC pentru fiecare angajat
        - nume -> numele si prenumele angajatului
        - salariu -> venitul angajatului
        - vechime -> numarul cu ani de cand este in firma
        - functie -> ce functie are (ex: programator ajutor)
        - proiecte -> array cu proiectele in care este alocat
     */

    /*
    Adaugati Constructor care seteaza campurile id, nume, salariu, vechime si functie
    Adaugati metode de setare informatii pentru toate, mai putin ID
     */

    /*
    Adaugati metodele urmatoarele:
    - getDepartment(){
        - intoarce un string cu numele departamentului din care face parte angajatul
        - in cazul in care face parte din proiecte din mai multe departamente => intoarce un string cu toate numele de departamente
        }

    -print(){
     - nu primeste nimic si afiseaza informatiile despre angajat
     - ATENTIE: metoda trebuie suprascrisa in fiecare tip de angajat
    }
     */


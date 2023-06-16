import Exercice1.Employee;
import Exercice1.EmployeeManager;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class EmployeeManagerTest {

    @Test
    public void CalculSalaireJuniorPour1An() {
        // Crée un employé avec 1 an d'expérience
        Employee employee = new Employee("Michel", "Robert", 1, "Junior");
        EmployeeManager employeeManager = new EmployeeManager();

        double expectedSalary = 20000 * employeeManager.calculateExperience(1);
        double actualSalary = employeeManager.calculateSalary(employee);

        assertEquals(expectedSalary, actualSalary, 0.01);
    }

    public void CalculSalaireJuniorPour5An() {
        // Crée un employé avec 5 ans d'expérience
        Employee employee = new Employee("Denis", "B", 5, "Junior");
        EmployeeManager employeeManager = new EmployeeManager();

        double expectedSalary = 40000 * employeeManager.calculateExperience(5);
        double actualSalary = employeeManager.calculateSalary(employee);

        assertEquals(expectedSalary, actualSalary, 0.01);
    }

    public void CalculSalaireJuniorPour10An() {
        // Crée un employé avec 10 ans d'expérience
        Employee employee = new Employee("Louis", "D", 10, "Junior");
        EmployeeManager employeeManager = new EmployeeManager();

        double expectedSalary = 60000 * employeeManager.calculateExperience(10);
        double actualSalary = employeeManager.calculateSalary(employee);

        assertEquals(expectedSalary, actualSalary, 0.01);
    }

    public void CalculSalaireJuniorPour20An() {
        // Crée un employé avec 60 ans d'expérience
        Employee employee = new Employee("Emmanuel", "C", 20, "Junior");
        EmployeeManager employeeManager = new EmployeeManager();

        double expectedSalary = 60000 * employeeManager.calculateExperience(20);
        double actualSalary = employeeManager.calculateSalary(employee);

        assertEquals(expectedSalary, actualSalary, 0.01);
    }

    public void CalculSalaireEtExperienceInconnus() {
        // Crée un employé avec un niveau inconnu et 0 année d'expérience
        Employee employee = new Employee("Alice", "A", 0, "Inconnu");
        EmployeeManager employeeManager = new EmployeeManager();

        try {
            // Appelle la méthode pour calculer le salaire
            employeeManager.calculateSalary(employee);
            assertEquals(true, false);
        } catch (IllegalArgumentException e) {
            assertEquals("Niveau d'expérience invalide : Inconnu", e.getMessage());
        }
    }

}

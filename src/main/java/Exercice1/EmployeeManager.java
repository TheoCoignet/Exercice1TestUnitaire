package Exercice1;

/**
 * Gère les opérations liées aux employés.
 */
public class EmployeeManager {

    /**
     * Calcule le salaire d'un employé en fonction de son niveau d'expérience.
     */
    public double calculateSalary(Employee employee) {
        double baseSalary;
        /** Sélectionne le salaire de base en fonction du niveau d'expérience */
        switch (employee.getLevel()) {
            case "Junior":
                baseSalary = 20000;
                break;
            case "Intermédiaire":
                baseSalary = 40000;
                break;
            case "Senior":
                baseSalary = 60000;
                break;
            default:
                throw new IllegalArgumentException("Niveau d'expérience invalide :" + employee.getLevel());
        }
        // Calcule le coefficient d'ancienneté en fonction des années d'expérience
        double experienceMultiplier = calculateExperience(employee.getExperience());

        // Calcule le salaire final en multipliant le salaire de base par le coefficient d'ancienneté
        return baseSalary * experienceMultiplier;
    }
/**
 * Calcule le coefficient d'ancienneté en fonction des années d'expérience.
 * Le coefficient d'ancienneté augmente de 5% par année d'expérience. */
    public double calculateExperience(int experience) {
        if (experience < 0) {
            throw new IllegalArgumentException("Le nombre d'années d'expérience ne peut pas être négatif");
        }
        // Calcule le coefficient d'ancienneté en augmentant de 5% par année d'expérience
        double experienceMultiplier = 1.0;
        for (int i =0; i < experience; i++) {
            experienceMultiplier += 0.05;
        }

        return experienceMultiplier;
    }
}

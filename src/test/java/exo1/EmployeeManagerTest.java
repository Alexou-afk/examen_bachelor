package exo1;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

/**
 * Classe de test pour la classe EmployeeManager.
 */
public class EmployeeManagerTest {
    private EmployeeManager employeeManager = new EmployeeManager();

    /**
     * Teste le calcul du salaire pour un employé de niveau Junior avec 1 an d'expérience.
     */
    @Test
    public void testCalculateSalaryJunior1AnneeExperience() {
        Employee employee = new Employee("Toto", "1", 1, "Junior");
        double expectedSalary = 21000.0;
        double actualSalary = employeeManager.calculateSalary(employee);
        assertEquals(expectedSalary, actualSalary, 0.001);
    }

    /**
     * Teste le calcul du salaire pour un employé de niveau Intermédiaire avec 5 ans d'expérience.
     */
    @Test
    public void testCalculateSalaryIntermediaire5AnneeExperience() {
        Employee employee = new Employee("Toto", "2", 5, "Intermediate");
        double expectedSalary = 50000.0;
        double actualSalary = employeeManager.calculateSalary(employee);
        assertEquals(expectedSalary, actualSalary, 0.001);
    }

    /**
     * Teste le calcul du salaire pour un employé de niveau Senior avec 10 ans d'expérience.
     */
    @Test
    public void testCalculateSalarySenior10AnneeExperience() {
        Employee employee = new Employee("Toto", "3", 10, "Senior");
        double expectedSalary = 90000.0;
        double actualSalary = employeeManager.calculateSalary(employee);
        assertEquals(expectedSalary, actualSalary, 0.001);
    }

    /**
     * Teste le calcul du salaire pour un employé de niveau Senior avec 20 ans d'expérience.
     */
    @Test
    public void testCalculateSalarySenior20AnneeExperience() {
        Employee employee = new Employee("Toto", "4", 20, "Senior");
        double expectedSalary = 120000.0;
        double actualSalary = employeeManager.calculateSalary(employee);
        assertEquals(expectedSalary, actualSalary, 0.001);
    }

    /**
     * Teste le calcul du coefficient d'ancienneté pour un certain nombre d'années d'expérience.
     */
    @Test
    public void CalculateExperienceMultiplier3AnneeExperience() {
        int annee_experience = 3;
        double expectedMultiplier = 1.15;
        double actualMultiplier = employeeManager.calculateExperienceMultiplier(annee_experience);
        assertEquals(expectedMultiplier, actualMultiplier, 0.001);
    }
}

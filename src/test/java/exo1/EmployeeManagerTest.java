package exo1;


import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class EmployeeManagerTest {
    private EmployeeManager employeeManager = new EmployeeManager();

    @Test
    public void testCalculateSalaryJunior1AnneeExperience() {
        Employee employee = new Employee("Toto", "1", 1, "Junior");
        double expectedSalary = 21000.0;
        double actualSalary = employeeManager.calculateSalary(employee);
        assertEquals(expectedSalary, actualSalary, 0.001);
    }

    @Test
    public void testCalculateSalaryIntermediaire5AnneeExperience() {
        Employee employee = new Employee("Toto", "2", 5, "Intermediate");
        double expectedSalary = 50000.0;
        double actualSalary = employeeManager.calculateSalary(employee);
        assertEquals(expectedSalary, actualSalary, 0.001);
    }

    @Test
    public void testCalculateSalarySenior10AnneeExperience() {
        Employee employee = new Employee("Toto", "3", 10, "Senior");
        double expectedSalary = 90000.0;
        double actualSalary = employeeManager.calculateSalary(employee);
        assertEquals(expectedSalary, actualSalary, 0.001);
    }

    @Test
    public void testCalculateSalarySenior20AnneeExperience() {
        Employee employee = new Employee("Toto", "4", 20, "Senior");
        double expectedSalary = 120000.0;
        double actualSalary = employeeManager.calculateSalary(employee);
        assertEquals(expectedSalary, actualSalary, 0.001);
    }

    @Test
    public void CalculateExperienceMultiplier3AnneeExperience() {
        int yearsOfExperience = 3;
        double expectedMultiplier = 1.15;
        double actualMultiplier = employeeManager.calculateExperienceMultiplier(yearsOfExperience);
        assertEquals(expectedMultiplier, actualMultiplier, 0.001);
    }

}


package exo1;

public class EmployeeManager {
    public double calculateSalary(Employee employee) {
        double baseSalary;

        switch (employee.getNiveau()) {
            case "Junior":
                baseSalary = 20000.0;
                break;
            case "Intermediate":
                baseSalary = 40000.0;
                break;
            case "Senior":
                baseSalary = 60000.0;
                break;
            default:
                throw new IllegalArgumentException("Niveau d'employé invalide : " + employee.getNiveau());
        }

        double experienceMultiplier = calculateExperienceMultiplier(employee.getAnnee_experience());

        return baseSalary * experienceMultiplier;
    }


    public double calculateExperienceMultiplier(int annee_experience) {
        if (annee_experience < 0) {
            throw new IllegalArgumentException("Le nombre d'années d'expérience ne peut pas être négatif.");
        }

        double baseMultiplier = 1.0;
        double experiencePercentage = 0.05; // 5% d'augmentation par année d'expérience

        double experienceMultiplier = baseMultiplier + (experiencePercentage * annee_experience);
        return experienceMultiplier;
    }


    private double getNiveauMultiplier(String niveau) {
        if (niveau.equalsIgnoreCase("Junior")) {
            return 1.0;
        } else if (niveau.equalsIgnoreCase("Intermédiaire")) {
            return 1.2;
        } else if (niveau.equalsIgnoreCase("Senior")) {
            return 1.5;
        } else {
            throw new IllegalArgumentException("Niveau invalide : " + niveau);
        }
    }
}


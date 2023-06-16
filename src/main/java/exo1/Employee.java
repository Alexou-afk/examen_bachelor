package exo1;

public class Employee {
    private String prenom;
    private String nom;
    private int annee_experience;
    private String niveau;

    /**
     * setter and getter
     */

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAnnee_experience(int annee_experience) {
        this.annee_experience = annee_experience;
    }
    public int getAnnee_experience() {
        return annee_experience;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    /**
     * constructor
     * @param prenom
     * @param nom
     * @param annee_experience
     * @param niveau
     */
    public Employee(String prenom, String nom, int annee_experience, String niveau) {
        this.prenom = prenom;
        this.nom = nom;
        this.annee_experience = annee_experience;
        this.niveau = niveau;
    }


}


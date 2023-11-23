public class Employer implements Comparable<Employer>{
    int identifiant,grade;
    String nom,prenom,nom_department;

    public Employer() {
    }

    public Employer(int identifiant, int grade, String nom, String prenom, String nom_department) {
        this.identifiant = identifiant;
        this.grade = grade;
        this.nom = nom;
        this.prenom = prenom;
        this.nom_department = nom_department;
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public int getGrade() {
        return grade;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom_department() {
        return nom_department;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNom_department(String nom_department) {
        this.nom_department = nom_department;
    }

    @Override
    public String
    toString() {
        return "Employer{" +
                "identifiant=" + identifiant +
                ", grade=" + grade +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nom_department='" + nom_department + '\'' +
                '}';
    }
    public boolean equals(Object o){
        if(o==null) return false;
        if (o== this) return true;
        if(o instanceof Employer e){
            return e.identifiant==identifiant && e.nom.equals(nom);

        }
        return false;
    }

    @Override
    public int compareTo(Employer o) {

        return this.identifiant-o.identifiant;
    }
}

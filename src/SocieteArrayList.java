import java.util.*;

public class SocieteArrayList implements IGestion<Employer>{

    List<Employer> employers=new ArrayList<>();
    @Override
    public void ajouterEmploye(Employer employer) {
        employers.add(employer);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employer e: employers)
        { if (e.nom.equals(nom))
            {return true;}
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employer employer) {

        return employers.contains(employer);
    }

    @Override
    public void supprimerEmploye(Employer employer) {

        employers.remove(employer);
    }

    @Override
    public void displayEmploye() {
        for( Employer e: employers)
        {System.out.println(e);}
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(employers);

    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        Comparator<Employer> compNom = new Comparator<Employer>() {
            @Override
            public int compare(Employer o1, Employer o2) {
                return o1.nom_department.compareTo(o2.nom_department);
            }

        };

        Comparator<Employer> compGrade = new Comparator<Employer>() {
            @Override
            public int compare(Employer o1, Employer o2) {
                return o1.grade-o2.grade;
            }

        };
        Collections.sort(employers,compNom.thenComparing(compGrade));

    }
}

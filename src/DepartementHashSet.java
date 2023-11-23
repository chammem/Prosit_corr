import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartement<Departement> {

    Set<Departement> myhashset = new HashSet<>();

    @Override
    public void ajouterDepartement(Departement departement) {
        myhashset.add(departement);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for (Departement d: myhashset){
            if(d.nomdep.equals(nom)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {
        return myhashset.contains(departement);
    }

    @Override
    public void supprimerDepartement(Departement departement) {
        myhashset.remove(departement);
    }

    @Override
    public void displayDepartement() {
        Iterator<Departement> it = myhashset.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }

    @Override
    public TreeSet<Departement> trierDepartementById() {

        return new TreeSet<Departement>(myhashset);
    }
}

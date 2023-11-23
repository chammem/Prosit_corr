import java.util.Objects;

public class Departement implements Comparable<Departement> {
    public int id;
    public String nomdep;
    public int nbE;

    public Departement(int id, String nomdep, int nbE) {
        this.id = id;
        this.nomdep = nomdep;
        this.nbE = nbE;
    }

    @Override
    public String toString() {
        return "departement{" +
                "id=" + id +
                ", nomdep='" + nomdep + '\'' +
                ", nbE=" + nbE +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if ((o instanceof Departement d)) {
            return nomdep.equals(d.nomdep) && nbE == d.nbE && id == d.id;
        }
        return  false;
    }



    @Override
    public int hashCode() {
        int res=17;
        res=19*res+id;
        res=19*res+nbE;
        res=19*res+nomdep.hashCode();
        return  res ;

    }

    @Override
    public int compareTo(Departement o) {
        return this.id-o.id;
    }
}

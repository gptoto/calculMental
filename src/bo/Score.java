package bo;

public class Score {

    private int id;
    private float nbBonnesRep;

    public Score(){}

    public Score(int id, float nbBonnesRep) {
        this.id = id;
        this.nbBonnesRep = nbBonnesRep;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getNbBonnesRep() {
        return nbBonnesRep;
    }

    public void setNbBonnesRep(float nbBonnesRep) {
        this.nbBonnesRep = nbBonnesRep;
    }
}

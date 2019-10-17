package bo;

public class Joueur {

    private int id;
    private String login;
    private String password;
    private String nom;
    private String prenom;
    private String pseudo;
    private float meilleurScore;

    public Joueur(){}

    public Joueur(int id, String login, String password, String nom, String prenom, String pseudo, float meilleurScore) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.nom = nom;
        this.prenom = prenom;
        this.pseudo = pseudo;
        this.meilleurScore = meilleurScore;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public float getmeilleurScore() {
        return meilleurScore;
    }

    public void setmeilleurScore(float meilleurScore) {
        this.meilleurScore = meilleurScore;
    }
}

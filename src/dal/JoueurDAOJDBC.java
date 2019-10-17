package dal;

import bo.Joueur;

import java.sql.*;
import java.util.List;

public class JoueurDAOJDBC extends DataAccessObjectJDBC<Joueur> {

    private static final String AUTHENT_QUERY = "SELECT * FROM joueur WHERE login = ? AND password = ?";

    public JoueurDAOJDBC(String DB_URL, String DB_LOGIN, String DB_PWD) {
        super(DB_URL, DB_LOGIN, DB_PWD);
    }

    @Override
    public void create(Joueur object){}

    @Override
    public List<Joueur> findAll(){
        return null;
    }

    public Joueur authenticate(String login, String password) throws SQLException {

        Joueur joueur = null;

        try (Connection connection = DriverManager.getConnection(dbUrl, dbLogin, dbPwd);
             PreparedStatement ps = connection.prepareStatement(AUTHENT_QUERY)){

            ps.setString(1, login);
            ps.setString(2, password);
            try (ResultSet rs = ps.executeQuery()){
                if(rs.next()){
                    joueur = new Joueur();
                    joueur.setLogin(rs.getString("login"));
                    joueur.setPassword(rs.getString("password"));
                }
            }

        }
        return null;
    }


}

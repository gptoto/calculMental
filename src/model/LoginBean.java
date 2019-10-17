package model;

import bo.Joueur;
import dal.DAOFactory;
import dal.JoueurDAOJDBC;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.Serializable;
import java.sql.SQLException;

public class LoginBean implements Serializable {

    private static final String FORM_FIELD_LOGIN = "form-login";
    private static final String FORM_FIELD_PWD = "form-pwd";
    public static final String ATT_AUTH_SESSION = "isConnected";

    private String login;
    private String pwd;
    private String authentResult;

    public LoginBean() {}

    public void authenticate( HttpServletRequest request ) {

        login = request.getParameter( FORM_FIELD_LOGIN );
        pwd = request.getParameter( FORM_FIELD_PWD );
        JoueurDAOJDBC dao = (JoueurDAOJDBC) DAOFactory.getJoueurDAO();
        Joueur joueur = null;
        try {
            joueur = dao.authenticate(login, pwd);

            if ( joueur != null) {
                HttpSession session = request.getSession( true );
                //TODO récupération et incrémentation du nombre de connexions
                session.setAttribute( ATT_AUTH_SESSION, joueur );
                authentResult = "Authentification réussie : Bienvenue "+ login;
            } else {
                authentResult = "Authentification échouée"+ login;
            }
        } catch (SQLException e) {
            authentResult = "Authentification échouée : Problème de connexion à la base";
        }
    }

    public boolean isConnected( HttpServletRequest request ) {
        HttpSession session = request.getSession();
        Joueur connectedJoueur = ( Joueur ) session.getAttribute( ATT_AUTH_SESSION );
        return connectedJoueur != null;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin( String login ) {
        this.login = login;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd( String pwd ) {
        this.pwd = pwd;
    }

    public String getAuthentResult() {
        return authentResult;
    }

    public void setAuthentResult( String authentResult ) {
        this.authentResult = authentResult;
    }
}

package dal;

public abstract class DataAccessObjectJDBC<E> implements IDAO<E>{

    protected String dbUrl = "";
    protected String dbLogin = "";
    protected String dbPwd = "";

    public DataAccessObjectJDBC(String DB_URL, String DB_LOGIN, String DB_PWD) {
        this.dbUrl = DB_URL;
        this.dbLogin = DB_LOGIN;
        this.dbPwd = DB_PWD;
    }

}

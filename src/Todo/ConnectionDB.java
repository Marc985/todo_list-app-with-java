package Todo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    private static ConnectionDB instance;
    private String userName;
    private String password;
    private String databaseName;
    private Connection connection;



    private ConnectionDB(String userName, String password, String databaseName) {
        this.userName = userName;
        this.password = password;
        this.databaseName = databaseName;

        createConnection();


    }


    public  static   ConnectionDB getInstance(String userName,String password,String databaseName){
        if(instance==null){
            instance=new ConnectionDB(userName,password,databaseName);
        }
        return  instance;
    }

    private void createConnection() {
        try{


            this.connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost/" + this.databaseName,
                    this.userName,
                    this.password
            );


        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public Connection getConnection() {
        return connection;
    }

    public static void main(String[] args) {

    }
}

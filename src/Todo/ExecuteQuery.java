package Todo;

import java.sql.Statement;

public class ExecuteQuery {

    private ConnectionDB connectiondb;
    private Statement statement;

    public ExecuteQuery() {
        createStmt();
    }

    private void createStmt(){
        try{
            String password=System.getenv("db_password");
            connectiondb=ConnectionDB.getInstance("postgres",password,"todo_list");
            statement=this.connectiondb.getConnection().createStatement();

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }



    public Statement getStatement() {
        return statement;
    }
}

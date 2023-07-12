package Todo;

import java.sql.Statement;

public class ExecuteQuery {
    private static ExecuteQuery instance;
    private ConnectionDB connectiondb;
    private Statement statement;

    private  ExecuteQuery(ConnectionDB connectiondb) {
        this.connectiondb = connectiondb;
        createStmt();
    }
    private void createStmt(){
        try{
            statement=this.connectiondb.getConnection().createStatement();

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static ExecuteQuery getInstanceExecution(ConnectionDB connectiondb){
        if(instance==null)
            instance=new ExecuteQuery(connectiondb);
        return instance;
    }

    public Statement getStatement() {
        return statement;
    }
}

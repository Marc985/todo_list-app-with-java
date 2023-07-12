package Todo;

public class task {
    //COnnection to postgresql



    //Create statment


        String password=System.getenv("db_password");
        ConnectionDB conn=ConnectionDB.getInstance("postgres",password,"todo_list");
        ExecuteQuery stat=ExecuteQuery.getInstanceExecution(conn);
     public  void taskInsert(){
         try{
             String insert="insert into task values (1,'faire qqch','2023-09-12')";
             stat.getStatement().executeUpdate(insert);
             System.out.println("insertion fait avec succes");
         }
         catch (Exception e){
             e.printStackTrace();
         }
     }

}

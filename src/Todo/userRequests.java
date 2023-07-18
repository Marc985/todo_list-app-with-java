package Todo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class userRequests {

    ExecuteQuery stat=new ExecuteQuery();

    //insert a task
    public void insertTask(String description,String deadline){
      try{

          String insert="insert into task (description,deadline) values ('"+description+"','"+deadline+"')";
          stat.getStatement().executeUpdate(insert);
          System.out.println("tache ajouter avec succes");
      }
      catch (SQLException e){
          e.printStackTrace();
      }
    }
    //select all task
    public List<task>  allTask(){
       task tache;
       List<task> tacheList=new ArrayList<>();
        try{
            String select="select id,description,deadline from task";
            ResultSet result=stat.getStatement().executeQuery(select);
            while (result.next()){

                String desc=result.getString("description");
                String deadline=result.getString("deadline");
                tache=new task(desc,deadline);
                tacheList.add(tache);
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }
        return tacheList;
    }
public  void  updateTask(String desc,int task_id){
        try {
            String update="update task set description='"+desc+"' where id="+task_id;
            stat.getStatement().executeUpdate(update);
        }
        catch (Exception e){
            e.printStackTrace();
        }
}
public void updateDeadline(String date,int task_id){
    try {
        String update="update task set description='"+date+"' where id="+task_id;
        stat.getStatement().executeUpdate(update);

    }
    catch (Exception e){
        e.printStackTrace();
    }
}
public  void deleteTask(int id){
        try{
            String delete="delete from task where id="+id;
            stat.getStatement().executeUpdate(delete);
        }
        catch (Exception e){
            e.printStackTrace();
        }


}
    public static void main(String[] args) {
        userRequests user=new userRequests();
        System.out.println( user.allTask());
    }
}

package Todo;

import java.util.Scanner;

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

    public static void main(String[] args) {
         int i = 0;
        while (i < 2){
            System.out.println("_________________________");
            System.out.println(" Que voulez-vous faire ");
            System.out.println("_________________________");
            System.out.println("1 : voire les tâche à faire");
            System.out.println("2 : ajouter une tâche");
            System.out.println("3 : mettre à jour une tâche");
            System.out.println("4 : supprimer une tâche");
            System.out.println("5 : quitter");
            System.out.println("_________________________");
            Scanner scanner = new Scanner(System.in);
            System.out.println("inserer votre choix : ");
            int choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix){
                case 1 : {

                }
                case 2 : {

                }
                case 3 : {

                }
                case 4 : {

                }
                case 5 :{
                    System.out.println("quitter l'application");
                    break;
                }

            }
        }
    }
}

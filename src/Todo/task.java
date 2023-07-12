package Todo;

import java.util.Scanner;

public class task {
    //COnnection to postgresql


String description;
String date;

    public task(String description, String date) {
        this.description = description;
        this.date = date;

    }

    @Override
    public String toString() {
        return "todo'" + description + '\'' +
                ",deadline'" + date + '\'';
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

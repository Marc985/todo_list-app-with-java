package Todo;

import java.util.Scanner;

public class UserTask {
    public static void choice() {
        Scanner scanner = new Scanner(System.in);
        Boolean a = true;
        userRequests user = new userRequests();
        while (a) {
            System.out.println("_________________________");
            System.out.println(" Que voulez-vous faire ");
            System.out.println("_________________________");
            System.out.println("1 : voire les tâche à faire");
            System.out.println("2 : ajouter une tâche");
            System.out.println("3 : mettre à jour une tâche");
            System.out.println("4 : supprimer une tâche");
            System.out.println("5 : quitter");
            System.out.println("_________________________");

            System.out.println("inserer votre choix : ");
            int choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:
                    System.out.println("voici la liste des taches à faire");
                    System.out.println(user.allTask());
                    break;

                case 2:
                    System.out.println("la tache que vous voulez ajouter:");
                    String task = scanner.nextLine();
                    System.out.println("le delais de cette tache:");
                    String date = scanner.nextLine();
                    user.insertTask(task, date);
                    break;
                case 3:
                    System.out.println("vous souhaitez mettre à jour une tache ou le deadline?");
                    String response = scanner.nextLine();
                    if (response.equals("tache")) {
                        System.out.println("vous voulez mettre à jour la tache numero:");
                        int num = scanner.nextInt();
                        System.out.println("Votre mis à jour:");
                        String update = scanner.nextLine();
                        user.updateTask(update, num);

                    }
                    if (response.equals("deadline")) {
                        System.out.println("vous voulez mettre à jour le deadline dans la tache numero:");
                        int num = scanner.nextInt();
                        System.out.println("Votre mis à jour:");
                        String update = scanner.nextLine();
                        user.updateDeadline(update, num);
                    }
                    break;
                case 4:
                    System.out.println("vous voulez supprimer la tache numero:");
                    int num = scanner.nextInt();
                    user.deleteTask(num);
                    break;
                case 5:
                    a = false;

            }

        }

    }

    public static void main(String[] args) {
        choice();
    }
}
//Выполнение задания после 5 урока
//Крыгин СС

package geekbrains.vido;

public class Main {

    public static void main(String[] args) {
        Collaborator[] collaboratorArray = new Collaborator[5];
        collaboratorArray[0] = new Collaborator("Ivanov Ivan", "Engineer", "IvanovIvan@mailbox.com", "892312312", 30000, 45);
        collaboratorArray[1] = new Collaborator("Petrov Ivan", "ICO", "PetrovIvan@mailbox.com", "892321548", 300000, 42);
        collaboratorArray[2] = new Collaborator("Ivanov Peter", "Programmer", "IvanovPeter@mailbox.com", "892315987", 50000, 25);
        collaboratorArray[3] = new Collaborator("Sidorov Ivan", "HR", "SidorovIvan@mailbox.com", "892316482", 25000, 27);
        collaboratorArray[4] = new Collaborator("Sidorov Peter", "BigMen", "SidorovPeter@mailbox.com", "892311111", 1000000, 35);

        for (Collaborator collaborator: collaboratorArray) {
            if (collaborator.getAge() > 40) {
                collaborator.info();
            }
        }

        for (Collaborator collaborator: collaboratorArray) {
            if (collaborator.getAge() < 40) {
                collaborator.info();
            }
        }


    }
}

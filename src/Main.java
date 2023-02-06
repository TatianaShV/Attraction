import java.util.*;

public class Main {
    public static List<Person> generateClients() {
        List<Person> clients = new ArrayList<>();
        clients.add(new Person("Chupin", "Petya", 5));
        clients.add(new Person("Svatko", "Vita", 1));
        clients.add(new Person("Melnikov", "Vova", 3));
        clients.add(new Person("Gayle", "Yulya", 4));
        clients.add(new Person("Ivanova", "Liza", 2));
        return clients;
    }

    public static void main(String[] args) {
        Deque<Person> queue = new LinkedList<>();
        queue.addAll(generateClients());
        while (!queue.isEmpty()) {
            Person client = queue.poll();
            int clientTickets = client.getCountOfTickets() - 1;
            System.out.println(client.getSurname() + " " + client.getName() + " прокатился/прокатилась на аттракционе. Осталось " + clientTickets);
            if (clientTickets > 0) {
                queue.add(client);
                client.setCountOfTickets(clientTickets);
            }
        }
    }
}

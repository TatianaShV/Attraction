public class Person {
    protected String name;
    protected String surname;
    protected int countOfTickets;

    public Person(String surname, String name, int countOfTickets) {
        this.surname = surname;
        this.name = name;
        this.countOfTickets = countOfTickets;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getCountOfTickets() {
        return countOfTickets;
    }

    public void setCountOfTickets(int countOfTickets) {
        this.countOfTickets = countOfTickets;
    }
}

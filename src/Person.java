import java.util.Arrays;
import java.util.Objects;

public class Person {
    private String name;
    private String surname;
    private String[] phones;
    private String[] sites;
    private Adress address;

    public Person() {
    }

    public Person(String name, String surname, String[] phones, String[] sites, Adress address) {
        this.name = name;
        this.surname = surname;
        this.phones = phones;
        this.sites = sites;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String[] getPhones() {
        return phones;
    }

    public void setPhones(String[] phones) {
        this.phones = phones;
    }

    public String[] getsites() {
        return sites;
    }

    public void setsites(String[] sites) {
        this.sites = sites;
    }

    public Adress getAdress() {
        return address;
    }

    public void setAdress(Adress adress) {
        this.address = adress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(surname, person.surname) &&
                Arrays.equals(phones, person.phones) &&
                Arrays.equals(sites, person.sites) &&
                Objects.equals(address, person.address);
    }

    @Override
    public int hashCode() {

        int result = Objects.hash(name, surname, address);
        result = 31 * result + Arrays.hashCode(phones);
        result = 31 * result + Arrays.hashCode(sites);
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phones=" + Arrays.toString(phones) +
                ", sites=" + Arrays.toString(sites) +
                ", adress='" + address + '\'' +
                '}';
    }
}

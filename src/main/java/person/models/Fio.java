package person.models;

public class Fio {
    private String lastName;
    private String firstName;
    private String middleName;

    public Fio(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(lastName).append("\n")
                .append(firstName).append("\n")
                .append(middleName)
                .toString();

    }
}

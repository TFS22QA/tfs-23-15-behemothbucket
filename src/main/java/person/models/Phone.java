package person.models;

public class Phone extends PersonParameters {

    private final String number;

    public Phone(final String number) {
        this.number = number;
    }

    @Override
    public final String toString() {
        return "Phone:\t" + number;
    }
}

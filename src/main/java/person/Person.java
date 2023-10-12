package person;

import person.models.Fio;
import person.models.Phone;
import person.models.Physical;
import person.models.appearance.Appearance;

public class Person {

    private String id;
    private Fio fio;
    private Physical phys;
    private Appearance appearance;
    private Phone phone;


    public Person(String id, Fio fio,
                  Physical phys, Appearance appearance) {
        this.id = id;
        this.fio = fio;
        this.phys = phys;
        this.appearance = appearance;

    }

    public Person setPhone(Phone phone) {
        this.phone = phone;
        return this;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        return stringBuilder
                .append(id).append("\n")
                .append(fio).append("\n")
                .append(phys).append("\n")
                .append(appearance).append("\n")
                .append(phone).append("\n")
                .toString();
    }


}

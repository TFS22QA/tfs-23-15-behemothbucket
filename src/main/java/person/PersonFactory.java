package person;

import generators.ParamGenerator;
import person.models.Fio;
import person.models.Phone;
import utils.MyMath;

import java.util.Random;

public class PersonFactory {

    public static Person getPerson(final String code) {
        Phone phone = new Phone("N/A");

        // добавляем телефон, только если введённый код не палиндром
        if (!code.equals(new StringBuilder(code).reverse().toString())) {
            final String number = "+79"
                    + String.format("%02d", MyMath.getDigitsSum(Integer.parseInt(code)))
                    + String.format("%03d", new Random().nextInt(1000))
                    + String.format("%04d", Integer.parseInt(code));
            phone = new Phone(number);
        }

        Fio fio = new Fio(new ParamGenerator().lngeneration(Integer.parseInt(code)),
                new ParamGenerator().fngeneration(Integer.parseInt(code)),
                new ParamGenerator().mngeneration(Integer.parseInt(code)));

        return new Person(code, fio,
                new ParamGenerator().GenPh(Integer.parseInt(code)),
                new ParamGenerator().gen_Ap(Integer.parseInt(code)))
                .setPhone(phone);
    }
}
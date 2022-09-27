package Ativ5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
    private String name;
    private String email;
    private Date birthDate;

    public Client(String name, String email, Date birthDate){
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return String.format("%s (%s) - %s", name, sdf.format(birthDate), email);
    }
}

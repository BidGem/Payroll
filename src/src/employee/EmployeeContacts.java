package employee;

public class EmployeeContacts {

    private String email;
    private String name;
    private String card_number;

    public EmployeeContacts(String email, String name, String card_number){
        this.card_number = card_number;
        this.email = email;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getCard_number() {
        return card_number;
    }

    public String getEmail() {
        return email;
    }
}

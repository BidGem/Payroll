package employee;

public class EmployeeContacts {

    private String email;
    private String name;
    private String cardNumber;

    public EmployeeContacts(String email, String name, String cardNumber){
        this.cardNumber = cardNumber;
        this.email = email;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getEmail() {
        return email;
    }
}

package employee;

public class PensionFund extends EmployeeDecorator {
    private final double CONTRIBUTION = 0.1;

    public PensionFund(AbstractEmployee employee) {
        super(employee);
    }

    @Override
    public double getPrice(){
        return super.getPrice() * (1 - CONTRIBUTION);
    }
}

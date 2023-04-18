import java.util.Date;

public class Cuenta {
    private Date fecha2 = new Date(116, 5, 3, 10, 5, 6);
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;

    public Cuenta(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public Cuenta() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreate() {
        return fecha2;
    }

    public double getMonthlyInterestRate() {
        return (annualInterestRate / 12) / 100;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    public double Withraw(double saldo) {
        return balance -= saldo;
    }

    public double Deposit(double saldo) {
        return balance += saldo;
    }

    public static void main(String[] args) {
        Cuenta c1 = new Cuenta();
        c1.setId(1122);
        c1.setBalance(20000);
        c1.setAnnualInterestRate(4.5);
        System.out.println("cuenta ID " + c1.getId());
        System.out.println("");
        c1.Withraw(2500);
        c1.Deposit(3000);
        System.out.println("el saldo es " + c1.getBalance());
        System.out.println("el interes mensual es " + c1.getMonthlyInterest());
        System.out.println("cuenta creada el: " + c1.getDateCreate());

    }

}

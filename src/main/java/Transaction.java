import java.time.LocalDate;

public class Transaction {
    private double balance = 0;
    private double deposito=0;
    private double retiro=0;
    private double tranferencia;
    private LocalDate date;

    public double getBalance() {
        return balance;
    }

    public double getDeposito() {
        return deposito;
    }

    public double getRetiro() {
        return retiro;
    }

    public double getTranferencia() {
        return tranferencia;
    }

    public LocalDate getDate() {
        return date;
    }


    public Transaction(double amount, LocalDate date, int option, double balance) {
        this.balance=balance;
        this.date=date;
        switch (option) {
            case 1:
                this.deposito = amount;
                break;
            case 2:
                this.retiro = amount;
                break;
            case 3:
                this.tranferencia = amount;
                break;
        }
    }
}

public class Transaction {
    private String Balance;
    private int deposito;
    private int retiro;
    private int tranferencia;
    private String date;

    public Transaction(String balance, int deposito, int retiro, int tranferencia, String date) {
        Balance = balance;
        this.deposito = deposito;
        this.retiro = retiro;
        this.tranferencia = tranferencia;
        this.date = date;
    }

    public String getBalance() {
        return Balance;
    }

    public void setBalance(String balance) {
        Balance = balance;
    }

    public int getDeposito() {
        return deposito;
    }

    public void setDeposito(int deposito) {
        this.deposito = deposito;
    }

    public int getRetiro() {
        return retiro;
    }

    public void setRetiro(int retiro) {
        this.retiro = retiro;
    }

    public int getTranferencia() {
        return tranferencia;
    }

    public void setTranferencia(int tranferencia) {
        this.tranferencia = tranferencia;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

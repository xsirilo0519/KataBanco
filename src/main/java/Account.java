import jdk.swing.interop.SwingInterOpUtils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;

public class Account {
    private final int OPTION_DEPO=1;
    private final int OPTION_WITHDRAW=2;
    private final int OPTION_TRANSFER=3;
    private final String MESSAGE="Date         Credit     Debit   Balance\n";
    private double lastBalance=0;
    private LocalDate lastDate=LocalDate.now() ;
    private ArrayList<Transaction> accountMovement;
    private DateTimeFormatter formatter;
    private String historyStatements="";

    public void deposit(long amount,String date ){
        this.lastBalance+=amountOf(amount);
        accountMovement.add(new Transaction(amountOf(amount),date(date),OPTION_DEPO, getLastBalance()));
    }

    public void withdraw(long amount,String date){
        this.lastBalance-=amountOf(amount);
        accountMovement.add(new Transaction(amountOf(amount),date(date),OPTION_WITHDRAW, getLastBalance()));
    }

    public void transfer(long amount,String date){
        this.lastBalance-=amountOf(amount);
        accountMovement.add(new Transaction(amountOf(amount),date(date),OPTION_TRANSFER, getLastBalance()));
    }

    public double getLastBalance() {
        return lastBalance;
    }


    public LocalDate getLastDate() {
        return lastDate;
    }

    public void printStatements(){
        accountMovement.stream().filter(x->x.getTranferencia()==0).sorted(Comparator.comparing(Transaction::getDate).reversed()).forEach(x->statements(x));
        System.out.println(historyStatements);
    }

    private void statements(Transaction transaction){

        historyStatements+=formatter.format(transaction.getDate())+"     "+transaction.getDeposito()+"     "+transaction.getRetiro()+"     "+transaction.getBalance()+"\n";
    }

    private double amountOf(Long mount){
        return (double) mount;
    }

    private LocalDate date(String date){
        try {
            date=date.replace("/","-");
            this.lastDate=LocalDate.parse(date,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        }catch (Exception e){
        }
        return this.lastDate;
    }


    public Account(){
        accountMovement= new ArrayList<Transaction>();
        formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        historyStatements+=MESSAGE;
    }


}

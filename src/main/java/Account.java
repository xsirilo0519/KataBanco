import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.Date;

public class Account {

    private double lastBalance;
    private double lastDate;


    public void deposit(int amount ){

    }

    public void withdraw(){

    }

    public void transfer(){

    }

    private double amountOf(Long mount){
        return (double) mount;
    }

    private LocalDate date(String date){
        int [] dateInt=convertToIntArray(date.split("/"));
        return new LocalDate.of(dateInt[0]);
    }

    private int[] convertToIntArray(String[] dateStr){
        int[] dateInt=new int[dateStr.length-1];
        for (int i=0;i<dateStr.length;i++){
            dateInt[i]=Integer.parseInt(dateStr[i]);
        }
        return dateInt;
    }


}

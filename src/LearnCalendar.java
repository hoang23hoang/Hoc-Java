import java.util.Calendar;

public class LearnCalendar {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        System.out.println("Năm nay là năm: " + year);
        int thang = cal.get(Calendar.MONTH) + 1;
        System.out.println(thang + " là tháng hiện tại");
        int ngay = cal.get(Calendar.DATE);
        System.out.println(ngay + " là ngày hiện tại của tháng");
    }
}

package sortSearch;

/**
 * Created by 10564 on 2017-10-10.
 */
public class Date implements Comparable{
    private int year;
    private int month;
    private int day;

    public Date(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public int compareTo(Object o) {
//        if (!(o.getClass().equals(this.getClass()))) return -2;
        Date d = (Date)o;

        if (this.year > d.year) return 1;

        if (this.year == d.year){
            if (this.month > d.month) return 1;

            if (this.month == d.month){
                if (this.day > d.day) return 1;

                if (this.day == d.day) return 0;

                return -1;
            }

            return -1;
        }

        return -1;
    }

    @Override
    public String toString() {
        return year+"-"+month+"-"+day;
    }

    public void copy(Date d){
        this.year = d.year;
        this.month = d.month;
        this.day = d.day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }
}

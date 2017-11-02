package sortSearch;

import java.util.Arrays;

/**
 * Created by 10564 on 2017-10-10.
 */
public class SortAndSearch {

    public static void main(String[] args) {
        SortAndSearch ss = new SortAndSearch();
        Date[] dates = new Date[10];

        ss.initDates(dates);

//        Arrays.sort(dates);
        ss.quickSort(dates, 0, dates.length-1);

        for (int i = 0; i <10 ; i++) {
            System.out.println(dates[i]);
        }

        Date d = new Date(2004, 2, 29);

        int index = ss.binarySearch(dates, d, 0, dates.length-1);
        System.out.println(index);

        Date d1 = new Date(2017, 12, 30);
        index = ss.binarySearch(dates, d1, 0, dates.length-1);
        System.out.println(index);
    }

    void quickSort(Date[] dates, int l, int r){
        if (l >= r) return;

        int i = l;
        int j = r;
        Date d = new Date(0, 0, 0);
        d.copy(dates[l]);

        while(i < j){
            while (i < j){
                if (dates[j].compareTo(d) < 0) break;
                j--;
            }
            if (i < j){
                dates[i].copy(dates[j]);
                i++;
            }

            while (i < j){
                if (dates[i].compareTo(d) > 0) break;
                i++;
            }
            if (i < j){
                dates[j].copy(dates[i]);
                j--;
            }
        }

        dates[i].copy(d);

        quickSort(dates, l, i-1);
        quickSort(dates, i+1, r);
    }

    public int binarySearch(Date[] dates, Date d, int l, int r){
        if (l > r) return -1;  //未找到，返回-1

        int mid = (l + r) / 2;
        int cmp = d.compareTo(dates[mid]);
        if (cmp == 0) return mid;

        if (cmp > 0){
            return binarySearch(dates, d, mid+1, r);
        }
        else {
            return binarySearch(dates, d, l, mid-1);
        }
    }

    void initDates(Date[] dates){
        dates[0] = new Date(1999, 9, 28);
        dates[1] = new Date(2000, 3, 12);
        dates[2] = new Date(1999, 10, 1);
        dates[3] = new Date(2008, 8, 12);
        dates[4] = new Date(2004, 2, 29);
        dates[5] = new Date(2008, 8, 24);
        dates[6] = new Date(2014, 9, 4);
        dates[7] = new Date(2004, 6, 6);
        dates[8] = new Date(2017, 10, 10);
        dates[9] = new Date(2017, 9, 30);

    }
}
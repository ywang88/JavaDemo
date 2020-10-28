package day08;

/**
 * Author wangyi
 * Create 2020-09-14 23:21
 * ClassName MyDate
 * Version 1.0
 */
public class MyDate {

    public MyDate(int year, int mothon, int day) {
        this.year = year;
        this.day = day;
        this.mothon = mothon;
    }

    int year;
    int mothon;
    int day;

    @Override
    public boolean equals(Object obj) {
        int flag = 1;
        if (obj instanceof MyDate) {
         /*   flag现在的值是0
            如果有一组值不相等就会+1
            如果全都不相等flag就是3,2个不相等就2
            只有全相等,flag才是0*/
            flag = 0;
            if (this.year != year) {
                flag += 1;
            }
            if (this.mothon != mothon) {
                flag += 1;
            }
            if (this.day != day) {
                flag += 1;
            }
        }
        if (flag == 0) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public String toString() {
        String str = this.year + "-" + this.mothon + "-" + this.day;
        return str;
    }
}

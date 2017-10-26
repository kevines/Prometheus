package com.cnwisdom.Prometheus.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;

public class DateUtil extends DateUtils {

    public static String yyyyMMddHHmmss = "yyyyMMddHHmmss";
    public static String yyyyMMddHHmm = "yyyyMMddHHmm";
    public static String yyyyMMdd = "yyyyMMdd";
    public static String yyyyMM = "yyyyMM";
    public static String HHmmss = "HHmmss";
    public static String HHmm = "HHmm";
    public static String yyyyMMddHHSpt = "yyyy-MM-dd HH";
    public static String yyyyMMddHHmmssSpt = "yyyy-MM-dd HH:mm:ss";
    public static String yyyyMMddHHmmSpt = "yyyy-MM-dd HH:mm";
    public static String yyyyMMddSpt = "yyyy-MM-dd";
    public static String yyyyMMSpt = "yyyy-MM";
    public static String HHmmssSpt = "HH:mm:ss";
    public static String HHmmSpt = "HH:mm";
    public static String ddHHSpt = "dd/HH";
    public static String MMddSpt = "MM-dd";
    public static long nd = 1000 * 24 * 60 * 60; // 一天的毫秒数
    public static long nh = 1000 * 60 * 60; // 一小时的毫秒数
    public static long nm = 1000 * 60; // 一分钟的毫秒数
    public static long ns = 1000; // 一秒钟的毫秒数
    public static long diff;
    public static long day = 0;
    public static long hour = 0;
    public static long min = 0;
    public static long sec = 0;

    public static void main(String[] args) throws InterruptedException {
        System.out.println(afterHours(new Date(), 10));

    }

    public static Date afterDays(Date source, int i) {
        return addDays(source, i);
    }

    public static Date subDays(Date source, int i) {
        return addDays(source, -i);
    }

    public static Date afterHours(Date source, int i) {
        return addHours(source, i);
    }

    public static Date subHours(Date source, int i) {
        return addHours(source, -i);
    }

    public static Date subMinutes(Date source, int i) {
        return addMinutes(source, -i);
    }

    public static Date afteMinutes(Date source, int i) {
        return addMinutes(source, i);
    }

    public static Date subSeconds(Date source, int i) {
        return addSeconds(source, -i);
    }

    /*
     * 获取当前时间之前或之后几小时 hour
     */

    public static String getTimeByHour(int hour) {

        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.HOUR_OF_DAY, calendar.get(Calendar.HOUR_OF_DAY) + hour);

        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(calendar.getTime());

    }

    /*
     * 获取当前时间之前或之后几分钟 minute
     */

    public static String getTimeByMinute(int minute) {

        Calendar calendar = Calendar.getInstance();

        calendar.add(Calendar.MINUTE, minute);

        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(calendar.getTime());

    }

    /** 将入单时间加上sla时间得到新的时间 */
    public static Date getAfterMinute(Date date, int beforeMinute) {
        if (beforeMinute > 60 || beforeMinute == 60) {
            int minute = beforeMinute / 60;
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            int hour = cal.get(Calendar.HOUR_OF_DAY);
            cal.set(Calendar.HOUR_OF_DAY, hour + minute);
            return cal.getTime();
        } else {
            Calendar cal = Calendar.getInstance();

            cal.setTime(date);
            int minute = cal.get(Calendar.MINUTE);
            cal.set(Calendar.MINUTE, minute + beforeMinute);
            return cal.getTime();
        }
    }

    public static Date getFirstDayOfYear(String format) {
        Calendar ca = Calendar.getInstance();
        ca.set(Calendar.DAY_OF_YEAR, 1);
        return ca.getTime();
    }

    public static Date getLastMonth(String format) {
        Calendar ca = Calendar.getInstance();
        ca.set(Calendar.DAY_OF_MONTH, 1);
        ca.set(Calendar.MONTH, ca.get(Calendar.MONTH) - 1);
        return ca.getTime();
    }

    public static Date getLastDayOfYear() {
        Calendar ca = Calendar.getInstance();
        ca.set(Calendar.MONTH, Calendar.DECEMBER);
        ca.set(Calendar.DAY_OF_MONTH, 30);
        return ca.getTime();
    }

    public static String format(String format) {
        return new SimpleDateFormat(format).format(Calendar.getInstance().getTime());
    }

    public static String format(Date date, String format) {
        if (date == null) {
            return "";
        }
        return new SimpleDateFormat(format).format(date);
    }

    public static Date parse(String date, String format) {
        try {
            return new SimpleDateFormat(format).parse(date);
        } catch (ParseException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public static Date parse(Date date, String format) {
        try {
            String str = new SimpleDateFormat(format).format(date);
            return new SimpleDateFormat(format).parse(str);
        } catch (ParseException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public static Date defaultDate() {
        Calendar c = Calendar.getInstance();
        c.setTimeInMillis(0);
        return c.getTime();
    }

    public static Date getLastDayOfMonth(int year, int month) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DATE));
        return cal.getTime();
    }

    public static Date getFirstDayOfMonth(int year, int month) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMinimum(Calendar.DATE));
        return cal.getTime();
    }

    public static Date getNextDay(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int day = cal.get(Calendar.DATE);
        cal.set(Calendar.DATE, day + 1);
        return cal.getTime();
    }

    public static Date getBeforeDay(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int day = cal.get(Calendar.DATE);
        cal.set(Calendar.DATE, day - 1);
        return cal.getTime();
    }

    /** 计算2个日期相差天数 */
    public static int betweenDayNumbe(Date dateA, Date dateB) {
        long day = 24 * 3600 * 1000L;
        long munber = 0;
        munber = (dateA.getTime() - dateB.getTime()) / day;
        return (int) munber;
    }

    /** 计算2个日期相差天数 */
    public static long betweenNumbe(Date dateA, Date dateB) {
        long munber = 0;
        munber = (dateA.getTime() - dateB.getTime()) / 1000;
        return munber;
    }

    /** 计算2个日期相差小时数 */
    public static long betweenHourNumbe(Date dateA, Date dateB) {

        diff = (dateA.getTime() - dateB.getTime());
        day = diff / nd;
        hour = diff % nd / nh + day * 24;// 计算差多少小时
        return hour;
    }

    /** 计算2个日期相差分钟数 */
    public static long betweenMiNumbe(Date dateA, Date dateB) {
        diff = (dateA.getTime() - dateB.getTime());
        day = diff / nd;
        hour = diff % nd / nh + day * 24;// 计算差多少小时
        min = diff % nd % nh / nm + hour * 60;// 计算差多少分钟
        return min;
    }

    /** 将当前时间加减n个小时 */
    public static Date minusHour(Date date, int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        // calendar.add(Calendar.YEAR, -1);//当前时间减去一年，即一年前的时间
        calendar.add(Calendar.HOUR, i);// 当前时间前去一个小时，即一个小时前的时间
        return calendar.getTime();// 获取一个月前的时间
    }

    /** 将当前时间加减n个月 */
    public static Date minusNmonth(Date date, int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        // calendar.add(Calendar.YEAR, -1);//当前时间减去一年，即一年前的时间
        calendar.add(Calendar.MONTH, i);// 当前时间前去一分钟，即一分钟前的时间
        return calendar.getTime();// 获取n个月的时间
    }

    /** 获取时间的月份 */
    public static int getMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.MONTH) + 1;
    }

    /** 获取时间的年份 */
    public static int getYear(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.YEAR);
    }
}

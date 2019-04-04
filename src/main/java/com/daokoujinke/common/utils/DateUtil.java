package com.daokoujinke.common.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
    private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

    /**
     * 计算两个日期之间相隔的天数
     * @param targetDate
     * @param nowDate
     * @return
     */
    public static int longOfTwoDate(String targetDate,Date nowDate){
        Date first = null;
        Date second = null;
        try {
            first = format.parse(targetDate);
            second = format.parse(getStringDateShort(nowDate));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(first);
        int cnt = 0;
        while (calendar.getTime().compareTo(second) != 0){
            calendar.add(Calendar.DATE,1);
            cnt++;
        }
        return cnt;
    }

    /**
     * 获取现在时间
     *
     * @return 返回短时间字符串格式yyyy-MM-dd
     */
    public static String getStringDateShort(Date currentTime) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = formatter.format(currentTime);
        return dateString;
    }
}

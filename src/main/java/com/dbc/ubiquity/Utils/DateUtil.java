package com.dbc.ubiquity.Utils;

import com.dbc.ubiquity.Constant.Number;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    private static Logger logger = LoggerFactory.getLogger(DateUtil.class);

    public static int NewDateInt(){
        long nowTime = System.currentTimeMillis() / 1000;
        return new Long(nowTime).intValue();
    }

    public static Date IntToDate(int nowTimeInt){
        Date nowTimeDate = null;
        try{
            long nowTimeLong = new Long(nowTimeInt).longValue() * 1000;
            DateFormat ymdhmsFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String nowTimeStr = ymdhmsFormat.format(nowTimeLong);
            nowTimeDate = ymdhmsFormat.parse(nowTimeStr);
        }catch (ParseException e){
            e.printStackTrace();
            logger.error("日期工具类错误：int数值转化为Date数值出错！");
        }
        return nowTimeDate;
    }

    public static int LastWeekTime(){
        long nowTimeMills = (System.currentTimeMillis() - Number.ONE_WEEK_MILLS) / 1000;
        return new Long(nowTimeMills).intValue();
    }

    public static int LastDayTime(){
        long nowTimeMills = (System.currentTimeMillis() - Number.ONE_DAY_MILLS) / 1000;
        return new Long(nowTimeMills).intValue();
    }
}

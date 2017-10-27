package com.howoh.studyv2.studyv2_1.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by howoh on 2017-10-27.
 */

public class CommonUtil {

    public static String dateToyyyy_MM_dd_HH_mm_ss(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return format.format(date);
    }
}

package demo.jian.rd.com.livebase;

import com.rd.lib.utils.CoreUtils;

import java.lang.String;
/**
 * Created by JIAN on 2016/8/11.
 */
public class Utils {

    public static String getInfo(String info) {
        return "utils->" + info+"md5->" +CoreUtils.getMd5("------------md5");
    }


}

package cn.clown.common.util;

import java.sql.ResultSet;

/**
 * TODO:留作备用
 * @author clown
 * @Date 2021/2/7 0007 21:17
 */
public class InstanceUtil<T> {
    public static <T> boolean isString(T t) {
        return t instanceof String;
    }

    public static <T> boolean isByte(T t) {
        return t instanceof Byte;
    }

    public static <T> boolean isShort(T t) {
        return t instanceof Short;
    }

    public static <T> boolean isInt(T t) {
        return t instanceof Integer;
    }

    public static <T> boolean isLong(T t) {
        return t instanceof Long;
    }

    public static <T> boolean isChar(T t) {
        return t instanceof Character;
    }

    public static <T> boolean isFloat(T t) {
        return t instanceof Float;
    }

    public static <T> boolean isDouble(T t) {
        return t instanceof Double;
    }

    public static <T> boolean isBytes(T t) {
        return t instanceof Byte;

    }

    public static <T> Class<?> getClassType(T t) {
        return t.getClass();
    }

}

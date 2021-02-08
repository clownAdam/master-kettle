package cn.clown.common.api;

import java.lang.annotation.*;

/**
 * @author clown
 * @Date 2021/2/6 0006 23:21
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface TableRef {
    /**
     * value格式为库名.表名
     * default "database.table"
     *
     * @return 表名
     */
    String value();
}

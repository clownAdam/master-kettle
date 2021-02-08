package cn.clown.common.bean;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;

/**
 * 生产数据->数据的来源
 *
 * @author clown
 * @Date 2021/2/6 0006 22:56
 */
public interface DataIn extends Closeable {
    /**
     * 设置数据库来源表名
     *
     * @param table 表名
     */
    public void setSource(String table);

    /**
     * 从mysql读取数据
     *
     * @return 返回数据对象
     * @throws IOException 读取异常
     */
    public Object read() throws IOException;

    /**
     * 从mysql读取数据返回类对象
     *
     * @param clazz 类对象
     * @param <T>   类对象
     * @return 返回类对象集合
     * @throws IOException io异常
     */
    public <T extends AbstractData> List<T> read(Class<T> clazz) throws IOException;


}

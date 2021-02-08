package cn.clown.common.bean;

import java.io.Closeable;
import java.io.IOException;

/**
 * 生产数据->数据的输出
 *
 * @author clown
 * @Date 2021/2/6 0006 22:57
 */
public interface DataOut extends Closeable {
    /**
     * 设置文件输出路径
     *
     * @param path 本地文件路径
     */
    public void setSource(String path);

    /**
     * 将数据写出
     *
     * @param data 数据
     * @throws IOException 异常
     */
    public void write(Object data) throws IOException;

    /**
     * 将数据写出
     *
     * @param data 数据
     * @throws IOException 异常
     */
    public void write(String data) throws IOException;

}

package cn.clown.producer.io;

import cn.clown.common.bean.DataOut;

import java.io.*;

/**
 * 本地文件数据输出
 *
 * @author clown
 * @Date 2021/2/7 0007 22:35
 */
public class LocalFileDataOut implements DataOut {
    private PrintWriter writer = null;

    public LocalFileDataOut(String path) {
        setSource(path);
    }

    /**
     * 设置文件输出路径
     *
     * @param path 本地文件路径
     */
    @Override
    public void setSource(String path) {
        try {
            writer = new PrintWriter(new OutputStreamWriter(new FileOutputStream(path), "UTF-8"));
        } catch (UnsupportedEncodingException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 将数据写出
     *
     * @param data 数据
     * @throws IOException 异常
     */
    @Override
    public void write(Object data) throws IOException {
        write(data.toString());
    }

    /**
     * 将数据写出
     *
     * @param data 数据
     * @throws IOException 异常
     */
    @Override
    public void write(String data) throws IOException {
        writer.println(data);
        writer.flush();
    }

    /**
     * Closes this stream and releases any system resources associated
     * with it. If the stream is already closed then invoking this
     * method has no effect.
     *
     * <p> As noted in {@link AutoCloseable#close()}, cases where the
     * close may fail require careful attention. It is strongly advised
     * to relinquish the underlying resources and to internally
     * <em>mark</em> the {@code Closeable} as closed, prior to throwing
     * the {@code IOException}.
     *
     * @throws IOException if an I/O error occurs
     */
    @Override
    public void close() throws IOException {
        if (writer != null) {
            writer.close();
        }
    }
}

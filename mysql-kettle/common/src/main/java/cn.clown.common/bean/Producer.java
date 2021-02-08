package cn.clown.common.bean;

import java.io.Closeable;

/**
 * 生产者接口
 *
 * @author clown
 */
public interface Producer extends Closeable {
    /**
     * 设置数据来源
     *
     * @param dataIn 数据来源
     */
    public void setDataIn(DataIn dataIn);

    /**
     * 设置数据输出
     * @param dataOut 数据输出
     */
    public void setDataOut(DataOut dataOut);
    /**
     * 生产数据
     */
    public void produce(AbstractData data);
}

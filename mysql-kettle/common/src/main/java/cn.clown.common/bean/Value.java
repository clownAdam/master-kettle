package cn.clown.common.bean;

/**
 * 值对象
 *
 * @author clown
 */
public interface Value {
    /**
     * 设置值
     *
     * @param value 值
     */
    public void setValue(Object value);

    /**
     * 获取值
     *
     * @return 返回对象
     */
    public Object getValue();
}

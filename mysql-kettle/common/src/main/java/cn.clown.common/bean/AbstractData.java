package cn.clown.common.bean;

/**
 * 数据对象
 *
 * @author clown
 * @Date 2021/2/6 0006 23:31
 */
public abstract class AbstractData implements Value {
    /**
     * 数据内容
     */
    public String content;

    /**
     * 设置值
     *
     * @param value 值
     */
    @Override
    public void setValue(Object value) {
        content = (String) value;
    }

    /**
     * 获取值
     *
     * @return 返回对象
     */
    @Override
    public Object getValue() {
        return content;
    }
}

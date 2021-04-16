package cn.clown.producer.db;
import cn.clown.common.api.Column;
import cn.clown.common.api.TableRef;
import cn.clown.common.bean.AbstractData;
@TableRef("datakmall.Atype")
public class Atype extends AbstractData {
    //将数据库的表映射成一个类
    @Column(column = "id")
    private Integer id;
    @Column(column = "name")
    private Integer name;
    @Column(column = "aid")
    private Integer aid;
}

package cn.clown.producer.db;

import cn.clown.common.api.Column;
import cn.clown.common.api.TableRef;
import cn.clown.common.bean.AbstractData;
@TableRef("datakmall.Btype")
public class Btype extends AbstractData {
    @Column(column = "id")
    private Integer id;
    @Column(column = "name")
    private Integer name;
    @Column(column = "aid")
    private Integer aid;
}

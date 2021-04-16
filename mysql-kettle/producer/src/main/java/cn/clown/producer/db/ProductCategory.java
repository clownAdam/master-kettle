package cn.clown.producer.db;

import cn.clown.common.api.Column;
import cn.clown.common.api.TableRef;
import cn.clown.common.bean.AbstractData;

@TableRef("datakmall.product_category")
public class ProductCategory extends AbstractData{
    @Column(column = "category_id")
    private Integer category_id;

    @Column(column = "category_name")
    private Integer category_name;

    @Column(column = "category_type")
    private Integer category_type;

    @Column(column = "category_time")
    private Integer category_time;

    @Column(column = "update_time")
    private Integer update_time;
}

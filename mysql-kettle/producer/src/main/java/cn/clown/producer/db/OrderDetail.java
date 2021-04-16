package cn.clown.producer.db;
import cn.clown.common.api.Column;
import cn.clown.common.api.TableRef;
import cn.clown.common.bean.AbstractData;

@TableRef("datakmall.order_master")
public class OrderDetail extends AbstractData{
    @Column(column = "detail_id")
    private Integer detail_id;

    @Column(column = "order_id")
    private Integer order_id;

    @Column(column = "product_id")
    private Integer product_id;

    @Column(column = "product_name")
    private Integer getProduct_name;

    @Column(column = "product_price")
    private Integer product_price;

    @Column(column = "product_quantity")
    private Integer product_quantity;

    @Column(column = "create_time")
    private Integer create_time;

    @Column(column = "update_time")
    private Integer update_time;
}

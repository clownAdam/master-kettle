package cn.clown.producer.db;

import cn.clown.common.api.Column;
import cn.clown.common.api.TableRef;
import cn.clown.common.bean.AbstractData;

@TableRef("datakmall.order_master")
public class OrderMaster extends AbstractData {
    @Column(column = "product_quantity")
    private Integer product_quantity;

    @Column(column = "order_id")
    private Integer order_id;

    @Column(column = "product_id")
    private Integer product_id;

    @Column(column = "product_price")
    private Integer product_price;

    @Column(column = "buyer_name")
    private Integer buyer_name;

    @Column(column = "buyer_phone")
    private Integer buyer_phone;

    @Column(column = "buyer_address")
    private Integer buyer_address;

    @Column(column = "buyer_openid")
    private Integer buyer_openid;

    @Column(column = "order_amount")
    private Integer order_amount;

    @Column(column = "order_status")
    private Integer order_status;

    @Column(column = "create_time")
    private Integer create_time;

    @Column(column = "update_time")
    private Integer update_time;

    @Column(column = "user_id")
    private Integer user_id;

    @Column(column = "product_name")
    private Integer product_name;
}

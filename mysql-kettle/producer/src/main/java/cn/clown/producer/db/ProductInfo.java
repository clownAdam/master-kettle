package cn.clown.producer.db;
import cn.clown.common.api.Column;
import cn.clown.common.api.TableRef;
import cn.clown.common.bean.AbstractData;

@TableRef("datakmall.product_info")
public class ProductInfo extends AbstractData{
    @Column(column = "product_id")
    private Integer product_id;

    @Column(column = "product_name")
    private Integer getProduct_name;

    @Column(column = "product_price")
    private Integer product_price;

    @Column(column = "product_stock")
    private Integer product_stock;

    @Column(column = "product_description")
    private Integer product_description;

    @Column(column = "product_icon")
    private Integer product_icon;

    @Column(column = "category_type")
    private Integer category_type;

    @Column(column = "create_time")
    private Integer create_time;

    @Column(column = "update_time")
    private Integer update_time;
}

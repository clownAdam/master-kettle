package cn.clown.producer.db;

import cn.clown.common.api.Column;
import cn.clown.common.api.TableRef;
import cn.clown.common.bean.AbstractData;

/**
 * @author clown
 * @Date 2021/2/7 0007 20:39
 */
@TableRef("datakmall.ad")
public class Count extends AbstractData {
    @Column(column = "ad_id")
    private Integer ad_id;
    @Column(column = "ad_lv")
    private Integer ad_lv;
    @Column(column = "ad_pic")
    private Integer ad_pic;
    @Column(column = "ad_product_id")
    private Integer ad_product_id;
}

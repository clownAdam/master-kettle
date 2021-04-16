package cn.clown.producer.db;

import cn.clown.common.api.Column;
import cn.clown.common.api.TableRef;
import cn.clown.common.bean.AbstractData;

@TableRef("datakmall.mall_user")
public class MallUser extends AbstractData {
    @Column(column = "user_id")
    private Integer user_id;
    @Column(column = "user_name")
    private Integer user_name;
    @Column(column = "user_pic")
    private Integer user_pic;
    @Column(column = "user_sex")
    private Integer user_sex;
    @Column(column = "user_account")
    private Integer user_account;
    @Column(column = "user_password")
    private Integer user_password;
}

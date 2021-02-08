package cn.clown.producer.dao;

import cn.clown.common.bean.AbstractData;
import cn.clown.common.bean.BaseDao;
import cn.clown.producer.db.Count;

import java.util.List;

/**
 * @author clown
 * @Date 2021/2/7 0007 0:08
 */
public class MysqlDao extends BaseDao {
    @Override
    public <T extends AbstractData> List<String> smallSelect(T object) {
        return super.smallSelect(object);
    }
}

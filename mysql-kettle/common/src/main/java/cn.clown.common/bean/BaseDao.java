package cn.clown.common.bean;

import cn.clown.common.api.Column;
import cn.clown.common.api.TableRef;
import cn.clown.common.util.JdbcUtil;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 基础数据访问对象
 *
 * @author clown
 * @Date 2021/2/7 0007 0:09
 */
public abstract class BaseDao {
    /**
     * 查询不重复的表对象数据并返回
     *
     * @param <T>
     * @return
     */
    public <T extends AbstractData> List<String> smallSelect(T object) {
        List<String> res = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        String tmp;
        //反射
        Class<?> clazz = object.getClass();
        TableRef tableRef = clazz.getAnnotation(TableRef.class);
        Field[] fields = clazz.getDeclaredFields();
        String tableName = tableRef.value();
        Connection connection = JdbcUtil.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement("select * from " + tableName);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                stringBuilder.setLength(0);
                System.out.println("fields = " + fields.length);
                String buffer = null;
                for (int i = 0; i < fields.length; i++) {
                    Column column = fields[i].getAnnotation(Column.class);
                    String colName = fields[i].getName();
                    Class<?> colNameType = fields[i].getType();
                    /*System.out.println("obj = " + rs.getObject(i + 1));*/
                    stringBuilder.append(rs.getObject(i + 1) + ",");
                }
                tmp = stringBuilder.substring(0, stringBuilder.length() - 1);
                System.out.println("tmp = " + tmp);
                res.add(tmp);
            }
        } catch (SQLException e) {
            System.out.println("数据查询失败");
            e.printStackTrace();
        }
        res.forEach(System.out::println);
        return res;
    }
}

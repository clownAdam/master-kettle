package cn.clown.common.util;

import org.junit.Test;
import org.junit.internal.builders.JUnit3Builder;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.Assert.*;

public class JdbcUtilTest {

    @Test
    public void getInstance() {
        JdbcUtil instance = JdbcUtil.getInstance();
        System.out.println("instance = " + instance);
    }

    @Test
    public void getConnection() throws SQLException {
        Connection connection = JdbcUtil.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("select * from graduation.tb_count");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            int id = resultSet.getInt("id");
            System.out.println(id);
        }
        System.out.println(connection);
    }

    @Test
    public void free() {
        JdbcUtil.free();
    }
}
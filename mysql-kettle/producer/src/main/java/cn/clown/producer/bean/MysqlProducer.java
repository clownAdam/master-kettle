package cn.clown.producer.bean;


import cn.clown.common.bean.*;
import cn.clown.producer.dao.MysqlDao;
import cn.clown.producer.db.Count;

import java.io.IOException;
import java.util.List;

/**
 * mysql数据生产者
 *
 * @author clown
 * @Date 2021/2/6 0006 22:51
 */
public class MysqlProducer implements Producer {
    private DataIn dataIn;
    private DataOut dataOut;
    private volatile boolean flag = true;

    @Override
    public void setDataIn(DataIn dataIn) {
        this.dataIn = dataIn;
    }

    @Override
    public void setDataOut(DataOut dataOut) {
        this.dataOut = dataOut;
    }

    @Override
    public void produce(AbstractData data) {
        try {
            //read
            BaseDao mysqlDao = new MysqlDao();
            while (flag) {
                List<String> list = mysqlDao.smallSelect(data);
                for (String log : list) {
                    dataOut.write(log);
                }
                System.out.println("end");
                Thread.sleep(500);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void close() throws IOException {
        if (dataIn != null) {
            dataIn.close();
        }
        if (dataOut != null) {
            dataOut.close();
        }
    }
}

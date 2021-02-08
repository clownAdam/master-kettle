package cn.clown.producer;

import cn.clown.common.bean.Producer;
import cn.clown.producer.bean.MysqlProducer;
import cn.clown.producer.db.Count;
import cn.clown.producer.io.LocalFileDataOut;

import java.io.IOException;

/**
 * 数据生产启动对象
 *
 * @author clown
 * @Date 2021/2/6 0006 20:44
 */
public class BootStrap {
    public static void main(String[] args) throws IOException {
//        if (args == null || args.length <= ArgsConstant.ARGS_ZERO) {
//            System.out.println("no argument");
//            System.exit(1);
//        }
//        if (args.length < ArgsConstant.ARGS_TWO) {
//            System.out.println("系统参数不正确,请按照指定格式传递:java -jar *.jar table outputPath");
//            System.exit(1);
//        }
        //构造生产者对象
        Producer mysqlProducer = new MysqlProducer();
        mysqlProducer.setDataOut(new LocalFileDataOut("D:/countq.log"));
        //生产数据
        Count count = new Count();
        mysqlProducer.produce(count);

        //关闭生产者对象
        mysqlProducer.close();
    }
}

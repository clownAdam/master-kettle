package cn.clown.producer;

import cn.clown.common.bean.AbstractData;
import cn.clown.common.bean.Producer;
import cn.clown.common.constant.ArgsConstant;
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
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        if (args == null || args.length <= ArgsConstant.ARGS_ZERO) {
            System.out.println("no argument");
            System.exit(1);
        }
        if (args.length < ArgsConstant.ARGS_TWO) {
            System.out.println("系统参数不正确,请按照指定格式传递:java -jar *.jar table outputPath");
            System.out.println("*.jar --> jar包名称");
            System.out.println("table --> 表所对应的类名");
            System.out.println("table可选为： --> cn.clown.producer.db.Atype");
            System.out.println("table可选为： --> cn.clown.producer.db.Count");
            System.out.println("table可选为： --> cn.clown.producer.db.MallUser");
            System.out.println("table可选为： --> cn.clown.producer.db.OrderMaster");
            System.out.println("table可选为： --> cn.clown.producer.db.ProductCategory");
            System.out.println("table可选为： --> cn.clown.producer.db.ProductInfo");
            System.out.println("outputPath --> 数据输出路径");
            System.exit(1);
        }
        //构造生产者对象
        Producer mysqlProducer = new MysqlProducer();
        mysqlProducer.setDataOut(new LocalFileDataOut(args[1]));
        //生产数据
        Count count = new Count();
        AbstractData o = (AbstractData) Class.forName(args[0]).newInstance();
        mysqlProducer.produce(o);

        //关闭生产者对象
        mysqlProducer.close();
    }
}

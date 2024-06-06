package cn.dfjy.demo;

import org.apache.log4j.Logger; // 不要引错包

public class Demo01 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Demo01.class); // 传入字节码对象
        // off > fatal > error > warn > info > debug > trace(all)
        logger.trace("trace级别信息");
        logger.debug("debug级别信息");
        logger.info("info级别信息");
        logger.warn("warn级别信息");
        logger.error("error级别信息");
        logger.fatal("fatal级别信息");

        System.out.println("日志信息");
    }
}

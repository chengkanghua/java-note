package cn.dfjy.demo.test;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Demo08 {
    @Test
    public void f01() {
        // 双列
        Map map = new HashMap();
        // 增（key value 结构）
        // key不能重复，value可以重复
        map.put("CN", "中国"); // 新增
        map.put("US", "美国");
        map.put("RU", "俄罗斯");
        map.put("FR", "法国");
        System.out.println("CN对应的国家是：" + map.get("CN"));
        System.out.println("map中有"+map.size()+"组数据");
        System.out.println("map中包含FR键吗？"+map.containsKey("FR"));
        map.remove("FR");
        System.out.println("map中包含FR键吗？"+map.containsKey("FR"));
        System.out.println(map.keySet()); // 返回值是Set接口类型的对象（不能重复）
        System.out.println(map.values()); // 返回值是Collection接口类型的对象（可以重复）
        map.clear();
        System.out.println("已清空所有数据");
        System.out.println("map中有"+map.size()+"组数据");
    }

}

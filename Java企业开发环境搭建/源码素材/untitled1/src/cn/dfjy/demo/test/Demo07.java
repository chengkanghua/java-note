package cn.dfjy.demo.test;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Demo07 {
    @Test
    public void f01() {
        // 双列
        Map map = new HashMap();
        // 增（key value 结构）
        // key不能重复，value可以重复
        map.put("cn", "中国"); // 新增
        map.put("us", "美国");
        map.put("jp", "日本");
        map.put("hg", "韩国");
        map.put("cn", "中华人民共和国"); // 修改
        System.out.println(map.size());
        // 查
        Set set = map.keySet(); // 先找到key的集合
        for (Object key : set) {
            Object value = map.get((String)key);
            System.out.println(key + " : " + value);
        }
    }

}

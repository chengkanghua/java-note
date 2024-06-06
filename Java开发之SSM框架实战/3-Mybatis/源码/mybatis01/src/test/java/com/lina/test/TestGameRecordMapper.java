package com.lina.test;

import com.lina.mapper.GameRecordMapper;
import com.lina.pojo.GameRecord;
import com.lina.util.MybatisUtil;
import org.junit.Test;

/**
 * ClassName: TestGameRecordMapper
 * 测试类
 * @author wanglina
 * @version 1.0
 */
public class TestGameRecordMapper {

    @Test
    public void testAdd(){
        GameRecordMapper mapper = MybatisUtil.getSqlSession().getMapper(GameRecordMapper.class);
        GameRecord record=new GameRecord();
        record.setHomeTeamId(1003);
        record.setVisitingTeamId(1001);
        record.setScore(90);
        int add = mapper.add(record);
        MybatisUtil.getSqlSession().commit();
        System.out.println(add);
    }
}

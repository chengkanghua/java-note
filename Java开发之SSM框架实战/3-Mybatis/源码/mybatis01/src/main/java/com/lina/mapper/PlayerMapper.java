package com.lina.mapper;

import com.lina.pojo.Player;

import java.util.List;

/**
 * ClassName: PlayerMapper
 *
 * @author wanglina
 * @version 1.0
 */
public interface PlayerMapper {
    Player queryById(int playerId);
    Player queryById1(int playerId);
    Player queryById2(int playerId);
    Player queryById3(int playerId);

    List<Player> queryByTeamId(int teamId);
}

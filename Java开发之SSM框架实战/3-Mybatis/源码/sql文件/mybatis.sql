/*
 Navicat Premium Data Transfer

 Source Server         : 127.0.0.1
 Source Server Type    : MySQL
 Source Server Version : 80023
 Source Host           : localhost:3306
 Source Schema         : mybatis

 Target Server Type    : MySQL
 Target Server Version : 80023
 File Encoding         : 65001

 Date: 21/04/2021 20:41:22
*/
create database mybatis;
use mybatis;
SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for gamerecord
-- ----------------------------
DROP TABLE IF EXISTS `gamerecord`;
CREATE TABLE `gamerecord`  (
  `recordId` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `homeTeamId` int NULL DEFAULT NULL COMMENT '主队ID',
  `gameDate` datetime NULL DEFAULT CURRENT_TIMESTAMP COMMENT '比赛日期',
  `score` int NULL DEFAULT NULL COMMENT '得分',
  `visitingTeamId` int NULL DEFAULT NULL COMMENT '客队ID',
  PRIMARY KEY (`recordId`) USING BTREE,
  INDEX `homeTeamId`(`homeTeamId`) USING BTREE,
  INDEX `visitingTeamId`(`visitingTeamId`) USING BTREE,
  CONSTRAINT `gamerecord_ibfk_1` FOREIGN KEY (`homeTeamId`) REFERENCES `team` (`teamId`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `gamerecord_ibfk_2` FOREIGN KEY (`visitingTeamId`) REFERENCES `team` (`teamId`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of gamerecord
-- ----------------------------
INSERT INTO `gamerecord` VALUES ('123', 1001, '2021-04-16 15:03:58', 90, 1003);
INSERT INTO `gamerecord` VALUES ('6205b20e-9e7f-11eb-bdbb-040e3c3b61b2', 1002, '2021-02-20 15:38:46', 118, 1007);
INSERT INTO `gamerecord` VALUES ('90e24173-9844-11eb-a0ad-040e3c3b61b2', 1007, '2021-04-08 16:29:42', 118, 1002);
INSERT INTO `gamerecord` VALUES ('9e8caa25-9e82-11eb-bdbb-040e3c3b61b2', 1003, '2021-04-16 15:09:00', 90, 1001);

-- ----------------------------
-- Table structure for player
-- ----------------------------
DROP TABLE IF EXISTS `player`;
CREATE TABLE `player`  (
  `playerId` int NOT NULL AUTO_INCREMENT COMMENT '球员ID',
  `playerName` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '球员姓名',
  `playerNum` int NULL DEFAULT NULL COMMENT '球衣号码',
  `teamId` int NULL DEFAULT NULL COMMENT '所属球队',
  PRIMARY KEY (`playerId`) USING BTREE,
  INDEX `teamId`(`teamId`) USING BTREE,
  CONSTRAINT `player_ibfk_1` FOREIGN KEY (`teamId`) REFERENCES `team` (`teamId`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of player
-- ----------------------------
INSERT INTO `player` VALUES (1, '库里', 30, 1025);
INSERT INTO `player` VALUES (2, '格林', 23, 1025);
INSERT INTO `player` VALUES (3, '维金斯', 22, 1025);
INSERT INTO `player` VALUES (4, '詹姆斯', 23, 1020);
INSERT INTO `player` VALUES (5, '哈登', 13, 1002);
INSERT INTO `player` VALUES (6, '保罗', 3, 1017);

-- ----------------------------
-- Table structure for team
-- ----------------------------
DROP TABLE IF EXISTS `team`;
CREATE TABLE `team`  (
  `teamId` int NOT NULL AUTO_INCREMENT COMMENT '球队ID',
  `teamName` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '球队名称',
  `location` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '球队位置',
  `createTime` date NULL DEFAULT NULL COMMENT '球队建立时间',
  PRIMARY KEY (`teamId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1113 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of team
-- ----------------------------
INSERT INTO `team` VALUES (1001, '76人', '宾夕法尼亚州费城', '1967-01-01');
INSERT INTO `team` VALUES (1002, '篮网', '纽约州布鲁克林', '1967-01-01');
INSERT INTO `team` VALUES (1003, '雄鹿', '威斯康星州密尔沃基', '1968-01-01');
INSERT INTO `team` VALUES (1004, '黄蜂', '夏洛特', '2004-01-01');
INSERT INTO `team` VALUES (1005, '老鹰', '乔治亚州亚特兰大市', '1949-01-01');
INSERT INTO `team` VALUES (1006, '热火', '佛罗里达州迈阿密', '1988-01-01');
INSERT INTO `team` VALUES (1007, '凯尔特人', '马赛诸萨州波士顿', '1946-01-01');
INSERT INTO `team` VALUES (1008, '尼克斯', '纽约州纽约市', '1976-01-01');
INSERT INTO `team` VALUES (1009, '步行者', '印第安纳波利斯', '1967-01-01');
INSERT INTO `team` VALUES (1010, '公牛', '伊利诺斯州芝加哥', '1966-01-01');
INSERT INTO `team` VALUES (1011, '猛龙', '加拿大安大略省多伦多', '1995-01-01');
INSERT INTO `team` VALUES (1012, '骑士', '俄亥俄州克里夫兰', '1970-01-01');
INSERT INTO `team` VALUES (1013, '奇才', '华盛顿D.C', '1961-01-01');
INSERT INTO `team` VALUES (1014, '魔术', '佛罗里达州奥兰多', '1989-01-01');
INSERT INTO `team` VALUES (1015, '活塞', '密歇根州底特律', '1948-01-01');
INSERT INTO `team` VALUES (1016, '爵士', '犹他州盐湖城', '1974-01-01');
INSERT INTO `team` VALUES (1017, '太阳', '亚利桑那州菲尼克斯', '1968-01-01');
INSERT INTO `team` VALUES (1018, '快船', '洛杉矶', '1970-01-01');
INSERT INTO `team` VALUES (1019, '掘金', '科罗拉多州丹佛', '1976-01-01');
INSERT INTO `team` VALUES (1020, '湖人', '加利福尼亚州洛杉矶', '1948-01-01');
INSERT INTO `team` VALUES (1021, '开拓者', '俄勒冈州波特兰', '1970-01-01');
INSERT INTO `team` VALUES (1022, '独行侠', '达拉斯', '1980-01-01');
INSERT INTO `team` VALUES (1023, '灰熊', '田纳西州孟菲斯', '1995-01-01');
INSERT INTO `team` VALUES (1024, '马刺', '德克萨斯州圣安东尼奥', '1976-01-01');
INSERT INTO `team` VALUES (1025, '勇士', '加州奥克兰', '1946-01-01');
INSERT INTO `team` VALUES (1026, '鹈鹕', '新奥尔良', '1988-01-01');
INSERT INTO `team` VALUES (1027, '国王', '加州萨科拉门托', '1948-01-01');
INSERT INTO `team` VALUES (1028, '雷霆', '俄克拉荷马州俄克拉荷马城', '1967-01-01');
INSERT INTO `team` VALUES (1029, '火箭', '德克萨斯州休斯顿', '1967-01-01');
INSERT INTO `team` VALUES (1030, '森林狼', '明尼苏达州明尼阿波利斯', '1989-01-01');
INSERT INTO `team` VALUES (1047, 'lina的球队', '洛杉矶', '2021-04-14');
INSERT INTO `team` VALUES (1053, 'lina的球队', '洛杉矶', '2021-04-16');
INSERT INTO `team` VALUES (1054, '开课吧球队1', '洛杉矶', '2021-04-16');

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`  (
  `user_id` int NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `user_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '用户姓名',
  `user_age` int NULL DEFAULT NULL COMMENT '用户年龄',
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES (1, '贾宝玉', 14);
INSERT INTO `users` VALUES (2, '林黛玉', 13);
INSERT INTO `users` VALUES (3, '薛宝钗', 15);

SET FOREIGN_KEY_CHECKS = 1;

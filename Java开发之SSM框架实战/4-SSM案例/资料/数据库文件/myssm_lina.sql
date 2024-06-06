
DROP DATABASE IF EXISTS myssm_lina;

create DATABASE myssm_lina;
use myssm_lina;

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for adminrole
-- ----------------------------
DROP TABLE IF EXISTS `adminrole`;
CREATE TABLE `adminrole`  (
  `roleId` int NOT NULL AUTO_INCREMENT COMMENT '角色ID',
  `roleName` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '角色名称',
  PRIMARY KEY (`roleId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of adminrole
-- ----------------------------
INSERT INTO `adminrole` VALUES (1, '超级管理员');
INSERT INTO `adminrole` VALUES (2, '球队经理');
INSERT INTO `adminrole` VALUES (3, '主教练');

-- ----------------------------
-- Table structure for admins
-- ----------------------------
DROP TABLE IF EXISTS `admins`;
CREATE TABLE `admins`  (
  `adminId` int NOT NULL AUTO_INCREMENT,
  `loginName` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '登录账号',
  `petName` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '昵称',
  `adminPwd` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '密码',
  `phone` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '手机号',
  `headImg` varchar(130) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '头像',
  `roleId` int NULL DEFAULT NULL COMMENT '角色ID',
  `lastLoginTime` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '上次登录时间',
  `status` int NULL DEFAULT 1 COMMENT '0-离职 1-在职 2-休假',
  `isDel` int NULL DEFAULT 0 COMMENT '是否删除：1-已删除 0-未删除',
  PRIMARY KEY (`adminId`) USING BTREE,
  INDEX `roleId`(`roleId`) USING BTREE,
  CONSTRAINT `admins_ibfk_1` FOREIGN KEY (`roleId`) REFERENCES `adminrole` (`roleId`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of admins
-- ----------------------------
INSERT INTO `admins` VALUES (1, 'admin', '超级小可爱', 'bushuo', '13711111111', NULL, 1, '2021-04-25 12:47:23', 1, 0);
INSERT INTO `admins` VALUES (2, 'lina', '无敌小可爱', 'dasibushuo', '13800000000', NULL, 2, '2021-04-25 12:48:09', 1, 0);

-- ----------------------------
-- Table structure for game
-- ----------------------------
DROP TABLE IF EXISTS `game`;
CREATE TABLE `game`  (
  `gameId` int NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `gameDate` datetime NULL DEFAULT CURRENT_TIMESTAMP COMMENT '比赛日期',
  `homeTeamId` int NULL DEFAULT NULL COMMENT '主队ID',
  `homeTeamScore` int NULL DEFAULT NULL COMMENT '主队得分',
  `visitingTeamId` int NULL DEFAULT NULL COMMENT '客队ID',
  `visitingTeamScore` int NULL DEFAULT NULL COMMENT '客队得分',
  `typeId` int NULL DEFAULT 2 COMMENT '比赛类型',
  `status` int NULL DEFAULT 0 COMMENT '0-正常 1-取消 2-延迟',
  `isDel` int NULL DEFAULT 0 COMMENT '是否删除：1-已删除 0-未删除',
  PRIMARY KEY (`gameId`) USING BTREE,
  INDEX `homeTeamId`(`homeTeamId`) USING BTREE,
  INDEX `visitingTeamId`(`visitingTeamId`) USING BTREE,
  INDEX `typeId`(`typeId`) USING BTREE,
  CONSTRAINT `game_ibfk_1` FOREIGN KEY (`typeId`) REFERENCES `gametype` (`typeId`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `game_ibfk_2` FOREIGN KEY (`homeTeamId`) REFERENCES `team` (`teamId`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `game_ibfk_3` FOREIGN KEY (`visitingTeamId`) REFERENCES `team` (`teamId`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of game
-- ----------------------------
INSERT INTO `game` VALUES (1, '2021-04-24 10:00:00', 1025, 118, 1019, 97, 2, 0, 0);
INSERT INTO `game` VALUES (2, '2021-04-24 10:00:00', 1023, 130, 1021, 128, 2, 0, 0);
INSERT INTO `game` VALUES (3, '2021-04-24 08:00:00', 1013, 129, 1028, 109, 2, 0, 0);
INSERT INTO `game` VALUES (4, '2021-04-24 08:00:00', 1018, 109, 1029, 104, 2, 0, 0);
INSERT INTO `game` VALUES (5, '2021-04-24 08:00:00', 1004, 108, 1012, 102, 2, 0, 0);
INSERT INTO `game` VALUES (6, '2021-04-24 07:30:00', 1002, 109, 1007, 104, 2, 0, 0);
INSERT INTO `game` VALUES (7, '2021-04-24 07:30:00', 1005, 118, 1006, 103, 2, 0, 0);

-- ----------------------------
-- Table structure for gametype
-- ----------------------------
DROP TABLE IF EXISTS `gametype`;
CREATE TABLE `gametype`  (
  `typeId` int NOT NULL AUTO_INCREMENT,
  `typeName` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '比赛类型',
  PRIMARY KEY (`typeId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of gametype
-- ----------------------------
INSERT INTO `gametype` VALUES (1, '季前赛');
INSERT INTO `gametype` VALUES (2, '常规赛');
INSERT INTO `gametype` VALUES (3, '季后赛');
INSERT INTO `gametype` VALUES (4, '总决赛');
INSERT INTO `gametype` VALUES (5, '全明星赛');

-- ----------------------------
-- Table structure for player
-- ----------------------------
DROP TABLE IF EXISTS `player`;
CREATE TABLE `player`  (
  `playerId` int NOT NULL AUTO_INCREMENT COMMENT '球员ID',
  `playerName` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '球员姓名',
  `playerNum` int NULL DEFAULT NULL COMMENT '球衣号码',
  `location` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '位置',
  `birthday` date NULL DEFAULT NULL COMMENT '生日',
  `nationality` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '国籍',
  `height` double NULL DEFAULT NULL COMMENT '身高',
  `weight` double NULL DEFAULT NULL COMMENT '体重',
  `salary` double NULL DEFAULT NULL COMMENT '薪水(万美元)',
  `teamId` int NULL DEFAULT NULL COMMENT '所属球队',
  `status` int NULL DEFAULT 1 COMMENT '状态：0-退役 1-在职',
  `isDel` int NULL DEFAULT 0 COMMENT '是否删除：1-已删除 0-未删除',
  PRIMARY KEY (`playerId`) USING BTREE,
  INDEX `teamId`(`teamId`) USING BTREE,
  CONSTRAINT `player_ibfk_1` FOREIGN KEY (`teamId`) REFERENCES `team` (`teamId`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of player
-- ----------------------------
INSERT INTO `player` VALUES (1, '库里', 30, '后卫', '1988-03-14', 'USA', 190.5, 83.9, 4301, 1025, 1, 0);
INSERT INTO `player` VALUES (2, '格林', 23, '前锋', '1990-03-04', 'USA', 198.1, 104.3, 2225, 1025, 1, 0);
INSERT INTO `player` VALUES (3, '维金斯', 22, '前锋', '1995-02-23', 'Canada', 200.7, 89.3, 2929, 1025, 1, 0);
INSERT INTO `player` VALUES (4, '詹姆斯', 23, '前锋', '1984-12-30', 'USA', 205.7, 113.4, 3922, 1020, 1, 0);
INSERT INTO `player` VALUES (5, '哈登', 13, '后卫', '1989-08-26', 'USA', 195.6, 99.8, 4125, 1002, 1, 0);
INSERT INTO `player` VALUES (6, '保罗', 3, '后卫', '1985-08-06', 'USA', 182.9, 79.4, 4136, 1017, 1, 0);

-- ----------------------------
-- Table structure for team
-- ----------------------------
DROP TABLE IF EXISTS `team`;
CREATE TABLE `team`  (
  `teamId` int NOT NULL AUTO_INCREMENT COMMENT '球队ID',
  `teamName` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '球队名称',
  `chineseName` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '中文名称',
  `coach` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '主教练',
  `stadium` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '主场馆',
  `location` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '球队位置',
  `createTime` date NULL DEFAULT NULL COMMENT '球队建立时间',
  `teamLogo` varchar(150) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '球队logo',
  `area` int NULL DEFAULT 0 COMMENT '所属联盟：0-东部 1-西部',
  `isDel` int NULL DEFAULT 0 COMMENT '是否删除：1-已删除 0-未删除',
  PRIMARY KEY (`teamId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1050 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of team
-- ----------------------------
INSERT INTO `team` VALUES (1001, '76ers', '76人', '道格-里弗斯', '富国银行中心', '宾夕法尼亚州费城', '1967-01-01', 'f6e21d4802754bc3bea5d3ad205cdf86.jpg', 0, 1);
INSERT INTO `team` VALUES (1002, 'Nets', '篮网', '史蒂夫·纳什', '巴克莱中心球馆', '纽约州布鲁克林', '1967-01-01', 'd812c6c531e54e0da7b098bbc4e2c686.jpg', 0, 0);
INSERT INTO `team` VALUES (1003, 'Bucks', '雄鹿', '迈克·布登霍尔泽', '费折球馆', '威斯康星州密尔沃基', '1968-01-01', '3cffcc54a04f4be4977ce1ef924f2db2.jpg', 0, 0);
INSERT INTO `team` VALUES (1004, 'Hornets', '黄蜂', '詹姆斯-格雷戈', '光谱中心', '夏洛特', '2003-01-01', '9f7480f8f7a74906a1cca72c78c2c625.jpg', 0, 0);
INSERT INTO `team` VALUES (1005, 'Hawks', '老鹰', '劳埃德-皮尔斯', '国家农业球馆', '乔治亚州亚特兰大市', '1948-12-31', '5fa8019694384269a626671dd55c8890.jpg', 0, 0);
INSERT INTO `team` VALUES (1006, 'Heat', '热火', '埃里克-斯波尔斯特拉', '美航球馆', '佛罗里达州迈阿密', '1988-01-01', 'd4cdc3ea7bce46cd966616e64acb5088.jpg', 0, 0);
INSERT INTO `team` VALUES (1007, 'Celtics', '凯尔特人', '布拉德-史蒂文斯', 'TD北岸花园球馆', '马赛诸萨州波士顿', '1946-01-01', '0e8effa2c0f34ef89279349385ffb98f.jpg', 0, 0);
INSERT INTO `team` VALUES (1008, NULL, '尼克斯', NULL, NULL, '纽约州纽约市', '1976-01-01', 'f85e27c8636b4bd28a3e47273011add3.jpg', 0, 0);
INSERT INTO `team` VALUES (1009, NULL, '步行者', NULL, NULL, '印第安纳波利斯', '1967-01-01', '7b83376f67e9481480772a899866428a.jpg', 0, 0);
INSERT INTO `team` VALUES (1010, NULL, '公牛', NULL, NULL, '伊利诺斯州芝加哥', '1966-01-01', '745f1e068aba4a91a0c50b0b0c909d0d.jpg', 0, 0);
INSERT INTO `team` VALUES (1011, NULL, '猛龙', NULL, NULL, '加拿大安大略省多伦多', '1995-01-01', '5894bc9c857f4c0296079d6c3c4965d5.jpg', 0, 0);
INSERT INTO `team` VALUES (1012, NULL, '骑士', NULL, NULL, '俄亥俄州克里夫兰', '1970-01-01', '2c78c71767f94c04934dae8fca72ee5c.jpg', 0, 0);
INSERT INTO `team` VALUES (1013, NULL, '奇才', NULL, NULL, '华盛顿D.C', '1961-01-01', 'ddfe2b00af3a46d2957942e83b1d3b44.jpg', 0, 0);
INSERT INTO `team` VALUES (1014, NULL, '魔术', NULL, NULL, '佛罗里达州奥兰多', '1989-01-01', '0b5ce17f5ed74462bb41afc85a238aed.jpg', 0, 0);
INSERT INTO `team` VALUES (1015, NULL, '活塞', NULL, NULL, '密歇根州底特律', '1948-01-01', 'a6b2403cc63e466f99deb19e730c3af9.jpg', 0, 0);
INSERT INTO `team` VALUES (1016, 'Jazz', '爵士', '奎因-斯奈德', '威英特智能家居球馆', '犹他州盐湖城', '1974-01-01', '34375d7a8b9e46619f7b7da4db4c9ffd.jpg', 1, 0);
INSERT INTO `team` VALUES (1017, 'Sun', '太阳', 'test', 'test', '亚利桑那州菲尼克斯', '1968-01-01', NULL, 1, 0);
INSERT INTO `team` VALUES (1018, NULL, '快船', NULL, NULL, '洛杉矶', '1970-01-01', NULL, 1, 0);
INSERT INTO `team` VALUES (1019, NULL, '掘金', NULL, NULL, '科罗拉多州丹佛', '1976-01-01', NULL, 1, 0);
INSERT INTO `team` VALUES (1020, NULL, '湖人', NULL, NULL, '加利福尼亚州洛杉矶', '1948-01-01', NULL, 1, 0);
INSERT INTO `team` VALUES (1021, NULL, '开拓者', NULL, NULL, '俄勒冈州波特兰', '1970-01-01', NULL, 1, 0);
INSERT INTO `team` VALUES (1022, NULL, '独行侠', NULL, NULL, '达拉斯', '1980-01-01', NULL, 1, 0);
INSERT INTO `team` VALUES (1023, NULL, '灰熊', NULL, NULL, '田纳西州孟菲斯', '1995-01-01', NULL, 1, 0);
INSERT INTO `team` VALUES (1024, NULL, '马刺', NULL, NULL, '德克萨斯州圣安东尼奥', '1976-01-01', NULL, 1, 0);
INSERT INTO `team` VALUES (1025, NULL, '勇士', NULL, NULL, '加州奥克兰', '1946-01-01', NULL, 1, 0);
INSERT INTO `team` VALUES (1026, NULL, '鹈鹕', NULL, NULL, '新奥尔良', '1988-01-01', NULL, 1, 0);
INSERT INTO `team` VALUES (1027, NULL, '国王', NULL, NULL, '加州萨科拉门托', '1948-01-01', NULL, 1, 0);
INSERT INTO `team` VALUES (1028, NULL, '雷霆', NULL, NULL, '俄克拉荷马州俄克拉荷马城', '1967-01-01', NULL, 1, 0);
INSERT INTO `team` VALUES (1029, NULL, '火箭', NULL, NULL, '德克萨斯州休斯顿', '1967-01-01', '5fc8272ac687497c8a74f17051b5da80.jpg', 1, 0);
INSERT INTO `team` VALUES (1030, NULL, '森林狼', NULL, NULL, '明尼苏达州明尼阿波利斯', '1989-01-01', NULL, 1, 0);

SET FOREIGN_KEY_CHECKS = 1;

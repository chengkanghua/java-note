/*
 Navicat Premium Data Transfer

 Source Server         : mysqltest
 Source Server Type    : MySQL
 Source Server Version : 80022
 Source Host           : localhost:3306
 Source Schema         : nba

 Target Server Type    : MySQL
 Target Server Version : 80022
 File Encoding         : 65001

 Date: 25/06/2021 19:07:46
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for 篮网
-- ----------------------------
DROP TABLE IF EXISTS `篮网`;
CREATE TABLE `篮网`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `last_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `first_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `year_salary` decimal(10, 2) NULL DEFAULT NULL,
  `number` int(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of 篮网
-- ----------------------------
INSERT INTO `篮网` VALUES (1, '凯文', '杜兰特', 35000000.00, 5);
INSERT INTO `篮网` VALUES (2, '凯里', '欧文', 30000000.00, 2);
INSERT INTO `篮网` VALUES (3, '詹姆斯', '哈登', 40000000.00, 13);

SET FOREIGN_KEY_CHECKS = 1;

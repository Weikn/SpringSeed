/*
 Navicat Premium Data Transfer

 Source Server         : 野草
 Source Server Type    : MySQL
 Source Server Version : 50646
 Source Host           : 45.144.137.40:3306
 Source Schema         : springseed

 Target Server Type    : MySQL
 Target Server Version : 50646
 File Encoding         : 65001

 Date: 06/03/2020 15:24:40
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for NOTE
-- ----------------------------
DROP TABLE IF EXISTS `NOTE`;
CREATE TABLE `NOTE`  (
  `NOTE_ID` int(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  `NOTE_TITLE` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `NOTE_SUMMARY` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `NOTE_CONTENT` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
  `NOTE_CREATE_DATE` datetime(0) NULL DEFAULT NULL,
  `NOTE_UPDATE` datetime(0) NULL DEFAULT NULL,
  `NOTE_USER_ID` int(11) NULL DEFAULT NULL,
  `USER_BOOK_ID` int(11) NULL DEFAULT NULL,
  `PARTY_TYPE` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `PARTY_CODE` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `FILE_CONTENT_ID` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`NOTE_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of NOTE
-- ----------------------------
INSERT INTO `NOTE` VALUES (1, '随时随地', '是的', '但是大多数', '2020-03-01 22:11:23', '2020-03-01 22:11:28', 1, 1, NULL, NULL, 1);

-- ----------------------------
-- Table structure for NOTE_CONTENT
-- ----------------------------
DROP TABLE IF EXISTS `NOTE_CONTENT`;
CREATE TABLE `NOTE_CONTENT`  (
  `FILE_ID` int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '附件',
  `FILE_NAME` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `FILE_SIZE` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `FILE_PATH` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `UPLOAD_DATE` datetime(0) NULL DEFAULT NULL,
  `FILE_CODE` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `PARTY_TYPE` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `PARTY_CODE` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`FILE_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of NOTE_CONTENT
-- ----------------------------
INSERT INTO `NOTE_CONTENT` VALUES (1, 'test.txt', '20', '/home', '2020-03-02 00:47:53', NULL, NULL, NULL);

-- ----------------------------
-- Table structure for USER
-- ----------------------------
DROP TABLE IF EXISTS `USER`;
CREATE TABLE `USER`  (
  `USER_ID` int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键Id',
  `USER_NAME` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `USER_CODE` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `USER_SEX` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `USER_AGR` int(4) NULL DEFAULT NULL,
  `USER_PWD` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `USER_MAIL` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `LAST_NAME` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `FIAST_NAME` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `PARTY_TYPE` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `PARTY_CODE` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `USER_CREATE_DATE` datetime(0) NULL DEFAULT NULL,
  `USER_UPDATE` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`USER_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of USER
-- ----------------------------
INSERT INTO `USER` VALUES (1, 'aweikn', 'weikn', 'man', 18, '123', '122@12.com', 'qwi', 'al', NULL, NULL, '2020-02-29 03:13:10', '2020-02-29 03:13:14');

-- ----------------------------
-- Table structure for USER_BOOK
-- ----------------------------
DROP TABLE IF EXISTS `USER_BOOK`;
CREATE TABLE `USER_BOOK`  (
  `USER_BOOK_ID` int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '笔记本id',
  `USER_BOOK_NAME` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `USER_BOOK_CREATE_DATE` datetime(0) NULL DEFAULT NULL,
  `USER_BOOK_UPDATE` datetime(0) NULL DEFAULT NULL,
  `USER_ID` int(11) NULL DEFAULT NULL,
  `PARTY_TYPE` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `PARTY_CODE` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `USER_BOOK_STATUS` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`USER_BOOK_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

SET FOREIGN_KEY_CHECKS = 1;

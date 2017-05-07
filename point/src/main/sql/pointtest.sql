/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50716
Source Host           : localhost:3306
Source Database       : pointtest

Target Server Type    : MYSQL
Target Server Version : 50716
File Encoding         : 65001

Date: 2017-04-28 18:06:58
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for corp
-- ----------------------------
DROP TABLE IF EXISTS `corp`;
CREATE TABLE `corp` (
  `id` int(11) NOT NULL,
  `corpType` varchar(255) DEFAULT NULL,
  `corpCode` varchar(255) DEFAULT NULL,
  `corpName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of corp
-- ----------------------------

-- ----------------------------
-- Table structure for point
-- ----------------------------
DROP TABLE IF EXISTS `point`;
CREATE TABLE `point` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userId` int(11) DEFAULT '0',
  `corpId` int(11) DEFAULT '0',
  `createDate` datetime DEFAULT NULL,
  `updateDate` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `validPoint` int(11) DEFAULT NULL,
  `expiredPoint` int(11) DEFAULT NULL,
  `freezingPoint` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `userId` (`userId`),
  KEY `corpId` (`corpId`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of point
-- ----------------------------
INSERT INTO `point` VALUES ('14', '6', '1', '2017-04-26 21:14:16', '2017-04-26 21:24:50', '-1', '30', '30');
INSERT INTO `point` VALUES ('15', '2', '2', '2017-04-28 17:14:52', '2017-04-28 17:14:52', '200', '100', '300');

-- ----------------------------
-- Table structure for pointlist
-- ----------------------------
DROP TABLE IF EXISTS `pointlist`;
CREATE TABLE `pointlist` (
  `id` int(11) NOT NULL,
  `userId` int(11) NOT NULL,
  `corpId` int(11) NOT NULL,
  `seq` int(255) NOT NULL,
  `action` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `point` int(11) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `dealDate` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `dealId` int(11) DEFAULT NULL,
  `dealType` varchar(255) DEFAULT NULL,
  `pointActionDate` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `corpId` (`corpId`),
  KEY `userId` (`userId`),
  KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pointlist
-- ----------------------------

-- ----------------------------
-- Table structure for pointlistcount
-- ----------------------------
DROP TABLE IF EXISTS `pointlistcount`;
CREATE TABLE `pointlistcount` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `corpId` int(11) DEFAULT NULL,
  `userId` int(11) DEFAULT NULL,
  `count` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pointlistcount
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `corpId` int(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'baby1', '20', '1');
INSERT INTO `user` VALUES ('2', 'baby', '20', '1');
INSERT INTO `user` VALUES ('3', 'baby2', '20', '1');

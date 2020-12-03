/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 50722
 Source Host           : localhost:3306
 Source Schema         : cfb_springboot

 Target Server Type    : MySQL
 Target Server Version : 50722
 File Encoding         : 65001

 Date: 10/09/2020 09:51:57
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for permission
-- ----------------------------
DROP TABLE IF EXISTS `permission`;
CREATE TABLE `permission`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `permissionname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `resourceType` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `permission` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `status` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `create_time` date DEFAULT NULL,
  `update_time` date DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of permission
-- ----------------------------
INSERT INTO `permission` VALUES (1, '用户管理', 'menu', 'userlist', 'user:list', 'use', '2018-08-10', '2018-08-10');
INSERT INTO `permission` VALUES (2, '用户修改', 'menu', 'useredit', 'user:edit', 'use', '2018-08-10', '2018-08-10');
INSERT INTO `permission` VALUES (3, '用户删除', 'menu', 'userdelete', 'user:delete', 'use', '2018-08-10', '2018-08-10');

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `rolename` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `status` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `create_time` date DEFAULT NULL,
  `update_time` date DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES (1, 'admin', '管理员', 'use', '2018-08-10', '2018-08-10');
INSERT INTO `role` VALUES (2, 'manage', '经理', 'use', '2018-08-10', '2018-08-10');
INSERT INTO `role` VALUES (3, 'user', '普通用户', 'use', '2018-08-10', '2018-08-10');

-- ----------------------------
-- Table structure for role_permission
-- ----------------------------
DROP TABLE IF EXISTS `role_permission`;
CREATE TABLE `role_permission`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `permission_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of role_permission
-- ----------------------------
INSERT INTO `role_permission` VALUES (1, '1', '1');
INSERT INTO `role_permission` VALUES (2, '1', '2');
INSERT INTO `role_permission` VALUES (3, '1', '3');
INSERT INTO `role_permission` VALUES (4, '2', '1');
INSERT INTO `role_permission` VALUES (5, '2', '2');
INSERT INTO `role_permission` VALUES (6, '3', '1');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `mobile` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `sex` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `nickname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 15 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'admin', '123456', '13918891675', 'mmc@163.com', '男', '管理员');
INSERT INTO `user` VALUES (2, 'lisi2', '123456', '13918891675', 'mmc@163.com', 'm', 'lisi1');
INSERT INTO `user` VALUES (3, 'lisi3', '123456', '13918891675', 'mmc@163.com', 'm', 'lisi1');
INSERT INTO `user` VALUES (4, 'lisi4', '123456', '13918891675', 'mmc@163.com', 'm', 'lisi1');
INSERT INTO `user` VALUES (5, 'lisi5', '123456', '13918891675', 'mmc@163.com', 'm', 'lisi1');
INSERT INTO `user` VALUES (6, 'lisi6', '123456', '13918891675', 'mmc@163.com', 'm', 'lisi1');
INSERT INTO `user` VALUES (7, 'lisi7', '123456', '13918891675', 'mmc@163.com', 'm', 'lisi1');
INSERT INTO `user` VALUES (8, 'lisi8', '123456', '13918891675', 'mmc@163.com', 'm', 'lisi1');
INSERT INTO `user` VALUES (9, 'lisi9', '123456', '13918891675', 'mmc@163.com', 'm', 'lisi1');
INSERT INTO `user` VALUES (10, 'lisi10', '123456', '13918891675', 'mmc@163.com', 'm', 'lisi1');
INSERT INTO `user` VALUES (11, 'lisi11', '123456', '13918891675', 'mmc@163.com', 'm', 'lisi1');
INSERT INTO `user` VALUES (12, 'lisi12', '123456', '13918891675', 'mmc@163.com', 'm', 'lisi1');
INSERT INTO `user` VALUES (13, 'lisi13', '123456', '13918891675', 'mmc@163.com', 'm', 'lisi1');
INSERT INTO `user` VALUES (14, 'lisi14', '123456', '13918891675', 'mmc@163.com', 'm', 'lisi1');

-- ----------------------------
-- Table structure for user_role
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `role_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user_role
-- ----------------------------
INSERT INTO `user_role` VALUES (1, '1', '1');
INSERT INTO `user_role` VALUES (2, '1', '2');
INSERT INTO `user_role` VALUES (3, '1', '3');
INSERT INTO `user_role` VALUES (4, '2', '2');
INSERT INTO `user_role` VALUES (5, '3', '3');
INSERT INTO `user_role` VALUES (6, '4', '3');

SET FOREIGN_KEY_CHECKS = 1;

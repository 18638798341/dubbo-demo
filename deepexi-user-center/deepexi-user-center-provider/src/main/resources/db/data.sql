/*
 Navicat Premium Data Transfer

 Source Server         : 127.0.0.1
 Source Server Type    : MySQL
 Source Server Version : 80015
 Source Host           : 127.0.0.1:3306
 Source Schema         : demo

 Target Server Type    : MySQL
 Target Server Version : 80015
 File Encoding         : 65001

 Date: 02/07/2019 01:10:10
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for component
-- ----------------------------
DROP TABLE IF EXISTS `component`;
CREATE TABLE `component`  (
  `id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '主键',
  `component_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '组件名称',
  `version` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '版本',
  `category` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '分类',
  `state` tinyint(4) NULL DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of component
-- ----------------------------
INSERT INTO `component` VALUES ('03cb658d19ec4e7f8000893ec8ba04f2', 'Redis2', 'v1.0.0', '基础设施', 0);
INSERT INTO `component` VALUES ('1cd35a9b43bf49c3ab3c3ddfef8f2034', '营销中心2', 'v1.0.0', '业务中台', 0);
INSERT INTO `component` VALUES ('4fa491b94d8048028ef051174b0d5d15', 'edas-config', 'v1.0.0', '基础设施', 0);
INSERT INTO `component` VALUES ('7a7e70e6a2a345519d4023c4e1e61c76', 'sonar', 'v1.0.0', '基础设施', 0);
INSERT INTO `component` VALUES ('8fe824b82fc64971abdc5093a918ccf5', 'TIDB', 'v1.0.0', '基础设施', 1);
INSERT INTO `component` VALUES ('aad911fe45864cf481c0a57ad6428a08', 'RocketMQ', 'v1.0.0', '基础设施', 0);

SET FOREIGN_KEY_CHECKS = 1;

/*
*创建用户
*/
create user supershop identified by 'supershop';
grant all on db_supershop.* to supershop;

/*
*创建书籍库
*/

create database db_SuperShop;
use db_SuperShop;

/*
*用户表
*/
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `address` varchar(200) NOT NULL,
  `birthday` datetime NOT NULL,
  `zipCode` varchar(6) NOT NULL,
  `email` varchar(20) NOT NULL,
  `mobile` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `sex` varchar(5) DEFAULT NULL,
  `status` int NOT NULL,
  `trueName` varchar(20) NOT NULL,
  `user_name` varchar(20) NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `bigtype`;
CREATE TABLE `bigtype` (
  `bt_id` int(11) NOT NULL AUTO_INCREMENT,
  `bt_name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`bt_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `smalltype`;

CREATE TABLE `smalltype` (
  `st_id` int(11) NOT NULL AUTO_INCREMENT,
  `st_name` varchar(50) DEFAULT NULL,
  `bt_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`st_id`),
  KEY `FK_bigtype_bt_id` (`bt_id`),
  CONSTRAINT `FK_bigtype_bt_id` FOREIGN KEY (`bt_id`) REFERENCES `bigtype` (`bt_id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `product`;

CREATE TABLE `product` (
  `product_id` int(11) NOT NULL AUTO_INCREMENT,
   product_name varchar(50) not null,
  `description` varchar(2000) DEFAULT NULL,
   price float not null,
   amount int not null,
   p_image varchar(500) DEFAULT NULL,
  `bt_id` int(11) DEFAULT NULL,
  `st_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`product_id`),
  KEY `FK_bigtype_bt_id1` (`bt_id`),
  KEY `FK_smalltype_bt_id` (`st_id`),
  CONSTRAINT `FK_bigtype_bt_id1` FOREIGN KEY (`bt_id`) REFERENCES `bigtype` (`bt_id`),
  CONSTRAINT `FK_smalltype_bt_id` FOREIGN KEY (`st_id`) REFERENCES `smalltype` (`st_id`)
) ENGINE=InnoDB AUTO_INCREMENT=297 DEFAULT CHARSET=utf8;

drop table if exists `order`;
CREATE TABLE `order` (
  `order_id` int(11) NOT NULL AUTO_INCREMENT,
  `cost` float NOT NULL,
  `createTime` datetime not NULL,
  `order_no` varchar(255) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  payment varchar(50) not null,
  Consignee_ment varchar(50) not null, 
  Consignee_name varchar(25) not null,
  Consignee_address varchar(200) not null,
  Consignee_zipcode varchar(6) not null,
  Consignee_mobile  varchar(20) not null,
  Consignee_email varchar(20) not null,
  PRIMARY KEY (`order_id`),
  KEY `FK_user_user_id` (`user_id`),
  CONSTRAINT `FK_user_user_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `orderDetail`;

CREATE TABLE `orderDetail` (
  `od_id` int(11) NOT NULL AUTO_INCREMENT,
  `od_num` int(11) NOT NULL,
  `order_id` int(11) DEFAULT NULL,
  `product_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`od_id`),
  KEY `FK_order_order_id` (`order_id`),
  KEY `FK_product_product_id` (`product_id`),
  CONSTRAINT `FK_product_product_id` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`),
  CONSTRAINT `FK_order_order_id` FOREIGN KEY (`order_id`) REFERENCES `order` (`order_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `shoppingCart`;

CREATE TABLE `shoppingCart` (
  `sc_id` int(11) NOT NULL AUTO_INCREMENT,
  `sc_num` int(11) NOT NULL,
  `user_id` int(11) DEFAULT NULL,
  `product_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`sc_id`),
  KEY `FK_user_user_id1` (`user_id`),
  KEY `FK_product_product_id1` (`product_id`),
  CONSTRAINT `FK_product_product_id1` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`),
  CONSTRAINT `FK_user_user_id1` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;


SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS t_detaile;
DROP TABLE IF EXISTS t_seal;




/* Create Tables */

-- 房源的详细信息
CREATE TABLE t_detaile
(
	id bigint unsigned NOT NULL AUTO_INCREMENT COMMENT '自增编号',
	houseid bigint unsigned COMMENT '房屋编码',
	publictime datetime COMMENT '发布时间',
	name varchar(32) COMMENT '小区名称',
	housetype varchar(16) COMMENT '房屋类型，例如普通住宅',
	dealtime varchar(16) COMMENT '交易时间，满两年',
	orientation varchar(16) COMMENT '房屋朝向，南北',
	justone tinyint unsigned COMMENT '是否唯一，0否，1是',
	decoration varchar(16) COMMENT '装修程度',
	addtime timestamp COMMENT '增加时间',
	img varchar(512) COMMENT '户型图片',
	PRIMARY KEY (id)
) COMMENT = '房源的详细信息';


-- t_seal : 房源的概括信息
CREATE TABLE t_seal
(
	id bigint unsigned NOT NULL AUTO_INCREMENT COMMENT '自增编号',
	title varchar(512) COMMENT '标题',
	herf varchar(1024) COMMENT '详细内容连接',
	housetype varchar(126) COMMENT '户型',
	area varchar(32) COMMENT '面积',
	blocktype varchar(32) COMMENT '楼层类型',
	year varchar(32) COMMENT '建造时间',
	address varchar(128) COMMENT '地址',
	totleprice double COMMENT '总价',
	unitprice varchar(24) COMMENT '单价',
	addtime timestamp COMMENT '增加时间',
	detailid bigint unsigned COMMENT '详细信息的编号',
	PRIMARY KEY (id),
	UNIQUE (id)
) COMMENT = 't_seal : 房源的概括信息';




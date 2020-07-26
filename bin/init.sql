CREATE SCHEMA shaobiaoju;

use shaobiaoju;

-- auto-generated definition
CREATE TABLE agent
(
  id   VARCHAR(20)  NOT NULL
  COMMENT '代理人编码'
    PRIMARY KEY,
  name VARCHAR(500) NULL
  COMMENT '代理人名称'
)
  COMMENT '商标代理人信息'
  ENGINE = InnoDB;

-- auto-generated definition
CREATE TABLE applicant
(
  id                INT          NOT NULL
  COMMENT '注册号/申请号 registration_no'
    PRIMARY KEY,
  type              INT          NULL
  COMMENT '国际分类',
  applicant_name_cn VARCHAR(100) NULL
  COMMENT '注册人中文名称',
  applicant_name_en VARCHAR(100) NULL
  COMMENT '注册人外文名称',
  address_cn        TINYTEXT     NULL
  COMMENT '注册人中文地址',
  address_en        TINYTEXT     NULL
  COMMENT '注册人英文地址'
)
  COMMENT '商标注册人信息'
  ENGINE = InnoDB;

-- auto-generated definition
CREATE TABLE trademark_baseinfo
(
  id                  INT                                NOT NULL
  COMMENT '注册号/申请号 registration_no'
    PRIMARY KEY,
  type                INT                                NULL
  COMMENT '国际分类',
  date                DATE                               NULL
  COMMENT '申请日期',
  trademark_name      VARCHAR(200)                       NULL
  COMMENT '商标名称',
  trademark_type      VARCHAR(5)                         NULL
  COMMENT '商标类型',
  agent_no            VARCHAR(20)                        NULL
  COMMENT '代理机构代码',
  irn_no              VARCHAR(20)                        NULL
  COMMENT '初审公告期号',
  irn_date            DATE                               NULL
  COMMENT '初审公告日期',
  rn_no               VARCHAR(20)                        NULL
  COMMENT '注册公告期号',
  rn_date             DATE                               NULL
  COMMENT '注册公告日期',
  dp_start_date       DATE                               NULL
  COMMENT '专用期开始日期',
  dp_end_date         DATE                               NULL
  COMMENT '专用期结束日期',
  expire              VARCHAR(10)                        NULL
  COMMENT '专用有效期',
  design_description  TEXT                               NULL
  COMMENT '商标设计说明',
  color_description   TEXT                               NULL
  COMMENT '商标颜色说明',
  give_up_description TEXT                               NULL
  COMMENT '放弃专用权说明',
  is_stereoscopic     TINYINT                            NULL
  COMMENT '是否立体商标',
  is_public           TINYINT                            NULL
  COMMENT '是否共有申请',
  shape               TEXT                               NULL
  COMMENT '商标形态',
  geography_info      TEXT                               NULL
  COMMENT '地理标志信息',
  color_id            INT                                NULL
  COMMENT '颜色标志',
  is_well_known       TINYINT                            NULL
  COMMENT '是否驰名商标',
  is_use              TINYINT DEFAULT '0'                NULL
  COMMENT '是否已使用',
  insert_time         DATETIME DEFAULT CURRENT_TIMESTAMP NULL,
  update_time         DATETIME DEFAULT CURRENT_TIMESTAMP NULL ON UPDATE CURRENT_TIMESTAMP
)
  COMMENT '注册商标基本信息'
  ENGINE = InnoDB;

CREATE INDEX trademark_baseinfo_date_is_use_index
  ON trademark_baseinfo (date, is_use);

CREATE INDEX trademark_baseinfo_is_use_index
  ON trademark_baseinfo (is_use);


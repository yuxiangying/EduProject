-----1.常量信息配置表
CREATE TABLE yxy.t_ctl_param (
  ctl_type varchar2(30) not null,
  ctl_code varchar2(120) not null,
  ctl_param varchar2(2048),
  flag varchar2(6),
  remark varchar2(300),
  createtime Date,
  updatetime Date
);
alter table t_ctl_param add constraint PK_ctl_param primary key (ctl_type,ctl_code);
comment on table yxy.t_ctl_param is '常量信息配置表';
comment on column yxy.t_ctl_param.ctl_type is '常量类型';
comment on column yxy.t_ctl_param.ctl_code is '常量代码';
comment on column yxy.t_ctl_param.ctl_param is '常量内容';
comment on column yxy.t_ctl_param.flag is '是否可用(0可用，1不可用)';
comment on column yxy.t_ctl_param.remark is '描述';
comment on column yxy.t_ctl_param.createtime is '创建日期';
comment on column yxy.t_ctl_param.updatetime is '更新日期';



-----2.会员表
CREATE TABLE yxy.t_member (
  id number(16) not null,
  name varchar2(50) not null,
  password varchar2(50) not null,
  sex varchar2(6),
  tel varchar2(15),
  email varchar2(30),
  address varchar2(120),
  status varchar2(6),
  filename varchar2(120),
  remark varchar2(300),
  levelId varchar2(120),
  scoreoperation number(16),
  createtime Date,
  updatetime Date
);
alter table t_member add constraint PK_member primary key (id);
comment on table yxy.t_member is '会员表';
comment on column yxy.t_member.id is 'ID';
comment on column yxy.t_member.name is '用户名';
comment on column yxy.t_member.password is '密码';
comment on column yxy.t_member.sex is '性别(0男，1女，2保密)';
comment on column yxy.t_member.tel is '手机';
comment on column yxy.t_member.email is '邮箱';
comment on column yxy.t_member.address is '地址';
comment on column yxy.t_member.status is '状态(0已启用，1已停用，2已删除)';
comment on column yxy.t_member.filename is '附件路径';
comment on column yxy.t_member.remark is '备注';
comment on column yxy.t_member.levelId is '会员等级ID';
comment on column yxy.t_member.scoreoperation is '总积分';
comment on column yxy.t_member.createtime is '创建日期';
comment on column yxy.t_member.updatetime is '更新日期';

create sequence seq_member
minvalue 1
maxvalue 999999999999--最大的值
start with 1
increment by 1
noorder nocycle
cache 100--缓冲区


-----3.会员等级表
CREATE TABLE yxy.t_member_level (
  id number(16) not null,
  levelname varchar2(50) not null,
  remark varchar2(300),
  createtime Date,
  updatetime Date
);
alter table t_member_level add constraint PK_member_level primary key (id);
comment on table yxy.t_member_level is '会员等级表';
comment on column yxy.t_member_level.id is 'ID';
comment on column yxy.t_member_level.levelname is '等级名称(0普通，1银牌，2金牌，3钻石)';
comment on column yxy.t_member_level.remark is '备注';
comment on column yxy.t_member_level.createtime is '创建日期';
comment on column yxy.t_member_level.updatetime is '更新日期';

create sequence seq_member_level
minvalue 1
maxvalue 999999999999--最大的值
start with 1
increment by 1
noorder nocycle
cache 100--缓冲区

-----4.会员积分明细表
CREATE TABLE yxy.t_member_scoreoperation (
  id number(16) not null,
  memberId number(16) not null,
  operate varchar2(6),
  score number(16),
  profitlossstatus varchar2(6),
  createtime Date,
  updatetime Date
);
alter table t_member_scoreoperation add constraint PK_member_scoreoperation primary key (id);
comment on table yxy.t_member_scoreoperation is '会员积分明细表';
comment on column yxy.t_member_scoreoperation.id is 'ID';
comment on column yxy.t_member_scoreoperation.memberId is '会员拥有者ID';
comment on column yxy.t_member_scoreoperation.operate is '操作(0充值，1签到，2购买商品奖励，3分享产品，4购买商品失去)';
comment on column yxy.t_member_scoreoperation.profitlossstatus is '盈亏状态(1盈，2亏)';
comment on column yxy.t_member_scoreoperation.createtime is '创建日期';
comment on column yxy.t_member_scoreoperation.updatetime is '更新日期';

create sequence seq_member_scoreoperation
minvalue 1
maxvalue 999999999999--最大的值
start with 1
increment by 1
noorder nocycle
cache 100--缓冲区

-----5.会员分享记录表
CREATE TABLE yxy.t_member_share (
  id number(16) not null,
  memberId number(16) not null,
  productId number(16) not null,
  createtime Date,
  updatetime Date
);
alter table t_member_share add constraint PK_member_share primary key (id);
comment on table yxy.t_member_share is '会员分享记录表';
comment on column yxy.t_member_share.id is 'ID';
comment on column yxy.t_member_share.memberId is '会员拥有者ID';
comment on column yxy.t_member_share.productId is '产品ID';
comment on column yxy.t_member_share.createtime is '创建日期';
comment on column yxy.t_member_share.updatetime is '更新日期';

create sequence seq_member_share
minvalue 1
maxvalue 999999999999--最大的值
start with 1
increment by 1
noorder nocycle
cache 100--缓冲区

-----6.产品品种表
CREATE TABLE yxy.t_product_brand (
  id number(16) not null,
  brandname varchar2(50) not null,
  logoname varchar2(120),
  place varchar2(6),
  remark varchar2(300),
  createtime Date,
  updatetime Date
);
alter table t_product_brand add constraint PK_product_brand primary key (id);
comment on table yxy.t_product_brand is '产品品种表';
comment on column yxy.t_product_brand.id is 'ID';
comment on column yxy.t_product_brand.brandname is '品种名称';
comment on column yxy.t_product_brand.logoname is 'logo名称';
comment on column yxy.t_product_brand.place is '产地(0国内品牌，1国外品牌)';
comment on column yxy.t_product_brand.remark is '描述';
comment on column yxy.t_product_brand.createtime is '创建日期';
comment on column yxy.t_product_brand.updatetime is '更新日期';

create sequence seq_product_brand
minvalue 1
maxvalue 999999999999--最大的值
start with 1
increment by 1
noorder nocycle
cache 100--缓冲区

-----7.产品分类标签表
CREATE TABLE yxy.t_product_category (
  id number(16) not null,
  parentid number(16),
  categoryname varchar2(50) not null,
  remark varchar2(300),
  createtime Date,
  updatetime Date
);
alter table t_product_category add constraint PK_product_category primary key (id);
comment on table yxy.t_product_category is '产品分类标签表';
comment on column yxy.t_product_category.id is 'ID';
comment on column yxy.t_product_category.parentid is '父类ID';
comment on column yxy.t_product_category.categoryname is '标签名称';
comment on column yxy.t_product_category.remark is '描述';
comment on column yxy.t_product_category.createtime is '创建日期';
comment on column yxy.t_product_category.updatetime is '更新日期';

create sequence seq_product_category
minvalue 1
maxvalue 999999999999--最大的值
start with 1
increment by 1
noorder nocycle
cache 100--缓冲区

-----8.产品表
CREATE TABLE yxy.t_product (
  id number(16) not null,
  productname varchar2(50) not null,
  brandid varchar2(16),
  catagoryid varchar2(16),
  priority varchar2(6),
  stadard number(15),
  place varchar2(120),
  texture varchar2(300),
  unit varchar2(6),
  weight number(15),
  showprice number(15),
  marketprice number(15),
  costprice number(15),
  minprice number(15),
  sellstarttime Date,
  sellendtime Date,
  keyword varchar2(300),
  remark varchar2(300),
  thumbnailname varchar2(120),
  picturename varchar2(120),
  detail clob,
  totalquantity number(15),
  salequantity number(15),

  createtime Date,
  updatetime Date
);
alter table t_product add constraint PK_product primary key (id);
comment on table yxy.t_product is '产品分类标签表';
comment on column yxy.t_product.id is 'ID';
comment on column yxy.t_product.productname is '产品名称';
comment on column yxy.t_product.brandid is '品种ID';
comment on column yxy.t_product.catagoryid is '分类标签ID';
comment on column yxy.t_product.priority is '排序值';
comment on column yxy.t_product.stadard is '规格(单位：枝)';
comment on column yxy.t_product.place is '产地';
comment on column yxy.t_product.texture is '材质';
comment on column yxy.t_product.unit is '单位(0枝，1件，2斤，3套)';
comment on column yxy.t_product.weight is '重量(kg)';
comment on column yxy.t_product.showprice is '产品展示价格';
comment on column yxy.t_product.marketprice is '市场价格';
comment on column yxy.t_product.costprice is '成本价格';
comment on column yxy.t_product.minprice is '最低销售价格';
comment on column yxy.t_product.sellstarttime is '销售开始时间';
comment on column yxy.t_product.sellendtime is '销售结束时间';
comment on column yxy.t_product.keyword is '关键字';
comment on column yxy.t_product.remark is '产品摘要';
comment on column yxy.t_product.thumbnailname is '缩略图名称';
comment on column yxy.t_product.picturename is '图片名称';
comment on column yxy.t_product.detail is '详细内容';
comment on column yxy.t_product.totalquantity is '总数量';
comment on column yxy.t_product.salequantity is '已销售数量';
comment on column yxy.t_product.createtime is '创建日期';
comment on column yxy.t_product.updatetime is '更新日期';

create sequence seq_product
minvalue 1
maxvalue 999999999999--最大的值
start with 1
increment by 1
noorder nocycle
cache 100--缓冲区
# 简易数据库文档生成器使用说明

#### 介绍
简易数据库文档生成器，目前仅支持EXCEl和WORD的导出，生成的文档将分别保存在./数据库文档/excel以及./数据库文档/word。

#### 配置说明
db.setting（数据库配置）

```
## 可选配置
# 是否在日志中显示执行的SQL
showSql = true
# 是否格式化显示的SQL
formatSql = false
# 是否显示SQL参数
showParams = true
# 打印SQL的日志等级，默认debug，可以是info、warn、error
sqlLevel = debug

## 数据库配置（替换ip即可，information_schema是固定的）
[tableinfodb]
url = jdbc:mysql://127.0.0.1:3306/information_schema?useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai&useSSL=false
user = root
pass = 123456

## 数据库配置
[masterdb]
url = jdbc:mysql://127.0.0.1:3306/demo?useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai&useSSL=false
user = root
pass = 123456
```

dbdoc.setting（导出文件参数配置）

```
## 导出文件参数配置
[docinfo]
## 数据库名称（必填无论是导出excel还是word）
dbname = demo
## 系统名称（导出word时必填）
systemname = xxx系统
## 部门名称（导出word时必填）
departmentname = xxx开发一部
## 用户名称（导出word时必填）
username = 张三
```
# baseframework
Java后台基础框架

## 使用说明
1.将项目clone到本地： https://github.com/HuntDogTech/baseframework.git
2.执行maven，下载依赖jar包
3.创建数据库： baseframework  注意需要数据库编码为utf-8
4.修改resource文件夹中的application.properties文件中的用户名密码信息
5.运行cn.huntdog.baseframework.Application.java  (在此之前最好跑一下test文件夹中的test case，确保与数据库连接正常)
6.浏览器中输入http://localhost:8080/users/1 即可查看到该数据的json格式

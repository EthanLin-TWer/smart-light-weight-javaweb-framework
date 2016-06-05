# README.md

This project is a step by step demo project following the book *Architecture Adventure: Java Web Framework from zero to one* written by Yong Huang. It's all(or at least more)about Java Web backend development and involves with Servlet/JSP/JSTL, MVC with controller/service/model, and advanced AOP. Further we'll build ourselves a light-weight backend framework called smart-framework.

Feedback please go check this out: [FEEDBACK.md](FEEDBACK.md).

My learning and thinking are noted down here: [Learning and thinking](LEARNING-AND-THINKING.md).

## Installation
```bash
# Clone repo from github
git clone git@github.com:linesh-simplicity/stepbystep-servlet-maven-javaweb-project.git
cd stepbystep-servlet-maven-javaweb-project
```

## Start up
```bash
# Install all maven dependencies and start maven tomcat plugin
mvn clean install
mvn tomcat7:run

visit: localhost:45096/stepbystep-servlet-maven-javaweb-project/hello
```

# ~~吃~~读我

本仓库是黄勇《架构探险: 从零开始写Java Web框架》一书的练习仓库。书主要讲解如何从零搭建一个轻量级的后端框架, 并从一个最简单没有框架的纯servlet程序讲起, 讲及后端模板JSP/JSTL, 后讲到基本的controller/service/model, MVC宜家三大件。练习过程会穿插我的思考, 比如前后端分离、RESTful等趋势, 不下定论, 多思考, 特别是**后端模板技术**, 它优劣何在, 反映了企业IT部门怎样的结构, 是否需要、以及如何变更等问题。

阅读本书的反馈, 请前往[FEEDBACK.md](FEEDBACK.md)。

动手及阅读过程中的笔记和思考, 请前往 [Learning and thinking](LEARNING-AND-THINKING.md)。

## 安装
```bash
# 从github上clone下代码
git clone git@github.com:linesh-simplicity/stepbystep-servlet-maven-javaweb-project.git
cd stepbystep-servlet-maven-javaweb-project
```

## Start up
```bash
# 安装mvn依赖并启动maven的tomcat插件
mvn clean install
mvn tomcat7:run

访问: localhost:45096/stepbystep-servlet-maven-javaweb-project/hello
```
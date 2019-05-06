# springboot-unittest-demo

Here is a demo for springboot mybatis test demo

please change mysql configs in  application.yml,

Tables needed are as follow：

```
CREATE TABLE `student` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `title` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
```

Jacoco is also integrated in this demo, you can use the following command to generate jacoco report.
```
mvn clean jacoco:prepare-agent install jacoco:report
```

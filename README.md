# 使用说明
1.创建一个test数据库，调整配置文件内的数据库配置(src/main/resources/application-local.properties)；

2.修改配置文件（src/main/resources/application.properties）内：generator.project.path的值为当前项目路径，如D:/code-generator

3.修改CodeGeneratorController(projectPath:要生成代码的项目的路径,packagePath:要生成的包路径, templetePath不用修改)

4.启动项目（运行GeneratorApplication的main方法）

5.生成某个库下某个表的模板代码：
	http://localhost:8009/generate/table?dbname=dbName&tableName=tableName
	dbName:数据库名称
	tableName:表名
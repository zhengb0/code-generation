package com.onecoderspace.generator.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.Maps;
import com.onecoderspace.generator.service.GeneratorHelperService;

@RestController
@RequestMapping("/generate")
public class CodeGeneratorController {
	/**
	 * 生成某个库下某个表对应的模板代码
	 * @param dbname  数据库名称
	 * @param tableName 表名称
	 * @return
	 */
	@RequestMapping("/table")
	public String table(String dbname,String tableName){
		Map<String, String> map = Maps.newHashMap();
		map.put("projectPath", "D:/code-generation");
		map.put("packagePath", "/src/main/java/com/feifanuniv/degree");
		map.put("templetePath", "/src/main/resources/code-templete");
		generatorHelperService.setProperty(map);
		generatorHelperService.oneTable(dbname,tableName);
		return "";
	}
	
	@Autowired
	private GeneratorHelperService generatorHelperService;
	
}

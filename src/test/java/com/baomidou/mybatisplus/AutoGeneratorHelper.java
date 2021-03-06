package com.baomidou.mybatisplus;

import com.baomidou.mybatisplus.annotations.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.ConfigGenerator;
import com.baomidou.mybatisplus.generator.ConfigIdType;
/**
 * 
 * 自动生成映射工具类
 * 
 * @author hubin
 *
 */
public class AutoGeneratorHelper {

	/**
	 * 
	 * 测试 run 执行
	 * 
	 * <p>
	 * 配置方法查看 {@link ConfigGenerator}
	 * </p>
	 * 
	 */
	public static void main( String[] args ) {
		ConfigGenerator cg = new ConfigGenerator();
		cg.setEntityPackage("com.api.dingdang.user.module");
		cg.setMapperPackage("com.api.dingdang.user.mapper");
		cg.setServicePackage("com.api.dingdang.user.service");
		cg.setSuperServiceImpl("com.baomidou.framework.service.impl.SuperServiceImpl");
		cg.setConfigIdType(ConfigIdType.AUTO);
		cg.setIdType(IdType.ID_WORKER);
		cg.setColumnHump(true);
		cg.setSaveDir("/temp/neo/20170719");
		cg.setDbDriverName("com.mysql.jdbc.Driver");
		cg.setDbUser("root");
		cg.setDbPassword("1990");
		cg.setDbUrl("jdbc:mysql://39.108.213.94:3306/dingdang?useUnicode=true&characterEncoding=UTF-8");
		//此处设置是否有前缀
		cg.setDbPrefix(true);
		AutoGenerator.run(cg);
	}
	
}

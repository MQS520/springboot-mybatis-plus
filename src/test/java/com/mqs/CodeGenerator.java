package com.mqs;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.core.exceptions.MybatisPlusException;
import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CodeGenerator {

    public static void main(String[] args){

        //代码生成路径
        final String projectPath = "E:\\MQS\\project_space\\springboot-mybatis-plus";
        //数据库连接地址
        final String dataSourceUrl = "localhost:3306";
        //数据库名称
        final String dataBaseName = "test";
        //数据库用户名
        final String userName = "root";
        //数据库密码
        final String password = "root";
        //表名
        final String tableName = "user";
        //包名
        final String groupName = "com.mqs";

        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();

        // 选择 freemarker 引擎
        mpg.setTemplateEngine(new FreemarkerTemplateEngine());

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setOutputDir(projectPath + "/src/main/java");
        gc.setFileOverride(true);// 文件覆盖
        gc.setActiveRecord(true);// 不需要ActiveRecord特性的请改为false
        gc.setEnableCache(false);// XML 二级缓存
        gc.setBaseResultMap(true);// XML ResultMap
        gc.setBaseColumnList(false);// XML columList
        gc.setAuthor("MQS");
        gc.setOpen(false);
        // 实体属性 Swagger2 注解
//        gc.setSwagger2(true);
        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
        dsc.setTypeConvert(new MySqlTypeConvert(){
            // 自定义数据库表字段类型转换【可选】
//            @Override
//            public DbColumnType processTypeConvert(String fieldType) {
//                System.out.println("转换类型：" + fieldType);
//                // 注意！！processTypeConvert 存在默认类型转换，如果不是你要的效果请自定义返回、非如下直接返回。
//                return super.processTypeConvert(fieldType);
//            }
        });
        dsc.setUrl("jdbc:mysql://"+ dataSourceUrl +"/"+ dataBaseName +"?useUnicode=true&useSSL=false&characterEncoding=utf8&serverTimezone=GMT");
        dsc.setDriverName("com.mysql.jdbc.Driver");
        dsc.setUsername(userName);
        dsc.setPassword(password);
        mpg.setDataSource(dsc);

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent(groupName);
//        pc.setModuleName(scanner("模块名"));
        mpg.setPackageInfo(pc);

        // 自定义配置
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                // to do nothing
            }
        };

        // 如果模板引擎是 freemarker
        String templatePath = "/templates/mapper.xml.ftl";
        // 如果模板引擎是 velocity
        // String templatePath = "/templates/mapper.xml.vm";

        // 自定义输出配置
        List<FileOutConfig> focList = new ArrayList<>();
        // 自定义配置会被优先输出
        focList.add(new FileOutConfig(templatePath) {
            @Override
            public String outputFile(TableInfo tableInfo) {
                // 自定义输出文件名 ， 如果你 Entity 设置了前后缀、此处注意 xml 的名称会跟着发生变化！！
                return projectPath + "/src/main/resources/mapper/"
                        + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
            }
        });
        cfg.setFileOutConfigList(focList);

        mpg.setCfg(cfg);

        // 配置模板
        TemplateConfig templateConfig = new TemplateConfig();
        templateConfig.setXml(null);
        mpg.setTemplate(templateConfig);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        // strategy.setCapitalMode(true);// 全局大写命名 ORACLE 注意
        strategy.setNaming(NamingStrategy.underline_to_camel);// 表名生成策略
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setEntityLombokModel(true);
        strategy.setRestControllerStyle(true);
        strategy.setInclude(tableName.split(","));
        strategy.setSuperEntityColumns("id");
        strategy.setControllerMappingHyphenStyle(true);
        strategy.setTablePrefix(pc.getModuleName() + "_");
        mpg.setStrategy(strategy);
        mpg.setTemplateEngine(new FreemarkerTemplateEngine());
        mpg.setStrategy(strategy);

        mpg.execute();

    }

}

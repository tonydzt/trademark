package com.kasuo.trademark.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = {"com.kasuo.trademark.dao.trademark"}, sqlSessionTemplateRef = "sqlSessionTemplateTrademark")
public class MybatisConfigTrademark {

    @Bean
    public SqlSessionFactory sqlSessionFactoryTrademark(@Qualifier("dataSourceTrademark") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath*:/com/kasuo/trademark/dao/trademark/*.xml"));
        return sqlSessionFactoryBean.getObject();
    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplateTrademark(@Qualifier("sqlSessionFactoryTrademark") SqlSessionFactory sqlSessionFactoryTrademark) {
        return new SqlSessionTemplate(sqlSessionFactoryTrademark);
    }

    @Bean
    public PlatformTransactionManager transactionManager(@Qualifier("dataSourceTrademark") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }
}
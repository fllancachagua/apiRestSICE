package pe.gob.bnp.person;

import java.io.IOException;
import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.cfg.Environment;
import org.hibernate.jpa.HibernatePersistenceProvider;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.core.SpringVersion;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.ResourcePatternUtils;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

//@SpringBootApplication (exclude = {DataSourceAutoConfiguration.class,JpaRepositoriesAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
@SpringBootApplication (exclude = {JpaRepositoriesAutoConfiguration.class, HibernateJpaAutoConfiguration.class})

public class PersonApplication {
//    private static final String[] ENTITYMANAGER_PACKAGES_TO_SCAN = {"a.b.c.entities", "a.b.c.converters"};
    
	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private ResourceLoader resourceLoader;	

	@Value("${spring.jpa.properties.hibernate.dialect}")
	private String HIBERNATE_DIALECT;

	@Value("${spring.jpa.show-sql}")
	private String HIBERNATE_SHOW_SQL;
	
	public static void main(String args[]) {
		System.out.println("Sprin version: " + SpringVersion.getVersion());
		SpringApplication.run(PersonApplication.class);
	}
	
//    @Bean
//    public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean() {
//
//         LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
//         entityManagerFactoryBean.setJpaVendorAdapter(vendorAdaptor());
//         entityManagerFactoryBean.setDataSource(dataSource());
//         entityManagerFactoryBean.setPersistenceProviderClass(HibernatePersistenceProvider.class);
//         entityManagerFactoryBean.setPackagesToScan(ENTITYMANAGER_PACKAGES_TO_SCAN);             
//         entityManagerFactoryBean.setJpaProperties(jpaHibernateProperties());
//
//         return entityManagerFactoryBean;
//     }
//
//    private HibernateJpaVendorAdapter vendorAdaptor() {
//        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
//        vendorAdapter.setShowSql(true);
//        return vendorAdapter;
//   }  
//    @Bean(destroyMethod = "close")
//    public DataSource dataSource() {
//        BasicDataSource dataSource = new BasicDataSource();
//        dataSource.setDriverClassName(env.getProperty("jdbc.driverClassName"));
//        dataSource.setUrl(env.getProperty("jdbc.url"));
//        dataSource.setUsername(env.getProperty("jdbc.username"));
//        dataSource.setPassword(env.getProperty("jdbc.password"));
//        return dataSource;
//    }
//    
//    @Autowired
//    private Environment env;    
    
    //
    
	@Bean
	public LocalSessionFactoryBean sessionFactory() throws IOException {
		LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
		sessionFactoryBean.setMappingLocations(loadResources());
		sessionFactoryBean.setDataSource(dataSource);
		Properties hibernateProperties = new Properties();
		hibernateProperties.put("hibernate.dialect", HIBERNATE_DIALECT);
		hibernateProperties.put("hibernate.show_sql", HIBERNATE_SHOW_SQL);
		sessionFactoryBean.setHibernateProperties(hibernateProperties);
		return sessionFactoryBean;
	}
	
	public Resource[] loadResources() {
		Resource[] resources = null;
		try {
			String hbnXml = "classpath:/hibernate/*.hbm.xml";
			resources = ResourcePatternUtils.getResourcePatternResolver(resourceLoader).getResources(hbnXml);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return resources;
	}
	
	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}	
}

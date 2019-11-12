package guru.springframework.externalproperties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
@Configuration
/**
 * Tell spring where to load the properties file from
 */
@PropertySource("classpath:datasource.properties")
public class FakeDataSource {
    /**
     * Tell spring which property in the properties file will be maped with this variable
     */
    @Value("${username1}")
    private String username;
    @Value("${password}")
    private String    password;
    @Value("${datasourceurl}")
    private String datasourceurl;

    public FakeDatasourceBean getFakeDataSourceBean(){
        FakeDatasourceBean fakeDatasourceBean=new FakeDatasourceBean();
        fakeDatasourceBean.setUsername(this.username);
        fakeDatasourceBean.setPassword(this.password);
        fakeDatasourceBean.setDatasourceurl(this.datasourceurl);
        return fakeDatasourceBean;
    }

    public static PropertySourcesPlaceholderConfigurer properties(){
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer= new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }
}

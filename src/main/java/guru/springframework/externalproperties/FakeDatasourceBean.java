package guru.springframework.externalproperties;

import org.springframework.beans.factory.annotation.Value;

public class FakeDatasourceBean {

    private String username;
    private String    password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDatasourceurl() {
        return datasourceurl;
    }
    public void setDatasourceurl(String datasourceurl) {
        this.datasourceurl = datasourceurl;
    }

    private String datasourceurl;

}

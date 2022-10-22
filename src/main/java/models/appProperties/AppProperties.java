package models.appProperties;

public class AppProperties{


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    private String url;
    private CredentialsInfo credentials;
    private DatabaseInfo database;
    private ApiInfo accountApi;

    public CredentialsInfo getCredentials() {
        return credentials;
    }

    public void setCredentials(CredentialsInfo credentials) {
        this.credentials = credentials;
    }

    public DatabaseInfo getDatabase() {
        return database;
    }

    public void setDatabase(DatabaseInfo database) {
        this.database = database;
    }

    public ApiInfo getAccountApi() {
        return accountApi;
    }

    public void setAccountApi(ApiInfo accountApi) {
        this.accountApi = accountApi;
    }

    @Override
    public String toString() {
        return "{" +
                "url='" + url + '\'' +
                ", credentials=" + credentials +
                ", database=" + database +
                ", accountApi=" + accountApi +
                '}';
    }

}



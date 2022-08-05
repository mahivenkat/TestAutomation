package models.appProperties;

public class AppProperties{

    @Override
    public String toString() {
        return "{" +
                "credentials=" + credentials +
                ", database=" + database +
                ", accountApi=" + accountApi +
                '}';
    }

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
}

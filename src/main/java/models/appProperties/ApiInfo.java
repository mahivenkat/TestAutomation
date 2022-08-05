package models.appProperties;

public class ApiInfo {
    @Override
    public String toString() {
        return "{" +
                "server='" + server + '\'' +
                ", apiUserName='" + apiUserName + '\'' +
                ", apiPassword='" + apiPassword + '\'' +
                ", createAccountEndPoint='" + createAccountEndPoint + '\'' +
                ", updateAccountEndPoint='" + updateAccountEndPoint + '\'' +
                ", getAccountEndPoint='" + getAccountEndPoint + '\'' +
                ", deleteAccountEndPoint='" + deleteAccountEndPoint + '\'' +
                '}';
    }

    private String server;
    private String apiUserName;
    private String apiPassword;
    private String createAccountEndPoint;
    private String updateAccountEndPoint;
    private String getAccountEndPoint;
    private String deleteAccountEndPoint;

    public String getDeleteAccountEndPoint() {
        return deleteAccountEndPoint;
    }

    public void setDeleteAccountEndPoint(String deleteAccountEndPoint) {
        this.deleteAccountEndPoint = deleteAccountEndPoint;
    }

    public String getGetAccountEndPoint() {
        return getAccountEndPoint;
    }

    public void setGetAccountEndPoint(String getAccountEndPoint) {
        this.getAccountEndPoint = getAccountEndPoint;
    }

    public String getUpdateAccountEndPoint() {
        return updateAccountEndPoint;
    }

    public void setUpdateAccountEndPoint(String updateAccountEndPoint) {
        this.updateAccountEndPoint = updateAccountEndPoint;
    }

    public String getCreateAccountEndPoint() {
        return createAccountEndPoint;
    }

    public void setCreateAccountEndPoint(String createAccountEndPoint) {
        this.createAccountEndPoint = createAccountEndPoint;
    }

    public String getApiPassword() {
        return apiPassword;
    }

    public void setApiPassword(String apiPassword) {
        this.apiPassword = apiPassword;
    }

    public String getApiUserName() {
        return apiUserName;
    }

    public void setApiUserName(String apiUserName) {
        this.apiUserName = apiUserName;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }
    // Getters and setters
}

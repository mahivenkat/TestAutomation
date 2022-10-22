package models.appProperties;

public class AppPropertiesModel
{

    private AppProperties app1;


    public AppProperties getApp2() {
        return app2;
    }

    public void setApp2(AppProperties app2) {
        this.app2 = app2;
    }

    private AppProperties app2;
    public AppProperties getApp1() {
        return app1;
    }

    public void setApp1(AppProperties app1) {
        this.app1 = app1;
    }

    @Override
    public String toString() {
        return "{" +
                "app1=" + app1 +
                ", app2=" + app2 +
                '}';
    }

}


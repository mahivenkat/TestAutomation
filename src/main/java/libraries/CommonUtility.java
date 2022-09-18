package libraries;


import models.appProperties.AppPropertiesModel;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class CommonUtility {
    public AppPropertiesModel readPropertiesYml()  {
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(new File(System.getProperty("user.dir") + "\\src\\test\\resources\\Properties\\"+System.getProperty("envName", "dev").toLowerCase()+".yml"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        AppPropertiesModel data = new Yaml(new Constructor(AppPropertiesModel.class)).load(inputStream);
        System.out.println(data.toString());
        return data;
    }
}

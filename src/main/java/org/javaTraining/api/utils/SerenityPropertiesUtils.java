package org.javaTraining.api.utils;

import net.serenitybdd.model.environment.EnvironmentSpecificConfiguration;
import net.thucydides.model.environment.SystemEnvironmentVariables;
import net.thucydides.model.util.EnvironmentVariables;

public class SerenityPropertiesUtils {

    public static String reader(String property){
        EnvironmentVariables env = SystemEnvironmentVariables.createEnvironmentVariables();
        ;
        return EnvironmentSpecificConfiguration.from(env).getProperty(property);
    }

}

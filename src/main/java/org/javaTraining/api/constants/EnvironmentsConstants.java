package org.javaTraining.api.constants;

import org.javaTraining.api.utils.SerenityPropertiesUtils;

public interface EnvironmentsConstants {

    String API_ENDPOINT = SerenityPropertiesUtils.reader("api.endpoint");
    String API_TOKEN = SerenityPropertiesUtils.reader("api.token");
}

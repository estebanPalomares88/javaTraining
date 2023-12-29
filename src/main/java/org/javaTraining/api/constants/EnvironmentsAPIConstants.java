package org.javaTraining.api.constants;

import org.javaTraining.utils.SerenityPropertiesUtils;

public interface EnvironmentsAPIConstants {

    String API_ENDPOINT = SerenityPropertiesUtils.reader("api.endpoint"),
            API_TOKEN = SerenityPropertiesUtils.reader("api.token");
}

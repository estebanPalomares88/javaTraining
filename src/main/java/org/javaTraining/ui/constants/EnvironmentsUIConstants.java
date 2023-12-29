package org.javaTraining.ui.constants;

import org.javaTraining.utils.SerenityPropertiesUtils;

public interface EnvironmentsUIConstants {

    String OUTLOOK_URL = SerenityPropertiesUtils.reader("outlook.url"),
            OUTLOOK_USER = SerenityPropertiesUtils.reader("outlook.user"),
            OUTLOOK_PASS = SerenityPropertiesUtils.reader("outlook.pass"),
            OUTLOOK_MAIN_TITLE = SerenityPropertiesUtils.reader("outlook.main.title");

}

package org.javaTraining.ui.constants;

import org.javaTraining.utils.SerenityPropertiesUtils;

public interface EnvironmentsUIConstants {

    String UI_URL = SerenityPropertiesUtils.reader("ui.url"),
            UI_USER = SerenityPropertiesUtils.reader("ui.user"),
            UI_PASS = SerenityPropertiesUtils.reader("ui.pass"),
            UI_MAIN_TITLE = SerenityPropertiesUtils.reader("ui.main.title");

}

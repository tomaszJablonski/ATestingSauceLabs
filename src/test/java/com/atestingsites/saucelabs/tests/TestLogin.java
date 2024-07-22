package com.atestingsites.saucelabs.tests;

import com.atestingsites.saucelabs.base.BaseClass;
import org.testng.annotations.Test;

public class TestLogin extends BaseClass {

    @Test
    public void loginPositive() {
        loginPage.checkLoginLogo();
    }
}

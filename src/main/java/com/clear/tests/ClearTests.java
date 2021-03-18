package com.clear.tests;

import ex.capybara.MainTest;

public class ClearTests extends MainTest {
    public ClearTests(Platform platform) {
        super(platform);
        isLocalRunning = true;
        System.err.println("is local running =" + isLocalRunning);
    }

    @Override
    protected String getStages(Stages stages) {
        String test = "https://minoori.perspective.net.ua//";
        String stage = "https://stage.minoori.com/";
        String prod = "";
        switch (stages) {
            case test:
                return test;
            case stage:
                return stage;
            case prod:
                return prod;
        }
        return stage;
    }

    @Override
    protected String getSeleniumURL() {
        return "http://192.168.10.252:7777/wd/hub"; // local selenoid server
    }
}

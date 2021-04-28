package ua.oschadbank.staging.tests;

import ex.capybara.MainTest;

public class OschadTests extends MainTest {

    public OschadTests(Platform platform) {
        super(platform);
        isLocalRunning = true;
        System.err.println("is local running =" + isLocalRunning);
    }

    @Override
    protected String getStages(Stages stages) {
        String test = "https://staging.oschadbank.ua/";
        String stage = "https://staging.oschadbank.ua/";
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


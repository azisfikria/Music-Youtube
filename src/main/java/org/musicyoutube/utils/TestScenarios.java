package org.musicyoutube.utils;

public enum TestScenarios {
    //Login Admin
    T001("TCC.TMS.001 Admin go to web correct URL"),
    T002("TCC.TMS.002 Admin go to web incorrect URL"),
    T003("TCC.TMS.003 Admin login valid"),
    T004("TCC.TMS.004 Admin login invalid"),
    T005("TCC.TMS.005 Admin login null"),
    T006("TCC.TMS.006 Admin logout"),

    //Report Absen Admin

    //Master

    //Login Staff
    T007("TCC.TMS.237 Staff go to web correct URL"),
    T008("TCC.TMS.238 Staff go to web incorrect URL"),
    T009("TCC.TMS.239 Staff login valid"),
    T010("TCC.TMS.240 Staff login invalid"),
    T011("TCC.TMS.241 Staff login null"),
    T012("TCC.TMS.242 Staff logout");




    private String testName;

    TestScenarios(String value) {

        testName = value;
    }

    public String getTestName() {

        return testName;
    }
}

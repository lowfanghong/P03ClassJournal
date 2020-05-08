package com.myapplicationdev.android.p03_classjournal;

import java.io.Serializable;

public class DG implements Serializable {
    private int week;
    private String DailyGrade;
    private String ModuleCode;

    public DG(int week, String DailyGrade, String ModuleCode) {
        this.week = week;
        this.DailyGrade = DailyGrade;
        this.ModuleCode = ModuleCode;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public String getDailyGrade() {
        return DailyGrade;
    }

    public void setDailyGrade(String dailyGrade) {
        DailyGrade = dailyGrade;
    }

    public String getModuleCode() {
        return ModuleCode;
    }

    public void setModuleCode(String moduleCode) {
        ModuleCode = moduleCode;
    }
}


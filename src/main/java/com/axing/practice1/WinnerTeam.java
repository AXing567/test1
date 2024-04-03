package com.axing.practice1;

/**
 * @projectName: test1
 * @package: com.axing.practice1
 * @className: WinnerTeam
 * @author: Axing
 * @description: TODO
 * @date: 2024/3/23 15:25
 * @version: 1.0
 */
public class WinnerTeam {
    private String name;
    private String year;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public WinnerTeam(String name, String year) {
        this.name = name;
        this.year = year;
    }

    public WinnerTeam() {
    }
}

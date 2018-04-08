package com.iss.cnaf.excel.punishment.vo;


public class Punishment {
    private int id;
    private String carId;
    private String punishDate;
    private String punishPlace;
    private String punishCause;
    private String penaltyValue;
    private String driver;
    private String results;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getPunishDate() {
        return punishDate;
    }

    public void setPunishDate(String punishDate) {
        this.punishDate = punishDate;
    }

    public String getPunishPlace() {
        return punishPlace;
    }

    public void setPunishPlace(String punishPlace) {
        this.punishPlace = punishPlace;
    }

    public String getPunishCause() {
        return punishCause;
    }

    public void setPunishCause(String punishCause) {
        this.punishCause = punishCause;
    }

    public String getPenaltyValue() {
        return penaltyValue;
    }

    public void setPenaltyValue(String penaltyValue) {
        this.penaltyValue = penaltyValue;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getResults() {
        return results;
    }

    public void setResults(String results) {
        this.results = results;
    }
}

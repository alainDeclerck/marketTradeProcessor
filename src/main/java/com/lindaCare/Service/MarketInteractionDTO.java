package com.lindaCare.Service;

import java.io.Serializable;
import java.math.BigDecimal;

public class MarketInteractionDTO implements Serializable {

    private static final long serialVersionUID = 3903607339365725135L;

    private String userId;
    private String currencyFrom;
    private String currencyTo;
    private long amountSell;
    private double amountBuy;
    private double rate;
    private String timePlaced;
    private String originatingCountry;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCurrencyFrom() {
        return currencyFrom;
    }

    public void setCurrencyFrom(String currencyFrom) {
        this.currencyFrom = currencyFrom;
    }

    public String getCurrencyTo() {
        return currencyTo;
    }

    public void setCurrencyTo(String currencyTo) {
        this.currencyTo = currencyTo;
    }

    public long getAmountSell() {
        return amountSell;
    }

    public void setAmountSell(long amountSell) {
        this.amountSell = amountSell;
    }

    public double getAmountBuy() {
        return amountBuy;
    }

    public void setAmountBuy(double amountBuy) {
        this.amountBuy = amountBuy;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getTimePlaced() {
        return timePlaced;
    }

    public void setTimePlaced(String timePlaced) {
        this.timePlaced = timePlaced;
    }

    public String getOriginatingCountry() {
        return originatingCountry;
    }

    public void setOriginatingCountry(String originatingCountry) {
        this.originatingCountry = originatingCountry;
    }
}

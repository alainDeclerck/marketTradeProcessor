package com.lindaCare.domain;

import java.math.BigDecimal;

public class MarketInteraction {

    private String userId;
    private String currencyFrom;
    private String currencyTo;
    private BigDecimal amountSell;
    private BigDecimal amountBuy;
    private BigDecimal rate;
    private String timePlaced;
    private String originatingCountry;

    public MarketInteraction(String userId, String currencyFrom, String currencyTo, long amountSell, double amountBuy, double rate, String timePlaced, String originatingCountry) {
        this.userId = userId;
        this.currencyFrom = currencyFrom;
        this.currencyTo = currencyTo;
        this.amountSell = new BigDecimal(String.valueOf(amountSell));
        this.amountBuy = new BigDecimal(String.valueOf(amountBuy));
        this.rate = new BigDecimal(String.valueOf(rate));
        this.timePlaced = timePlaced;
        this.originatingCountry = originatingCountry;
    }

    public String getUserId() {
        return userId;
    }

    public String getCurrencyFrom() {
        return currencyFrom;
    }

    public String getCurrencyTo() {
        return currencyTo;
    }

    public BigDecimal getAmountSell() {
        return amountSell;
    }

    public BigDecimal getAmountBuy() {
        return amountBuy;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public String getTimePlaced() {
        return timePlaced;
    }

    public String getOriginatingCountry() {
        return originatingCountry;
    }

    @Override
    public String toString() {
        StringBuffer isolatedString = new StringBuffer();
        isolatedString.append(" From : ");
        isolatedString.append(currencyFrom);
        isolatedString.append(" To : ");
        isolatedString.append(currencyTo);
        isolatedString.append(" ** ");
        isolatedString.append(" Amount sell : ");
        isolatedString.append(amountSell.toString());
        isolatedString.append(" Amount buy : ");
        isolatedString.append(amountBuy.toString());
        isolatedString.append(" ** ");
        isolatedString.append(" Rating : ");
        isolatedString.append(rate.toString());
        isolatedString.append(" ** ");
        isolatedString.append(" TimePlaced : ");
        isolatedString.append(timePlaced);
        isolatedString.append(" ** ");
        isolatedString.append(" Originating Country : ");
        isolatedString.append(originatingCountry);

        return isolatedString.toString();
    }
}

package com.lindaCare.Service;


import com.lindaCare.domain.MarketInteraction;
import org.springframework.stereotype.Service;

@Service
public class MessageConsumptionMapper {


    public static MarketInteraction mapMessageFromDTO(MarketInteractionDTO marketInteractionDTO) {

        return new MarketInteraction(
                marketInteractionDTO.getUserId(),
                marketInteractionDTO.getCurrencyFrom(),
                marketInteractionDTO.getCurrencyTo(),
                marketInteractionDTO.getAmountSell(),
                marketInteractionDTO.getAmountBuy(),
                marketInteractionDTO.getRate(),
                marketInteractionDTO.getTimePlaced(),
                marketInteractionDTO.getOriginatingCountry());
        }

}

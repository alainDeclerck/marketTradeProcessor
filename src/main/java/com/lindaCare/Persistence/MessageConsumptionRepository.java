package com.lindaCare.Persistence;

import com.lindaCare.domain.MarketInteraction;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class MessageConsumptionRepository {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(MessageConsumptionRepository.class);

    //TODO: persist message to do some processing
    public void persistMessage(MarketInteraction message) {
        logger.info(message.toString());
    }

}

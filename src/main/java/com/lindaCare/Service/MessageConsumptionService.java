package com.lindaCare.Service;

import com.lindaCare.Persistence.MessageConsumptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MessageConsumptionService {
    
    @RequestMapping("/")
    public String index() {
        return "Application online!";
    }

    @Autowired
    private MessageConsumptionRepository repository;

    @Autowired
    private MessageConsumptionValidation validator;

    @RequestMapping(value = "/moneyChange", method = RequestMethod.POST)
    public ResponseEntity < String > moneyChange(@RequestBody MarketInteractionDTO marketInteractionDTO) {

        if (validator.isValid(marketInteractionDTO)) {

            repository.persistMessage(MessageConsumptionMapper.mapMessageFromDTO(marketInteractionDTO));

            return ResponseEntity.status(HttpStatus.CREATED).build();

        }

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();

    }

}

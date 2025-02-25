package com.eazybytes.accounts.service.client;

import org.springframework.cloud.openfeign.FeignClient;
// import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestHeader;
// import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("JGHAN-CARDS")
public interface CardsFeignClient {

    // @GetMapping(value = "/api/fetch",consumes = "application/json")
    @GetMapping(value = "/card/pod-name")
    public String getCardPodName();
    // public ResponseEntity<CardsDto> fetchCardDetails(@RequestHeader("eazybank-correlation-id")
    //                                                      String correlationId, @RequestParam String mobileNumber);

}

package com.aulajavanauta.pagamento.controller.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CardRequestDTO {

    private String name;
    private String cardNumber;
    private String month;
    private String year;
    private String cvv;
    private AddressRequestDTO addressRequestDTO;

}

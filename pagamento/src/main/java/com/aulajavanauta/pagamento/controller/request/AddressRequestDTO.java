package com.aulajavanauta.pagamento.controller.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AddressRequestDTO {

    private String city;

    private String street;

    private String number;

    private String neighborhood;

    private String complement;

    private String cep;

}

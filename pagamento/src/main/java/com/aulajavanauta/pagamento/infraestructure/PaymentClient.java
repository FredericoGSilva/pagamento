package com.aulajavanauta.pagamento.infraestructure;

import com.aulajavanauta.pagamento.controller.request.CardRequestDTO;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class PaymentClient {

    public Boolean verifyCard(CardRequestDTO cardRequestDTO) {

        // número do cartão precisa terminar em 8080.
        if (cardRequestDTO.getCardNumber().endsWith("8080")) {
            return true;
        }
        return false;

    }
}

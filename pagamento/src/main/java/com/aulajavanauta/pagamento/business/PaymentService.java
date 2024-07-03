package com.aulajavanauta.pagamento.business;

import com.aulajavanauta.pagamento.controller.request.CardRequestDTO;
import com.aulajavanauta.pagamento.infraestructure.PaymentClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentService {

    private final PaymentClient paymentClient;

    public Boolean verifyCard(CardRequestDTO cardRequestDTO) {
        return paymentClient.verifyCard(cardRequestDTO);
    }

}

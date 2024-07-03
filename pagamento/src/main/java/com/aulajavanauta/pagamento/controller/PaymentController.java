package com.aulajavanauta.pagamento.controller;

import com.aulajavanauta.pagamento.business.PaymentService;
import com.aulajavanauta.pagamento.controller.request.CardRequestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pagamento")
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService paymentService;

    @PostMapping()
    public ResponseEntity<Boolean> verifyPayment(@RequestBody CardRequestDTO cardRequestDTO) {
        return ResponseEntity.ok(paymentService.verifyCard(cardRequestDTO));
    }

}

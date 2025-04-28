package BuyingOfGoodies.E_commerecApplication.service.payment;

import BuyingOfGoodies.E_commerecApplication.dto.responds.paymentResponds.GetPaymentStatusRespond;
import BuyingOfGoodies.E_commerecApplication.dto.responds.paymentResponds.ProcessPaymentRespond;
import BuyingOfGoodies.E_commerecApplication.dto.responds.paymentResponds.ValidatePaymentRespond;
import BuyingOfGoodies.E_commerecApplication.model.Order;
import BuyingOfGoodies.E_commerecApplication.model.Payment;

public interface PaymentService {
    ProcessPaymentRespond processPayment(Order order);

    ValidatePaymentRespond validatePayment(Payment payment);

   GetPaymentStatusRespond getPaymentStatus(Order order);
}

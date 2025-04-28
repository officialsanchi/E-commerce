package BuyingOfGoodies.E_commerecApplication.service.payment;

import BuyingOfGoodies.E_commerecApplication.dto.responds.paymentResponds.GetPaymentStatusRespond;
import BuyingOfGoodies.E_commerecApplication.dto.responds.paymentResponds.ProcessPaymentRespond;
import BuyingOfGoodies.E_commerecApplication.dto.responds.paymentResponds.ValidatePaymentRespond;
import BuyingOfGoodies.E_commerecApplication.model.Order;
import BuyingOfGoodies.E_commerecApplication.model.Payment;
import BuyingOfGoodies.E_commerecApplication.repository.PaymentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentRepo paymentRepo;

    @Override
    public ProcessPaymentRespond processPayment(Order order) {
        return null;
    }

    @Override
    public ValidatePaymentRespond validatePayment(Payment payment) {
        return null;
    }

    @Override
    public GetPaymentStatusRespond getPaymentStatus(Order order) {
        return null;
    }
}

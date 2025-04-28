package BuyingOfGoodies.E_commerecApplication.service.order;

import BuyingOfGoodies.E_commerecApplication.dto.responds.orderResponds.*;
import BuyingOfGoodies.E_commerecApplication.model.Order;
import BuyingOfGoodies.E_commerecApplication.model.OrderItem;
import BuyingOfGoodies.E_commerecApplication.model.User;
import BuyingOfGoodies.E_commerecApplication.repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepo orderRepo;

    @Override
    public CreateOrderRespond createOrder(User user, List<OrderItem> items) {
        return null;
    }

    @Override
    public CancelOrderRespond cancelOrder(Order order) {
        return null;
    }

    @Override
    public GetOrderDetailsRespond getOrderDetails(int orderId) {
        return null;
    }

    @Override
    public UpdateOrderStatus updateOrderStatus(Order order, String status) {
        return null;
    }

    @Override
    public GetOrderByUser getOrdersByUser(User user) {
        return null;
    }
}

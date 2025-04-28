package BuyingOfGoodies.E_commerecApplication.service.order;

import BuyingOfGoodies.E_commerecApplication.dto.responds.orderResponds.*;
import BuyingOfGoodies.E_commerecApplication.model.Order;
import BuyingOfGoodies.E_commerecApplication.model.OrderItem;
import BuyingOfGoodies.E_commerecApplication.model.User;

import java.util.List;

public interface OrderService {
     CreateOrderRespond createOrder(User user, List<OrderItem> items);

     CancelOrderRespond cancelOrder(Order order);

    GetOrderDetailsRespond getOrderDetails(int orderId);
    UpdateOrderStatus updateOrderStatus(Order order, String status);

    GetOrderByUser getOrdersByUser(User user);
}

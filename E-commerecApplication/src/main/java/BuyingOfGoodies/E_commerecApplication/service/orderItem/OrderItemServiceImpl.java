package BuyingOfGoodies.E_commerecApplication.service.orderItem;

import BuyingOfGoodies.E_commerecApplication.dto.responds.orderItemResponds.AddOrderItemRespond;
import BuyingOfGoodies.E_commerecApplication.dto.responds.orderItemResponds.RemoveOrderItemRespond;
import BuyingOfGoodies.E_commerecApplication.dto.responds.orderItemResponds.UpdateOrderItemRespond;
import BuyingOfGoodies.E_commerecApplication.model.Order;
import BuyingOfGoodies.E_commerecApplication.model.OrderItem;
import BuyingOfGoodies.E_commerecApplication.repository.OrderItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderItemServiceImpl implements OrderItemService {
    @Autowired
    private OrderItemRepo orderItemRepo;

    @Override
    public AddOrderItemRespond addOrderItem(Order order, OrderItem item) {
        return null;
    }

    @Override
    public RemoveOrderItemRespond removeOrderItem(Order order, OrderItem item) {
        return null;
    }

    @Override
    public UpdateOrderItemRespond updateOrderItem(Order order, OrderItem item) {
        return null;
    }
}

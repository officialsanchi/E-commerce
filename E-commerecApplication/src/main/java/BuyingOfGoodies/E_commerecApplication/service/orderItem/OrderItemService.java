package BuyingOfGoodies.E_commerecApplication.service.orderItem;

import BuyingOfGoodies.E_commerecApplication.dto.responds.orderItemResponds.AddOrderItemRespond;
import BuyingOfGoodies.E_commerecApplication.dto.responds.orderItemResponds.RemoveOrderItemRespond;
import BuyingOfGoodies.E_commerecApplication.dto.responds.orderItemResponds.UpdateOrderItemRespond;
import BuyingOfGoodies.E_commerecApplication.model.Order;
import BuyingOfGoodies.E_commerecApplication.model.OrderItem;

public interface OrderItemService {
     AddOrderItemRespond addOrderItem(Order order, OrderItem item);

    RemoveOrderItemRespond removeOrderItem(Order order, OrderItem item);

    UpdateOrderItemRespond updateOrderItem(Order order, OrderItem item);
}

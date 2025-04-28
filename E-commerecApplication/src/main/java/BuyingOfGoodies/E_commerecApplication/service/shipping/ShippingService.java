package BuyingOfGoodies.E_commerecApplication.service.shipping;

import BuyingOfGoodies.E_commerecApplication.dto.responds.shippingResponds.CalculateShippingCostRespond;
import BuyingOfGoodies.E_commerecApplication.dto.responds.shippingResponds.GetShippingDetailsRespond;
import BuyingOfGoodies.E_commerecApplication.dto.responds.shippingResponds.SetShippingAddressRespond;
import BuyingOfGoodies.E_commerecApplication.dto.responds.shippingResponds.TrackShipmentRespond;
import BuyingOfGoodies.E_commerecApplication.model.Order;

public interface ShippingService {
     CalculateShippingCostRespond calculateShippingCost(Order order);

     TrackShipmentRespond trackShipment(String trackingId);

     SetShippingAddressRespond setShippingAddress(Order order, String address);

     GetShippingDetailsRespond getShippingDetails(Order order);
}

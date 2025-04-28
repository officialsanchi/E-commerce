package BuyingOfGoodies.E_commerecApplication.service.shipping;

import BuyingOfGoodies.E_commerecApplication.dto.responds.shippingResponds.CalculateShippingCostRespond;
import BuyingOfGoodies.E_commerecApplication.dto.responds.shippingResponds.GetShippingDetailsRespond;
import BuyingOfGoodies.E_commerecApplication.dto.responds.shippingResponds.SetShippingAddressRespond;
import BuyingOfGoodies.E_commerecApplication.dto.responds.shippingResponds.TrackShipmentRespond;
import BuyingOfGoodies.E_commerecApplication.model.Order;
import BuyingOfGoodies.E_commerecApplication.repository.ShippingDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShippingServiceImpl implements ShippingService {
    @Autowired
    private ShippingDetailsRepo shippingDetailsRepo;

    @Override
    public CalculateShippingCostRespond calculateShippingCost(Order order) {
        return null;
    }

    @Override
    public TrackShipmentRespond trackShipment(String trackingId) {
        return null;
    }

    @Override
    public SetShippingAddressRespond setShippingAddress(Order order, String address) {
        return null;
    }

    @Override
    public GetShippingDetailsRespond getShippingDetails(Order order) {
        return null;
    }
}

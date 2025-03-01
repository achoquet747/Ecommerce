package com.arieldev.Ecommerce.Sport.service.interf;

import com.arieldev.Ecommerce.Sport.dto.OrderRequest;
import com.arieldev.Ecommerce.Sport.dto.Response;
import com.arieldev.Ecommerce.Sport.enums.OrderStatus;
import org.springframework.data.domain.Pageable;

import java.time.LocalDateTime;

public interface OrderItemService {
    Response placeOrder(OrderRequest orderRequest);
    Response updateOrderItemStatus(Long orderItemId, String status);
    Response filterOrderItems(OrderStatus status, LocalDateTime startDate, LocalDateTime endDate, Long itemId, Pageable pageable);
}

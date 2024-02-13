package org.hanghae.markethub.domain.purchase.dto;

import lombok.Getter;

import java.util.List;


public record PaymentRequestDto(
        String email,
        List<PurchaseItemDto> items
){
    public record PurchaseItemDto(
            Long itemId,
            int quantity
    ) {

    }
}
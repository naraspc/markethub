package org.hanghae.markethub.domain.item.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
public class ItemUpdateResponseDto {
	private String itemName;
	private int price;
	private int quantity;
	private String itemInfo;
	private String category;
}

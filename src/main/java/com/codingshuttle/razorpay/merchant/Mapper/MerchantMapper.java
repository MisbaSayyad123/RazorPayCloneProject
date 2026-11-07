package com.codingshuttle.razorpay.merchant.Mapper;

import com.codingshuttle.razorpay.merchant.dto.request.MerchantSignupRequest;
import com.codingshuttle.razorpay.merchant.dto.response.MerchantResponse;
import com.codingshuttle.razorpay.merchant.entity.Merchant;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface MerchantMapper {

    MerchantResponse toMerchantResponse(Merchant merchantList);

    Merchant toMerchant(MerchantSignupRequest merchantSignupRequest);

}

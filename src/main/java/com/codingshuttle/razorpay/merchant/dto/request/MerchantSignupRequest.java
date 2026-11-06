package com.codingshuttle.razorpay.merchant.dto.request;

import com.codingshuttle.razorpay.common.enums.BusinessType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record MerchantSignupRequest (

        @NotNull(message = "Name is required")
        @Size(max=50, message = "Name should not be more then 50 character long")
        String name,

        @NotNull(message = "password is required")
        @Size(max=8, message = "Password should not be more then 8 character long")
        String password,

        @Email
        @NotNull(message = "Name is required")
        String email,

        @Size(max=50, message = "Business name should not be more then 50 character long")
        String businessName,

        BusinessType businessType

) {
}


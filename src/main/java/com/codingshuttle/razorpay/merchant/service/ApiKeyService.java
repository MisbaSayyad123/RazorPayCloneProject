package com.codingshuttle.razorpay.merchant.service;

import com.codingshuttle.razorpay.merchant.dto.request.CreateApiKeyRequest;
import com.codingshuttle.razorpay.merchant.dto.response.ApiKeyCreateResponse;
import com.codingshuttle.razorpay.merchant.dto.response.ApiKeyResponse;
import jakarta.validation.Valid;

import java.util.List;
import java.util.UUID;

public interface ApiKeyService {
  public   ApiKeyCreateResponse create(UUID merchantId, CreateApiKeyRequest request);

  List<ApiKeyResponse> listByMerchantId(UUID merchantId);

  void revoke(UUID merchantId, UUID keyId);

  ApiKeyCreateResponse rotateKey(UUID merchantId, UUID keyId);
}

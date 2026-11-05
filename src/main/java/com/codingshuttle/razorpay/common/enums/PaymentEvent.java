package com.codingshuttle.razorpay.common.enums;

public enum PaymentEvent {
    AUTHORIZED_ATTEMPT,
    AUTHORIZED_FAIL,
    AUTHORIZED_SUCCESS,
    CAPTURE_REQUEST,
    CAPTURE_FAIL,
    CAPTURE_SUCCESS,
    REFUND_INIT,
    REFUND_COMPLETE,
    SETTLE,
    CANCEL,
    CAPTURE_TIMEOUT

}

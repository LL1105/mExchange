package com.exchange.core.common.constant;

import lombok.Getter;

@Getter
public enum OrderAction {

    // 卖出
    ASK(0),
    // 买入
    BID(1);

    private byte code;

    OrderAction(int code){this.code = (byte)code;}

    public static OrderAction of(byte code){
        switch (code) {
            case 0:
                return ASK;
            case 1:
                return BID;
            default:
                throw new IllegalArgumentException("unknown OrderAction:" + code);
        }
    }

    public OrderAction opposite() {
        return this == ASK ? BID : ASK;
    }

}

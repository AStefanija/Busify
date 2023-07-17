package com.busify.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum BaggageType {
//    TODO: How are all mapped on FE?
    CarryOnBag("Carry-On Bag"),
    TrolleyBag("Trolley Bag"),
    CheckedInBag("Checked-In Bag");
    private final String requestValue;

    public static BaggageType fromString(String input) {
        for (BaggageType baggageType : BaggageType.values()) {
            if (baggageType.requestValue.equalsIgnoreCase(input)) {
                return baggageType;
            }
        }
        throw new IllegalArgumentException("Invalid baggageType: " + input);
    }
}

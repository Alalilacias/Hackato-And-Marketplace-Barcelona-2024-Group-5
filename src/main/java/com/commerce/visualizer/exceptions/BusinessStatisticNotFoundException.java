package com.commerce.visualizer.exceptions;

public class BusinessStatisticNotFoundException extends RuntimeException {
    public BusinessStatisticNotFoundException(String id) {
        super("Unable to find a statistic with ID: " + id);
    }
}

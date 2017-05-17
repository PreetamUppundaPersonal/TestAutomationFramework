package com.usmanhussain.exception;

/**
 * This class is used to throw the the user defined exception in page operations.
 * <p>
 */
public class PageOperationException extends RuntimeException {

    public PageOperationException(String msg) {
        super(msg);
    }

}
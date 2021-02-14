package com.github.silaev.mongodb.replicaset.exception;

/**
 * @author Konstantin Silaev
 */
public class MongoNodeInitializationException extends RuntimeException {

    public MongoNodeInitializationException(String errorMessage) {
        super(errorMessage);
    }

    public MongoNodeInitializationException(String message, Throwable cause) {
        super(message, cause);
    }

}

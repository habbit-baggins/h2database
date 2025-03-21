/*
 * Copyright 2004-2025 H2 Group. Multiple-Licensed under the MPL 2.0,
 * and the EPL 1.0 (https://h2database.com/html/license.html).
 * Initial Developer: H2 Group
 */
package org.h2.api;

/**
 * Custom serialization mechanism for java objects being stored in column of
 * type OTHER.
 *
 * @author Sergi Vladykin
 */
public interface JavaObjectSerializer {

    /**
     * Serialize object to byte array.
     *
     * @param obj the object to serialize
     * @return the byte array of the serialized object
     * @throws Exception on failure
     */
    byte[] serialize(Object obj) throws Exception;

    /**
     * Deserialize object from byte array.
     *
     * @param bytes the byte array of the serialized object
     * @return the object
     * @throws Exception on failure
     */
    Object deserialize(byte[] bytes) throws Exception;

}

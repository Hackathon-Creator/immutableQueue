package com.bipilassigment1.immutable;

/**
 * Represents the interface for an Immutable Queue (First-In-First-Out)
 * @author bipilraut
 *
 * @param <T> generic type for the elements of the queue
 */
public interface Queue<T> {
	/**
	 * 
	 * @param t generic type for the elements of the queue
	 * @return the new queue after inserting the element {@code t} to the beginning of the queue 
	 */
    public Queue<T> enQueue(T t);
    
    /**
	 * 
	 * @return the new queue after removing the element from the beginning of the queue 
	 */
    public Queue<T> deQueue() throws Exception;
    
    /**
     * 
     * @return the head element of the queue
     * @throws Exception when queue is empty
     */
    public T head() throws Exception;
    
    /**
     * 
     * @return true when queue is empty, false otherwise
     */
    public boolean isEmpty();
}


/**
 * 
 */
package edu.depaul.operations.service;

import java.util.List;


/**
 * Used to interact with the operations db.
 * 
 * @author Paul A. Trzyna
 */
public interface OperationsService<Container> {

	/**
	 * Inserts a new Container instance or updates the existing one
	 * if it already exists.
	 * 
	 * @param container	container we want to save/update
	 */
	void store(Container container);

	/**
	 * Gets all Containers in the db
	 * 
	 * @return all containers in the db
	 */
	List<Container> getAll();
	
}

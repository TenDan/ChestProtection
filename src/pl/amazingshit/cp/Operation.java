package pl.amazingshit.cp;
/**
 * Represents operation result
 * @author DaAmazingShit
 */
public enum Operation {
	/**
	 * Returned if operation was successful.
	 */
	SUCCESS,
	/**
	 * Returned if property already exists *configuration*.
	 */
	ALREADY_EXISTS,
	/**
	 * Returned if operation failed.
	 */
	FAIL,
	/**
	 * Returned if container is not protected *configuration*.
	 */
	NOT_PROTECTED,
	/**
	 * Returned if player is not assigned to container *configuration*.
	 */
	NOT_IN_LIST,
}
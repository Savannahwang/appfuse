package org.appfuse.service;

import java.util.List;


/**
 * Business Delegate (Proxy) Interface to talk to persistence layer and
 * retrieve values for drop-down choice lists.
 *
 * <p>
 * <a href="LookupManager.java.html"><i>View Source</i></a>
 * </p>
 *
 * @author <a href="mailto:matt@raibledesigns.com">Matt Raible</a>
 * @version $Revision: 1.3 $ $Date: 2004/05/16 02:16:51 $
 */
public interface LookupManager {
    //~ Methods ================================================================

    /**
     * Retrieves all possible roles from persistence layer
     * @return ArrayList
     * @throws Exception
     */
    public List getAllRoles() throws Exception;
}

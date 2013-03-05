package com.temenos.interaction.core.resource;

import java.util.Collection;

import javax.ws.rs.core.GenericEntity;

import com.temenos.interaction.core.hypermedia.Link;

/**
 * A RESTResource is the base interface for all types of resources.
 * 
 * @author aphethean
 */
public interface RESTResource {

	/**
	 * Wrap this resource into a JAX-RS GenericEntity object
	 * @return GenericEntity object
	 */
	public GenericEntity<?> getGenericEntity();
	
	/**
	 * Return the links from this resource to another.
	 * @return Collection<Link>
	 */
    public Collection<Link> getLinks();

    /**
     * Called during resource building phase to set the links for
     * serialization by the provider.
     * @param links
     */
    public void setLinks(Collection<Link> links);

	/**
	 * Return the entity name for this resource.
	 * @return String
	 */
    public String getEntityName();

    /**
     * Called during resource building phase to set the entity name for 
     * use by the provider.
     * @param links
     */
    public void setEntityName(String entityName);

}  
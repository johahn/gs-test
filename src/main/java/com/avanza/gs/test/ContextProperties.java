package com.avanza.gs.test;

import java.util.Properties;

/**
 * Convenience class to use with PuConfigurers to avoid creating an anonymous subclass when setting context properties.
 *
 * @author Kristoffer Erlandsson (krierl)
 */
public class ContextProperties {

	private final Properties props = new Properties();

	public ContextProperties() {
	}

	/**
	 * Convenience constructor to add one property upon creation.
	 */
	public ContextProperties(String key, String value) {
		props.put(key, value);
	}

	public ContextProperties withProperty(String key, String value) {
		props.setProperty(key, value);
		return this;
	}

	public Properties getProperties() {
		return props;
	}
}

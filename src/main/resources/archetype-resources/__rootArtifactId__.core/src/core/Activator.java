#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package core;

import org.eclipse.core.runtime.Plugin;

public class Activator extends Plugin {

	private static Activator Instance;

	public Activator() {
		Instance = this;
	}
	
	public static Plugin getInstance(){
		return Instance;
	}
}

/**
 * 
 */
package com.mycompany.final_part3.inheritance;

/**
 * @author Maxi
 *
 */
public abstract class PersonBaseImpl implements Person {
	
	public String name;
	
	public PersonBaseImpl(String _name){
		name = _name;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getDetails() {
		return null;
	}
}




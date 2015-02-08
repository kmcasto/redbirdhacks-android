/**
 *  Mentor.java
 *  RedbirdHacks
 *
 *  Created by Andrew Erickson and MJ Havens in 2014.
 **/
package org.redbird.hacks;

import java.io.Serializable;
import java.util.List;

import android.util.Log;

public class Mentor implements Serializable, Comparable<Mentor> {

	private static final long serialVersionUID = -862821953832879532L;
	private String name;
	private String specialty;
	private List<ContactMethod> contactMethodsList;
	private String description;

	private ContactMethod contactMethod;

	public Mentor(String name, String specialty,
			ContactMethod contactMethod, String description) {
		super();
		this.name = name;
		this.specialty = specialty;
		this.contactMethod = contactMethod;
		this.description = description;

		// This is how you retrieve all of the contact methods for a mentor.
		//
		// for(int i = 0; i < contactMethodsList.size(); i++)
		// {
		// ContactMethod c = contactMethodsList.get(i);
		// Log.d("APP", "Contact method: " + c.getContactMethodType());
		// Log.d("APP", "Data: " + c.getContactActionURL());
		// }
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecialty() {
		return specialty;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ContactMethod getContactMethod() {
		return contactMethod;
	}

	public void setContactMethod(ContactMethod contactMethod) {
		this.contactMethod = contactMethod;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	@Override
	public int compareTo(Mentor another) {
		// If two mentors have the same expertise, then sort by name
		if (this.specialty.compareTo(another.getSpecialty()) == 0) {
			return this.name.compareTo(another.getName()) > 0 ? 1 : -1;
		}
		// If the expertises are different, then sort by expertise
		else if (this.specialty.compareTo(another.getSpecialty()) > 0) {
			return 1;
		}
		return -1;
	}
}

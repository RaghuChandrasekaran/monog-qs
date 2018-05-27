package com.github.raghuchandrasekaran.model;

public class ChildClass extends BaseClass {

	private String childProperty;

	public ChildClass() {
	}

	public ChildClass(String childProperty, String name) {
		super(name);
		this.childProperty = childProperty;
	}

	public String getChildProperty() {
		return childProperty;
	}

	public void setChildProperty(String childProperty) {
		this.childProperty = childProperty;
	}

	@Override
	public String toString() {
		return "ChildClass [childProperty=" + childProperty + ", getName()=" + getName() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((childProperty == null) ? 0 : childProperty.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChildClass other = (ChildClass) obj;
		if (childProperty == null) {
			if (other.childProperty != null)
				return false;
		} else if (!childProperty.equals(other.childProperty))
			return false;
		return true;
	}

}

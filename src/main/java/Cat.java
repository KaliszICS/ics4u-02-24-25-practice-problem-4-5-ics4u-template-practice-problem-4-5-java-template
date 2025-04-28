//overriding method

class Cat {
	private String name;
	private int age;

	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	//toString
	@Override //errors out if the method we are trying to override is not defined properly (wrong return types, parameters etc.)
	public String toString() {
		return this.name + ", " + this.age;
	}

	//equals
	@Override
	public boolean equals(Object obj) { //the original .equals uses an Object
		Cat cat = (Cat)obj; //typecast the object to our type
		if (cat.getName().equals(this.name) && cat.getAge() == this.age) {
			return true;
		}
		return false;
	}

	//clone

	@Override
	public Cat clone() {
		Cat cat = new Cat(this.name, this.age);
		return cat;
	}

}
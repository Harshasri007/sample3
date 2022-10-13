package org.phone;

public class InternalStorage {
public void internalStorage()
{
	System.out.println("64gb");
}
public static void main(String[] args) {
	ExternalStorage a=new ExternalStorage();
	InternalStorage b=new InternalStorage();
	a.externalStorage();
	b.internalStorage();
}
}

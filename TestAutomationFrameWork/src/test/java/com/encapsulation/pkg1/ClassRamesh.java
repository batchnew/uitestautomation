package com.encapsulation.pkg1;

public class ClassRamesh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassUmesh umesh =new ClassUmesh();
		umesh.setName("Suresh");
		umesh.setAge(10);
		System.out.println(umesh.getName());
		System.out.println(umesh.getAge());	
		
		System.out.println(umesh.getName().toString().toUpperCase());
		System.out.println(umesh.getName().toString().toLowerCase());
		String um =umesh.getName().toString();
		System.out.println(um.charAt(2));
		
		
	}

}

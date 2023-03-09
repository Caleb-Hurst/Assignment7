package com.coderscampus;


import java.util.List;

public class CustomListApp  {
	public static void main(String[] args) {
		CustomArrayList<String> myCustomList = new CustomArrayList<>();
			myCustomList.add("Journee Audrea");
			myCustomList.add("Rodolph Rosalin");
			myCustomList.add("Kim Colene");
			myCustomList.add("Lemoine Zenia");
			myCustomList.add("Easton Archie");
			myCustomList.add("Julyan Digby");
			myCustomList.add("Nigellus Farley");
			myCustomList.add("Cymone Christabella");
			myCustomList.add("Benjy Ainslie");
			myCustomList.add("Gabriella Zelda");
			myCustomList.add("Kaelea Alisha");
			for(int i = 0 ; i < myCustomList.getSize(); i++) {
				System.out.println(myCustomList.get(i));
			}
			
		
	}
}

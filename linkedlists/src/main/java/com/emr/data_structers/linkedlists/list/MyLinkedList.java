package com.emr.data_structers.linkedlists.list;

import com.emr.data_structers.linkedlists.node.Customer;

public class MyLinkedList {

	Customer ilk;
	Customer son;
	
	void addLast(Customer eklenecek){
		if (ilk==null) {
			ilk=eklenecek;
			son=eklenecek;
		}else {
			son.setSonraki(eklenecek);
			son=eklenecek;
		}
	}
	
	boolean hasNext() {
		
		if(ilk!=null)
			return ilk.getSonraki()==null;
		else
			return false;
	}
	
	int size() {
		int sayac=0;
		Customer ilkCustomer=ilk;
		
		if(ilkCustomer!=null) {
			
			do {
				sayac++;
				ilkCustomer=ilkCustomer.getSonraki();
			} while (hasNext());
			
			
			return sayac;
		}else
			return sayac;
	}

	
	public Customer getIlk() {
		return ilk;
	}
}

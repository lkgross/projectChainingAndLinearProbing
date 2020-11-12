package com.company;

public class HashTest {
	static ChainHashMap<String,Student> chainTable = new ChainHashMap<>(20);	
	static ProbeHashMap<String,Student> probeTable = new ProbeHashMap<>(20);
	
	 static void bothChainandLinearProbing(Student rec) {
		System.out.println("For the username key: "+rec.username);
		chainTable.put(rec.username, rec);
		System.out.println("Chain Method hash value: "+chainTable.hashValue(rec.username));
		probeTable.put(rec.username, rec);
		int h = probeTable.hashValue(rec.username);
		System.out.println("Linear Probe Method hash value: "+ h);
		System.out.println("Linear Probe Method assigned slot: "+probeTable.getSlot(h,rec.username));
				
	}

	public static void main(String[] args) {
				
		Student myRec = new Student("jsmith","John","Smith","Computer Science","Bridgewater State University","Baseball");
		bothChainandLinearProbing(myRec);
				
		myRec = new Student("jdoe","Jane","Doe","Computer Engineering","Umass Boston","Basketball");
		bothChainandLinearProbing(myRec);
		
		myRec = new Student("ncox","Nancy","Cox","Biology","Umass Dartmouth","hiking");
		bothChainandLinearProbing(myRec);
		
		myRec = new Student("sboyd","Stephen","Boyd","Geology","Umass Amherst","reading");
		bothChainandLinearProbing(myRec);
		
		myRec = new Student("gfreeman","George","Freeman","Social Work","Fitchburg State University","softball");
		bothChainandLinearProbing(myRec);
		
		myRec = new Student("rdavis","Rachel","Davis","theater","Umass Amherst","football");
		bothChainandLinearProbing(myRec);
		
		myRec = new Student("bmiller","Brian","Miller","theater","Umass Amherst","dancing");
		bothChainandLinearProbing(myRec);
		
		myRec = new Student("kpeterso","Kelly","Peterson","English","Framingham State","Hockey");
		bothChainandLinearProbing(myRec);
		
		myRec = new Student("rbolton","Ryan","Bolton","Mechanical Engineering","Umass Lowell","Jogging");
		bothChainandLinearProbing(myRec);
		
		myRec = new Student("kball","Kyle","Ball","Education","Salem State University","tennis");
		bothChainandLinearProbing(myRec);
					
		System.out.println(chainTable.get("jdoe"));
		chainTable.get("jdoe").print();
		System.out.println(chainTable.entrySet());
		System.out.println(probeTable.get("jdoe"));
		probeTable.get("jdoe").print();
		System.out.println(probeTable.entrySet());
		chainTable.remove("jdoe");
		Student r = chainTable.get("jdoe");
		if (r!=null)
			r.print();
		else
		    System.out.println("The student is not in the lookup table!");	
		System.out.println(chainTable.entrySet());
		probeTable.remove("jdoe");
		r = probeTable.get("jdoe");
		if (r!=null)
			r.print();
		else
			System.out.println("The student is not in the lookup table!");
		System.out.println(probeTable.entrySet());
	}

}

rule MatchName
  match s : left!info
  with t : right!info {

	compare:  s.firstname+ " " +s.lastname == t.fullname or s.phone.forAll(sp|sp = (t.phone.at(s.phone.indexOf(sp))))

}

/* 
 for (i in s.phone.size()){
	  	for(j in t.phone.size()){
			  if (s.phone[i] == t.phone[j]){
			  	return true;
			  }else{
			  return false;
			  }
		  }
	 } 
}
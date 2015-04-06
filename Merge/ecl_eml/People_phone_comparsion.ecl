rule MatchName
  match s : left!info
  with t : right!info {

<<<<<<< HEAD
//	compare:  s.firstname+ " " +s.lastname == t.fullname or s.phone.forAll(sp|sp = (t.phone.at(s.phone.indexOf(sp))))
	compare{
		if(s.firstname+ " " +s.lastname == t.fullname){
		return true;
		}else{
			for (i in s.phone){
			  	for(j in t.phone){
					  if (i==j){
					  return true;
					  }
				  }
			 } 
		}
		return false;
	}
=======
	compare:  s.firstname+ " " +s.lastname == t.fullname 
		or s.phone.forAll(sp|sp = (t.phone.at(s.phone.indexOf(sp))))

>>>>>>> origin/master
}


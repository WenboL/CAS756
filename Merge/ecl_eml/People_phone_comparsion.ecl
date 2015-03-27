rule MatchName
  match s : left!info
  with t : right!info {
  
  compare {
    return s.firstname +" "+ s.lastname = t.fullname;
  }
}


rule Matchnumber
  match s : left!info
  with t : right!info {
  
  compare {
    return s.phone = t.phone;
  }
}
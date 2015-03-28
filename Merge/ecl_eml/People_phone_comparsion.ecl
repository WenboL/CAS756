rule MatchName
  match s : left!info
  with t : right!info {
  
  compare {
    return s.firstname +" "+ s.lastname = t.fullname or s.phone = t.phone;
  }
}

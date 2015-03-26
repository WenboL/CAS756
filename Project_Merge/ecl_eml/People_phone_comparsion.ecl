rule Matchlastname
  match s : model1!info
  with t : model2!info {
  
  compare {
    return s.lastname = t.lastname;
  }
}
rule Matchfirstname
  match s : model1!info
  with t : model2!info {
  
  compare {
    return s.firstname = t.firstname;
  }
}
rule Matchnumber
  match s : model1!info
  with t : model2!info {
  
  compare {
    return s.phone = t.phone;
  }
}
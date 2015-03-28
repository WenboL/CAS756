rule MatchName
  match s : left!info
  with t : right!info {
  
  compare :  s.firstname+ " " +s.lastname = t.fullname or s.phone[0]=t.phone[0]


  
}
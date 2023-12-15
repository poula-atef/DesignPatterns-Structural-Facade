# ايه هو البرنامج ده؟
- البرنامج ده هو عباره عن مثال لل Facade Design Pattern باستخدام لغة java
# بنستخدم امتي ال Design Pattern ده؟
- بنستخدم ال design pattern ده لما اكون عايز اخفي handling بتاع جزء معين في ال code او اني اضيف third party library و مش عايزها تبقي tightly coupled مع ال application عشان لو استخدمتها في اماكن كتيره في نفس ال application .. ف بقوم بعمل class احط فيه كل ال handling عشان يكون استخدام ال library دي في المكان ده فقط ..
  مثلا المثال اللي في ال application احنا عندنا third party library هي ال ATM و دي و ليها handling كتير عشان كده مش افضل حل اني اخلي ال handling ده يتكرر في ال application مع كل استخدام لل ATM عشان كده عملنا ATMFacade عشان يخفي ال handling بتاع ال logic الخاص بال ATM.
# بيتكون من ايه البرنامج ده ؟
- ال package بتاعت ال entities:
  - ال package بتاعت ال third_party_library:
    - ال ATM Class و ده ال third party library
    - ال BankAccount Class و ده class بيعبر عن الحساب الشخصي للعميل
  - ال ATMFacade Class و ده ال Facade لل ATM library.

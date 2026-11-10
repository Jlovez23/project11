## mermaid uml
```
classDiagram

class HasMenu{
    + menu() String
    + start() void
}

class CheckingAccount{
    - balance : double
    + CheckingAccount()
    + CheckingAccount(balance)
    + main() : void
    + start() : string
    + getBalance() : double
    + getBalanceString() : string
    + setBalance(balance) : void
    + checkBalance() : double
    - getDouble() : double
    + makeDeposit() : void
    + makeWithdrawal() : void
}

class SavingsAccount{
    - interestRate: double
    + main(*)
    + calcinterest() : void
    + setinterestRate() : void
    + getinterestRate() : void
}

class Customer{
    - checking : CheckingAccount
    - savings : SavingsAccount 
    + main() : void
    + Customer()
    + start() void
    + menu() : String
    + changePIN() : void
    + getReport() : String
}

class User Abstract{
    - userName : String
    - PIN : String
    + login : boolean
    + login(userName, PIN) : boolean
    + setUserName(userName) : void
    + getUserName() : String
    + setPIN(PIN) : void
    + getPIN() : String
    + getReport() : (abstract) String
}

class Admin{
    Admin()
    Menu() String
    getReport() String
}

class Bank{
    - admin Admin
    - customers ArrayList
    + Bank()
    + main() void
    + loadSampleCustomers() void
    + loadCustomers() void
    + saveCustomer() void
    + fullCustomerReport() void
    + addUser() void
    + applyInterest() void
    + loginAsCustomer() void
    + menu() void
    + start() void
    + startAdmin() void
}

CheckingAccount --> HasMenu
User Abstract-->HasMenu
SavingsAccount --|> CheckingAccount
Customer --|> User Abstract
Admin  --|> User Abstract
Bank --> Customer
Bank --> Admin
```



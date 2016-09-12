#[condition][]Номер счета равен "{test}"=CashFlow(accountNo == {test}, $amount : amount)
[condition][]Для счета=CashFlow($accountNo : accountNo, $amount : amount)
#[consequence][]Напечатать сумму=System.out.println("Сумма:" + $amount);
[consequence][]Напечатать сумму=$amount += 1.0;

[condition][]Всегда=eval(true) && CashFlow($amount : amount)
[consequence][]Напечатать "{слово}"=$amount += 1.0;

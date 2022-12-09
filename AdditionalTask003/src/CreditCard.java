public class CreditCard {
    private long cardId;
    private int pinCode;
    private double balance;
    private double creditLimit;
    private double debt;

    public CreditCard(long cardId,
                       int pinCode)
    {
        this.cardId = cardId;
        this.pinCode = pinCode;
        this.balance = 0;
        this.creditLimit = 1000;
        this.debt = 0;
    }

    public void deposit(int pincode, double sum)
    {
        if(isDataInvalid(pincode, sum))
        {
            return;
        }
        this.balance += repayLoan(sum);
    }

    public void withdraw(int pincode, double sum)
    {
        if(isDataInvalid(pincode, sum))
        {
            return;
        }
        if(isBalanceEnought(sum))
        {
            this.balance -= sum;
            return;
        }
        if(isEnoughtWithCredit(sum))
        {
            this.debt = sum - this.balance;
            this.balance = 0;
        }
    }

    private boolean isBalanceEnought(double sum)
    {
        if(sum <= this.balance)
        {
            return true;
        }
        return false;
    }

    private boolean isEnoughtWithCredit(double sum)
    {
        if(sum <= this.balance + this.creditLimit)
        {
            return true;
        }
        return false;
    }

    public void setCreditLimit(int pincode, double sum)
    {
        if(isDataInvalid(pincode, sum))
        {
            return;
        }
        this.creditLimit = sum;
    }

    private boolean isDataInvalid(int pincode, double sum)
    {
        if(isPinCodeInvalid(pincode))
        {
            showPinInvalid();
            return true;
        }
        if(isSumInvalid(sum))
        {
            showSumInvalid();
            return true;
        }
        return false;
    }

    private boolean isPinCodeInvalid(int pinCode)
    {
        if(pinCode != this.pinCode)
        {
            return true;
        }
        return false;
    }

    private boolean isSumInvalid(double sum)
    {
        if(0 > sum)
        {
            return true;
        }
        return false;
    }

    private double repayLoan(double sum)
    {
        double remains = sum;
        if(isDebtExist())
        {
            if(sum >= this.debt)
            {
                remains = sum - this.debt;
                this.debt = 0;
            }
            else
            {
                remains = 0;
                this.debt -= sum;
            }
        }
        return remains;
    }

    private boolean isDebtExist()
    {
        if(0 < this.debt)
        {
            return true;
        }
        return false;
    }

    private void showPinInvalid()
    {
        System.out.println("Pin code is invalid!");
    }

    private void showSumInvalid()
    {
        System.out.println("Sum is 0 or negative value!");
    }

    public void showCardData()
    {
        System.out.println("credit card Id : " + this.cardId);
        System.out.println("credit card balance : " + this.balance);
        System.out.println("credit card credit limit : " + this.creditLimit);
        System.out.println("credit card debt : " + this.debt);
    }
}
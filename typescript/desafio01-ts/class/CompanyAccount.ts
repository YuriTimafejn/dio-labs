import { DioAccount } from "./DioAccount"

export class CompanyAccount extends DioAccount {

  public constructor(name: string, accountNumber: number){
    super(name, accountNumber)
  }

  public getLoan (amount: number): void {
    this.deposit(amount);
  }
}

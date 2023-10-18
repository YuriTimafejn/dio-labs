import { DioAccount } from "./DioAccount";

export class ChallengerAccount extends DioAccount {
    constructor(name: string, accountNumber: number) {
        super(name, accountNumber)
    }

    public deposit (amount: number) : boolean | void {
        return super.deposit(amount + 10);
    }
}
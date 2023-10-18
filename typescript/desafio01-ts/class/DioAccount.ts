export abstract class DioAccount {
  private name: string
  private readonly accountNumber: number
  private balance: number = 0
  private status: boolean = true

  constructor(name: string, accountNumber: number){
    this.name = name
    this.accountNumber = accountNumber
  }

  setName = (name: string): void => {
    this.name = name
    console.log('Nome alterado com sucesso!')
  }

  getName = (): string => {
    return this.name
  }

  deposit(amount: number): boolean | void {
    if(amount < 0) {
      throw new Error('Não é possível realizar depósito de valores negativos');
    }
    if(this.validateStatus()){
      this.balance += amount;
      return true;
    }
  }

  withdraw = (amount: number): boolean | void => {
    if(this.validateStatus()) {
      if(this.getBalance() < amount) {
        throw new Error('Valor insulficiente para realizar a operação');
      }

      this.balance -= amount;
      return true;
    }
  }

  getBalance = (): number => {
    return this.balance;
  }

  protected validateStatus = (): boolean => {
    if (this.status) {
      return this.status
    }

    throw new Error('Conta inválida')
  }

  public endAccount(): void {
    this.status = false;
  }
}

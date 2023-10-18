import {describe, expect, test} from '@jest/globals';
import { PeopleAccount } from '../class/PeopleAccount';

let accountPeople: PeopleAccount | null = null;

beforeEach(() => {
    accountPeople = new PeopleAccount(123456, "Usuario Teste", 4001);
})

afterEach(() => {
    accountPeople = null;
});

describe('DioAccout Tests Method deposit', () => {
    test('deposit $100', () => {
        accountPeople?.deposit(100);
        expect(accountPeople?.getBalance()).toBe(100);
    });

    test('deposit negative value', () => {
        expect(() => accountPeople?.deposit(-20)).toThrowError('Não é possível realizar depósito de valores negativos');
    })
});

describe('DioAccount Test Method Withdraw', () => {
    test('withdraw 10 with 100 in account', () => {
        accountPeople?.deposit(100);
        expect(accountPeople?.withdraw(10)).toBeTruthy();
    });

    test('withdraw without founds', () => {
        expect(() => accountPeople?.withdraw(101)).toThrowError('Valor insulficiente para realizar a operação');
    })

    test('withdraw in an invalid account', () => {
        accountPeople?.endAccount();
        expect(() => accountPeople?.withdraw(5)).toThrowError('Conta inválida');
    });
})
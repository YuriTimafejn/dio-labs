import {describe, expect, test} from '@jest/globals';
import { PeopleAccount } from '../class/PeopleAccount';
import { CompanyAccount } from '../class/CompanyAccount';

let accoutPeople: PeopleAccount;
let accoutCompany: CompanyAccount;

beforeEach(() => {
    accoutPeople = new PeopleAccount(123456, "Usuario Teste", 4001);
    accoutCompany = new CompanyAccount("Test company", 4224);
})

describe('DioAccout Tests Method deposit', () => {
    test('deposit $100', () => {
        accoutPeople.deposit(100);
        expect(accoutPeople.getBalance()).toBe(100);
    });

    test('deposit negative value', () => {
        accoutPeople.deposit(-20);
        expect(accoutPeople.getBalance()).toThrowError();
    })
});

describe('DioAccount Test Method Withdraw', () => {
    test('withdraw 10 with 100 in account', () => {
        accoutPeople.deposit(100);
        expect(accoutPeople.withdraw(10)).toBeFalsy();
    });

    test('withdraw without founds', () => {
        accoutPeople.deposit(100);
        expect(accoutPeople.withdraw(101)).toBeFalsy();
    })
})
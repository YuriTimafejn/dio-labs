import {describe, expect, test} from '@jest/globals';
import { CompanyAccount } from '../class/CompanyAccount';

let companyAccount: CompanyAccount | null = null;

beforeEach(() => {
    companyAccount = new CompanyAccount("Company Test", 2702);
});

afterEach(() => {
    companyAccount = null;
});

describe('CompanyAccount Test Loan', () => {
    test('loan to an unavailable client', () => {
        companyAccount?.endAccount();
        expect(() => companyAccount?.getLoan(100)).toThrowError('Conta inválida');
    });

    test('loan of 5000 to an available client', () => {
        companyAccount?.getLoan(5000);
        expect(companyAccount?.getBalance()).toBe(5000);
    });
});
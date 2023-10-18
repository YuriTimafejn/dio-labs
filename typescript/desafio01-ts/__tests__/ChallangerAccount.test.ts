import { describe, expect, test } from '@jest/globals';
import { ChallengerAccount } from '../class/ChallengerAccount';

let challengerAccount: ChallengerAccount | null = null;

beforeEach(() => {
    challengerAccount = new ChallengerAccount('Challenger Test', 123456);
});

afterEach(() => {
    challengerAccount = null;
});

describe('Challenger Acount Test', () => {
    test('test valid deposit', () => {
        challengerAccount?.deposit(100);
        expect(challengerAccount?.getBalance()).toBe(110);
    });

    test('test deposit for an invalid account', () => {
        challengerAccount?.endAccount();
        expect(()=> challengerAccount?.deposit(10)).toThrowError('Conta inválida');
    });
});

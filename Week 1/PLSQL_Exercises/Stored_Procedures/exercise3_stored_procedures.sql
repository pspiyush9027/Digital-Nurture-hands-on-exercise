SET SERVEROUTPUT ON;

CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest
IS
BEGIN
    UPDATE accounts
       SET balance = balance + (balance * 0.01)
     WHERE account_type = 'SAVINGS';

    DBMS_OUTPUT.PUT_LINE('Monthly interest applied to all savings accounts.');
    COMMIT;
END;
/

CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
    p_department_id   IN employees.department_id%TYPE,
    p_bonus_percent   IN NUMBER
)
IS
BEGIN
    UPDATE employees
       SET salary = salary + (salary * p_bonus_percent / 100)
     WHERE department_id = p_department_id;

    DBMS_OUTPUT.PUT_LINE(
        'Bonus updated for department ' || p_department_id ||
        ' with bonus percentage ' || p_bonus_percent || '%'
    );
    COMMIT;
END;
/

CREATE OR REPLACE PROCEDURE TransferFunds (
    p_from_account_id   IN accounts.account_id%TYPE,
    p_to_account_id     IN accounts.account_id%TYPE,
    p_amount            IN NUMBER
)
IS
    v_source_balance   accounts.balance%TYPE;
BEGIN
    SELECT balance
      INTO v_source_balance
      FROM accounts
     WHERE account_id = p_from_account_id
     FOR UPDATE;

    IF v_source_balance < p_amount THEN
        DBMS_OUTPUT.PUT_LINE('Transfer failed: insufficient balance.');
    ELSE
        UPDATE accounts
           SET balance = balance - p_amount
         WHERE account_id = p_from_account_id;

        UPDATE accounts
           SET balance = balance + p_amount
         WHERE account_id = p_to_account_id;

        DBMS_OUTPUT.PUT_LINE(
            'Transfer successful. Amount ' || p_amount ||
            ' moved from account ' || p_from_account_id ||
            ' to account ' || p_to_account_id
        );
        COMMIT;
    END IF;
END;
/

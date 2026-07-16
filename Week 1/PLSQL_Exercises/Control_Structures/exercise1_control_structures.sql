SET SERVEROUTPUT ON;

DECLARE
    CURSOR customer_loan_cursor IS
        SELECT c.customer_id,
               c.date_of_birth,
               l.loan_id,
               l.interest_rate
        FROM customers c
        JOIN loans l
          ON c.customer_id = l.customer_id;

    v_age NUMBER;
BEGIN
    FOR customer_loan_rec IN customer_loan_cursor LOOP
        v_age := TRUNC(MONTHS_BETWEEN(SYSDATE, customer_loan_rec.date_of_birth) / 12);

        IF v_age > 60 THEN
            UPDATE loans
               SET interest_rate = interest_rate - 1
             WHERE loan_id = customer_loan_rec.loan_id;

            DBMS_OUTPUT.PUT_LINE(
                'Discount applied to loan ' || customer_loan_rec.loan_id ||
                ' for customer ' || customer_loan_rec.customer_id
            );
        END IF;
    END LOOP;

    COMMIT;
END;
/

DECLARE
    CURSOR customer_balance_cursor IS
        SELECT customer_id, balance
        FROM customers;
BEGIN
    FOR customer_rec IN customer_balance_cursor LOOP
        IF customer_rec.balance > 10000 THEN
            UPDATE customers
               SET isvip = 'TRUE'
             WHERE customer_id = customer_rec.customer_id;

            DBMS_OUTPUT.PUT_LINE(
                'VIP status given to customer ' || customer_rec.customer_id
            );
        END IF;
    END LOOP;

    COMMIT;
END;
/

DECLARE
    CURSOR due_loan_cursor IS
        SELECT c.customer_id,
               c.name AS customer_name,
               l.loan_id,
               l.due_date
        FROM customers c
        JOIN loans l
          ON c.customer_id = l.customer_id
        WHERE l.due_date BETWEEN SYSDATE AND SYSDATE + 30;
BEGIN
    FOR due_loan_rec IN due_loan_cursor LOOP
        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Loan ' || due_loan_rec.loan_id ||
            ' for customer ' || due_loan_rec.customer_name ||
            ' is due on ' || TO_CHAR(due_loan_rec.due_date, 'DD-MON-YYYY')
        );
    END LOOP;
END;
/

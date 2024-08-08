DECLARE
    CURSOR customer_cursor IS
        SELECT customer_id, loan_interest_rate, age
        FROM customers
        WHERE age > 60;
    v_customer_id customers.customer_id%TYPE;
    v_loan_interest_rate customers.loan_interest_rate%TYPE;
BEGIN
    OPEN customer_cursor;
    LOOP
        FETCH customer_cursor INTO v_customer_id, v_loan_interest_rate;
        EXIT WHEN customer_cursor%NOTFOUND;

        -- Apply 1% discount
        v_loan_interest_rate := v_loan_interest_rate * 0.99;

        -- Update the customer's loan interest rate
        UPDATE customers
        SET loan_interest_rate = v_loan_interest_rate
        WHERE customer_id = v_customer_id;
    END LOOP;
    CLOSE customer_cursor;
    
    COMMIT;
END;
/

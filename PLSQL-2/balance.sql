CREATE OR REPLACE FUNCTION HasSufficientBalance(account_id NUMBER, amount NUMBER) 
RETURN BOOLEAN 
IS
    v_balance NUMBER;
BEGIN
    SELECT balance INTO v_balance
    FROM accounts
    WHERE account_id = account_id;

    IF v_balance >= amount THEN
        RETURN TRUE;
    ELSE
        RETURN FALSE;
    END IF;
END;
/

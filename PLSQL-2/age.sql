CREATE OR REPLACE FUNCTION CalculateAge(dob DATE) 
RETURN NUMBER 
IS
    v_age NUMBER;
BEGIN
    v_age := FLOOR(MONTHS_BETWEEN(SYSDATE, dob) / 12);
    RETURN v_age;
END;
/

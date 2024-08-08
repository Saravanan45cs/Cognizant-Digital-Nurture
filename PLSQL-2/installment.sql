CREATE OR REPLACE FUNCTION CalculateMonthlyInstallment(
    loan_amount NUMBER, 
    annual_interest_rate NUMBER, 
    loan_duration_years NUMBER
) 
RETURN NUMBER 
IS
    v_monthly_rate NUMBER;
    v_num_payments NUMBER;
    v_monthly_installment NUMBER;
BEGIN
    v_monthly_rate := annual_interest_rate / 12 / 100;
    v_num_payments := loan_duration_years * 12;

    -- Formula for EMI calculation
    v_monthly_installment := loan_amount * v_monthly_rate / 
                             (1 - POWER(1 + v_monthly_rate, -v_num_payments));

    RETURN v_monthly_installment;
END;
/

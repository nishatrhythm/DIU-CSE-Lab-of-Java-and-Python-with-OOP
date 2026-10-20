score = 85

if score >= 90:
    grade = "A"
elif score >= 80:
    grade = "B"
elif score >= 70:
    grade = "C"
elif score >= 60:
    grade = "D"
else:
    grade = "F"

print(f"Score: {score} -> Grade: {grade}")

attendance = 78
if attendance >= 75:
    if score >= 50:
        status = "Eligible for final exam"
    else:
        status = "Failed internal evaluation"
else:
    status = "Debarred due to low attendance"

print(f"Exam Status: {status}")

result = "Passed" if score >= 40 else "Failed"
print(f"Ternary Result: {result}")
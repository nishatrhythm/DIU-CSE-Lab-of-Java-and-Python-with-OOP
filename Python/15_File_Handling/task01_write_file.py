file_name = "students.csv"
content = "ID,Name,Department,CGPA\n101,Rahim,CSE,3.85\n102,Karim,SWE,3.72\n103,Nusrat,EEE,3.90\n"

with open(file_name, "w") as file:
    file.write(content)

print(f"Data successfully written to {file_name}")
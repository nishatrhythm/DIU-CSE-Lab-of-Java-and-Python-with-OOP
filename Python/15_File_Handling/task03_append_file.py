file_name = "students.csv"
new_entry = "104,Tamim,Civil,3.60\n"

with open(file_name, "a") as file:
    file.write(new_entry)

print("Appended record to file.\nUpdated Contents:")

with open(file_name, "r") as file:
    for line in file:
        print(line.strip())
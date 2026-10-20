file_name = "students.csv"

try:
    with open(file_name, "r") as file:
        lines = file.readlines()

    print(f"Reading from {file_name}:")
    for line in lines:
        row = line.strip().split(",")
        print(f"{row[0]:<6} | {row[1]:<12} | {row[2]:<8} | {row[3]:<6}")

except FileNotFoundError:
    print(f"File {file_name} not found. Please run write_file.py first.")
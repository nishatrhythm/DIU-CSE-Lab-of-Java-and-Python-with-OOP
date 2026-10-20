user_name = input("Enter student name: ")
user_id = input("Enter student ID: ")
user_score = float(input("Enter marks: "))

print("Printing with default separator:")
print("Name:", user_name, "ID:", user_id, "Score:", user_score)

print("\nPrinting with custom separator and end:")
print(user_name, user_id, user_score, sep=" | ", end="\n\n")

formatted_message = f"Student {user_name} (ID: {user_id}) achieved {user_score:.2f}% marks."
print(formatted_message)
text = "  Object Oriented Programming in Python  "

print("Original text:", repr(text))
print("Stripped:", repr(text.strip()))
print("Lower case:", text.strip().lower())
print("Upper case:", text.strip().upper())
print("Title case:", text.strip().title())

print("Length of string:", len(text))
print("First character:", text.strip()[0])
print("Last character:", text.strip()[-1])
print("Substring slicing [0:6]:", text.strip()[0:6])
print("Reversed string [::-1]:", text.strip()[::-1])

print("Count of 'o':", text.lower().count("o"))
print("Find 'Python':", text.find("Python"))
print("Starts with '  Obj':", text.startswith("  Obj"))
print("Ends with 'on  ':", text.endswith("on  "))

replaced = text.strip().replace("Python", "Java & Python")
print("Replaced text:", replaced)

csv_line = "101,Ayesha,CSE,3.85"
tokens = csv_line.split(",")
print("Split into tokens:", tokens)

joined_text = " - ".join(tokens)
print("Joined back with '-':", joined_text)

item_name = "Laptop"
price = 750.50
print(f"Product: {item_name:>10} | Price: ${price:.2f}")
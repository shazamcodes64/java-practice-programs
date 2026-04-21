# Program to check whether a person can vote based on age

age = int(input("Enter your age: "))

if age >= 18:
    print(f"The person's age is {age} and can vote.")
else:
    print(f"The person's age is {age} and cannot vote.")

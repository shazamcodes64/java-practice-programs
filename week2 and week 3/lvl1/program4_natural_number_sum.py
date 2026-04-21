# Program to check for natural number and calculate sum of n natural numbers

number = int(input("Enter a number: "))

if number > 0:
    sum_of_natural = number * (number + 1) // 2
    print(f"The sum of {number} natural numbers is {sum_of_natural}")
else:
    print(f"The number {number} is not a natural number")
